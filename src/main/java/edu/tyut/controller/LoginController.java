package edu.tyut.controller;

import edu.tyut.bean.mgb.Manager;
import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    public String studentHome() {
        return "success";
    }

    public String teacherHome() {
        return "success";
    }

    public String managerHome() {
        return "success";
    }

    @ResponseBody
    @RequestMapping("/stu_check")
    public String check(Student student, HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/tea_check")
    public String check(Teacher teacher, HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/man_check")
    public String check(Manager manager, HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }
}
