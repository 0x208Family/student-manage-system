package edu.tyut.aspect;

import edu.tyut.bean.RegisterAdapter;
import edu.tyut.bean.SubjectEntity;
import edu.tyut.bean.mbg.*;
import edu.tyut.service.*;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 16202
 */
@Component
@Aspect
public class RegisterAspect {

    private static final Logger logger = Logger.getLogger(RegisterAspect.class);

    private ProvinceService provinceService;

    private CityService cityService;

    private CountyService countyService;

    private EthnicService ethnicService;

    private StudentService studentService;

    private TeacherService teacherService;

    private PoliticalStatusService politicalStatusService;

    public RegisterAspect(ProvinceService provinceService, CityService cityService,
                          CountyService countyService, EthnicService ethnicService,
                          StudentService studentService, TeacherService teacherService,
                          PoliticalStatusService politicalStatusService) {
        this.provinceService = provinceService;
        this.cityService = cityService;
        this.countyService = countyService;
        this.ethnicService = ethnicService;
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.politicalStatusService = politicalStatusService;
    }

    /**
     *  处理来自页面的发送的验证码信息
     *
     * @param pjp aop
     * @return    以bootstrapValidator所能接受的形式返回json数据
     */
    @Around("execution(* edu.tyut.controller.RegisterController.*Verify(..))")
    public Map<String, Boolean> idVerify(ProceedingJoinPoint pjp) {
        RegisterAdapter obj = (RegisterAdapter) pjp.getArgs()[0];
        Map<String, Boolean> map = new HashMap<>(1);
        map.put("valid", false);

        // validate threshold
        if (((String) obj.uniqueKey()).length() != obj.primaryKeyCheckThresholdLength()) {
            map.put("valid", false);
            return map;
        }
        if (obj.registerObject() == Student.class) {
            map.put("valid", studentService.queryById((String) obj.uniqueKey()) == null);
        } else { //teacher
            map.put("valid", teacherService.queryById((String) obj.uniqueKey()) == null);
        }
        return map;
    }

    /**
     * 保存注册的用户信息
     *
     * @param pjp aop
     * @return    true或false对应的字符串
     */
    @Around("execution(* edu.tyut.controller.RegisterController.save*(..))")
    public boolean save(ProceedingJoinPoint pjp) {
        SubjectEntity obj = (SubjectEntity) pjp.getArgs()[0];
        try {
            if (logger.isDebugEnabled()) {
                logger.debug("正在进行: " + obj.uniqueKey() + " 对象的数据校验");
            }
            pjp.proceed(pjp.getArgs());
            if (logger.isDebugEnabled()) {
                logger.debug("正在保存注册信息");
            }
//            if (obj.getClass() == Student.class) {
//                studentService.insert((Student) obj);
//            } else {
//                teacherService.insert((Teacher) obj);
//            }
            return true;
        } catch (Throwable th) {
            logger.error(th.getMessage(), th.getCause());
        }
        return false;
    }

    /**
     * Initialize all element for select tag in register page
     *
     * @param pjp join point
     * @return    view page
     */
    @Around("execution(* edu.tyut.controller.RegisterController.*Register(..))")
    public String pageElementInitialize(ProceedingJoinPoint pjp) {
        Model model = (Model) pjp.getArgs()[0];
        Integer pid = (Integer) pjp.getArgs()[1];
        String cnm = (String) pjp.getArgs()[2];

        Province province = provinceService.selectById(pid);
        List<City> cities = cityService.selectCities(province.getProvinceCode());

        model.addAttribute("provinceList", provinceService.selectProvinces());
        model.addAttribute("cityList", cities);
        model.addAttribute("countyList", countyService.selectCounties(cities.get(0).getCityCode()));
        model.addAttribute("ethnicList", ethnicService.selectEthnic());
        model.addAttribute("statusList", politicalStatusService.selectPoliticalStatus());

        try {
            return (String) pjp.proceed(pjp.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    /**
     * 请求更新所有的县区选择框
     *
     * @param pjp aop
     * @return    符合条件的所有的县区值
     */
    @Around("execution(* edu.tyut.controller.RegisterController.requestCounty(..))")
    public List<County> requestCounty(ProceedingJoinPoint pjp) {
        Integer pid = (Integer) pjp.getArgs()[0];
        String cnm = (String) pjp.getArgs()[1];
        Province province = provinceService.selectById(pid);
        City city = cityService.selectCityByProvinceCodeAndCityName(province.getProvinceCode(), cnm);
        return countyService.selectCounties(city.getCityCode());
    }

    /**
     * 请求更新所有的城市选择框
     *
     * @param pjp aop
     * @return    符合条件的所有的城市
     */
    @Around("execution(* edu.tyut.controller.RegisterController.requestCity(..))")
    public List<City> requestCity(ProceedingJoinPoint pjp) {
        Integer pid = (Integer) pjp.getArgs()[0];
        Province province = provinceService.selectById(pid);
        return cityService.selectCities(province.getProvinceCode());
    }
}
