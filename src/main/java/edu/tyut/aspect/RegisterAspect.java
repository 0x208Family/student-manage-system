package edu.tyut.aspect;

import edu.tyut.bean.RegisterInformation;
import edu.tyut.bean.mgb.*;
import edu.tyut.service.*;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Aspect
public class RegisterAspect {

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
                          PoliticalStatusService politicalStatusService)
    {
        this.provinceService = provinceService;
        this.cityService = cityService;
        this.countyService = countyService;
        this.ethnicService = ethnicService;
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.politicalStatusService = politicalStatusService;
    }

    @Around("execution(* edu.tyut.controller.RegisterController.*Verify(..))")
    public Map<String, Boolean> idVerify(ProceedingJoinPoint pjp) {
        Map<String, Boolean> map = new HashMap<>();
        RegisterInformation obj = (RegisterInformation) pjp.getArgs()[0];
        System.out.println(obj);

        // verify threshold
        if (obj.getKey().length() != obj.keyLength()) {
            map.put("valid", false);
            return map;
        }
        if (obj.getClass() == Teacher.class) {
            TeacherExample te = new TeacherExample();
            TeacherExample.Criteria tc = te.createCriteria();
            tc.andTeacherIdEqualTo(((Teacher) obj).getTeacherId());
            map.put("valid", teacherService.selectByExample(te).size() == 0);
        } else {
            StudentExample se = new StudentExample();
            StudentExample.Criteria sc = se.createCriteria();
            sc.andStudentIdEqualTo(((Student) obj).getStudentId());
            map.put("valid", studentService.selectByExample(se).size() == 0);
        }
        return map;
    }

    @Around("execution(* edu.tyut.controller.RegisterController.save*(..))")
    public String registerVerify(ProceedingJoinPoint pjp) {
        RegisterInformation obj = (RegisterInformation) pjp.getArgs()[0];
        BindingResult result = (BindingResult) pjp.getArgs()[1];

        // assume data
        if (result.hasErrors()) {
            System.out.println("form data has errors");
            return "false";
        }
        System.out.println(obj);
        // save to database
//        if (obj.getClass() == Teacher.class) {
//            return (teacherService.insert((Teacher) obj) != 0) + "";
//        } else { // submit by student
//            return (studentService.insert((Student) obj) != 0) + "";
//        }
        return "false";
    }

    @Around("execution(* edu.tyut.controller.RegisterController.*Register(..))")
    public String pageElementInitialize(ProceedingJoinPoint pjp) {
        // get model
        Model model = (Model) pjp.getArgs()[0];
        // get province id;
        Integer pid = (Integer) pjp.getArgs()[1];
        // get city name
        String cnm = (String) pjp.getArgs()[2];

        Province province = selectProvinceById(pid);
        City city = selectCityByProvinceCodeAndCityName(province.getProvinceCode(), cnm);

        try {
            model.addAttribute("provinceList", selectAllProvince());
            model.addAttribute("cityList", selectCityByProvinceCode(province.getProvinceCode()));
            model.addAttribute("countyList", selectCountyByCityCode(city.getCityCode()));
            model.addAttribute("ethnicList", selectAllEthnic());
            model.addAttribute("statusList", selectAllPoliticalStatus());
            return (String) pjp.proceed(pjp.getArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "error";
    }

    @Around("execution(* edu.tyut.controller.RegisterController.requestCounty(..))")
    public List<County> requestCounty(ProceedingJoinPoint pjp) {
        Integer pid = (Integer) pjp.getArgs()[0];
        String cnm = (String) pjp.getArgs()[1];
        Province province = selectProvinceById(pid);
        City city = selectCityByProvinceCodeAndCityName(province.getProvinceCode(), cnm);
        return selectCountyByCityCode(city.getCityCode());
    }

    @Around("execution(* edu.tyut.controller.RegisterController.requestCity(..))")
    public List<City> requestCity(ProceedingJoinPoint pjp) {
        Province province = selectProvinceById((Integer) pjp.getArgs()[0]);
        return selectCityByProvinceCode(province.getProvinceCode());
    }

    private List<Province> selectAllProvince() {
        return provinceService.selectByExample(null);
    }

    private List<City> selectCityByProvinceCode(String code) {
        CityExample ce = new CityExample();
        CityExample.Criteria cc = ce.createCriteria();
        cc.andProvinceCodeEqualTo(code);
        return cityService.selectByExample(ce);
    }

    private List<County> selectCountyByCityCode(String code) {
        CountyExample ae = new CountyExample();
        CountyExample.Criteria ac = ae.createCriteria();
        ac.andCityCodeEqualTo(code);
        return countyService.selectByExample(ae);
    }

    private List<Ethnic> selectAllEthnic() {
        return ethnicService.selectByExample(null);
    }

    private Province selectProvinceById(Integer id) {
        ProvinceExample pe = new ProvinceExample();
        ProvinceExample.Criteria pc = pe.createCriteria();
        pc.andProvinceIdEqualTo(id);
        return provinceService.selectByExample(pe).get(0);
    }

    private City selectCityByProvinceCodeAndCityName(String pc, String cn) {
        CityExample ce = new CityExample();
        CityExample.Criteria cc = ce.createCriteria();
        cc.andCityNameEqualTo(cn);
        cc.andProvinceCodeEqualTo(pc);
        return cityService.selectByExample(ce).get(0);
    }

    private List<PoliticalStatus> selectAllPoliticalStatus() {
        return politicalStatusService.selectByExample(null);
    }
}
