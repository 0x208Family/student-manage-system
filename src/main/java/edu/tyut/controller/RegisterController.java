package edu.tyut.controller;

import com.google.code.kaptcha.Constants;
import edu.tyut.bean.RegisterException;
import edu.tyut.bean.mgb.City;
import edu.tyut.bean.mgb.County;
import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author 16202
 */
@Controller
public class RegisterController {

    @RequestMapping("/stu_register_page")
    public String studentRegister(Model model,
                                  @RequestParam(value = "pid", defaultValue = "1") Integer pid,
                                  @RequestParam(value = "cnm", defaultValue = "北京市") String cnm)
    {
        return "student_register";
    }

    @RequestMapping("/tea_register_page")
    public String teacherRegister(Model model,
                                  @RequestParam(value = "pid", defaultValue = "1") Integer id,
                                  @RequestParam(value = "cnm", defaultValue = "北京市") String cnm)
    {
        return "teacher_register";
    }


    // =============== Response Body ================ //

    @ResponseBody
    @RequestMapping("/request_county")
    public List<County> requestCounty(@RequestParam(value = "pid") Integer pid,
                                      @RequestParam(value = "cnm") String cnm)
    {
        return null;
    }

    @ResponseBody
    @RequestMapping("/request_city")
    public List<City> requestCity(@RequestParam(value = "pid") Integer pid) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/captcha_check")
    public String captchaCheck(@RequestParam("captcha") String captcha, HttpServletRequest req) {
        System.out.println(captcha);
        String excepted = (String) req.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        return excepted.equals(captcha) ? "true" : "false";
    }

    @ResponseBody
    @RequestMapping("/stu_id_verify")
    public Map<String, Boolean> studentIdVerify(Student obj) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/tea_id_verify")
    public Map<String, Boolean> teacherIdVerify(Teacher obj) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/save_student")
    public boolean saveStudent(Student student, BindingResult result) throws RegisterException {
        if (result.hasErrors()) {
            throw new RegisterException("信息注册错误：" + result.getAllErrors());
        }
        return true;
    }

    @ResponseBody
    @RequestMapping("/save_teacher")
    public boolean saveTeacher(Teacher teacher, BindingResult result) throws RegisterException {
        if (result.hasErrors()) {
            throw new RegisterException("信息注册错误：" + result.getAllErrors());
        }
        return true;
    }
}
