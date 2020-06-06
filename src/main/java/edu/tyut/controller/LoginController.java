package edu.tyut.controller;

import edu.tyut.bean.mbg.Manager;
import edu.tyut.bean.mbg.Student;
import edu.tyut.bean.mbg.Teacher;
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

    @RequestMapping("/stu_home")
    public String studentHome() {
        return "stu-home-page";
    }

    @RequestMapping("/tea_home")
    public String teacherHome() {
        return "tea-home-page";
    }

    @RequestMapping("/ins_home")
    public String instructorHome() {
        return "ins-home-page";
    }

    @RequestMapping("/man_home")
    public String managerHome() {
        return "man-home-page";
    }

    @ResponseBody
    @RequestMapping("/stu_check")
    public boolean check(Student student, HttpServletRequest req, HttpServletResponse resp) {
        return false;
    }

    @ResponseBody
    @RequestMapping("/tea_check")
    public boolean check(Teacher teacher, HttpServletRequest req, HttpServletResponse resp) {
        return false;
    }

    @ResponseBody
    @RequestMapping("/man_check")
    public boolean check(Manager manager, HttpServletRequest req, HttpServletResponse resp) {
        return false;
    }
}
