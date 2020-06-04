package edu.tyut.controller;

import edu.tyut.bean.mgb.ManagerLogin;
import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/stu_home")
    public String check(Student student, HttpServletRequest request) {
        return null;
    }

    @RequestMapping("/tea_home")
    public String check(Teacher teacher) {
        return null;
    }

    @RequestMapping("/man_home")
    public String check(ManagerLogin manager) {
        return null;
    }
}
