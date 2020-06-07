package edu.tyut.controller;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.bean.mbg.Manager;
import edu.tyut.bean.mbg.Student;
import edu.tyut.bean.mbg.Teacher;
import edu.tyut.util.SystemUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    private static final int COOKIE_MAX_AGE = 604800;

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
        // add login information to session
        req.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.STUDENT_HOME);
        // add cookie to response
        if (req.getParameter(ConstFlg.REMEMBER) != null) {
            String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(student));
            Cookie c = new Cookie(ConstFlg.STUDENT_COOKIE, cookieValue);
            c.setMaxAge(COOKIE_MAX_AGE);
            resp.addCookie(c);
        }
        return true;
    }

    @ResponseBody
    @RequestMapping("/tea_check")
    public boolean check(Teacher teacher, HttpServletRequest req, HttpServletResponse resp) {
        // add login information to session
        req.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.TEACHER_HOME);
        // add cookie to response
        if (req.getParameter(ConstFlg.REMEMBER) != null) {
            String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(teacher));
            Cookie c = new Cookie(ConstFlg.TEACHER_COOKIE, cookieValue);
            c.setMaxAge(COOKIE_MAX_AGE);
            resp.addCookie(c);
        }
        return true;
    }

    @ResponseBody
    @RequestMapping("/ins_check")
    public boolean check(Instructor instructor, HttpServletRequest req, HttpServletResponse resp) {
        // add login information to session
        req.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.INSTRUCTOR_HOME);
        // add cookie to response
        if (req.getParameter(ConstFlg.REMEMBER) != null) {
            String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(instructor));
            Cookie c = new Cookie(ConstFlg.INSTRUCTOR_COOKIE, cookieValue);
            c.setMaxAge(COOKIE_MAX_AGE);
            resp.addCookie(c);
        }
        return true;
    }

    @ResponseBody
    @RequestMapping("/man_check")
    public boolean check(Manager manager, HttpServletRequest req, HttpServletResponse resp) {
        // add login information to session
        req.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.MANAGER_HOME);
        // add cookie to response
        if (req.getParameter(ConstFlg.REMEMBER) != null) {
            String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(manager));
            Cookie c = new Cookie(ConstFlg.MANAGER_COOKIE, cookieValue);
            c.setMaxAge(COOKIE_MAX_AGE);
            resp.addCookie(c);
        }
        return true;
    }
}
