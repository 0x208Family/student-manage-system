package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.mgb.*;
import edu.tyut.service.ManagerService;
import edu.tyut.service.StudentService;
import edu.tyut.service.TeacherService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Aspect
public class LoginAspect {

    private static final String REMEMBER = "on";

    private StudentService studentService;

    private TeacherService teacherService;

    private ManagerService managerService;

    public LoginAspect(StudentService studentService, TeacherService teacherService,
                       ManagerService managerService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.managerService = managerService;
    }

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public String loginDispatcher(ProceedingJoinPoint pjp) {
        LoginInformation obj = (LoginInformation) pjp.getArgs()[0];
        HttpServletRequest req = (HttpServletRequest) pjp.getArgs()[1];
        HttpServletResponse resp = (HttpServletResponse) pjp.getArgs()[2];

        System.out.println(req.getParameter("remember"));
        System.out.println(obj);
        if (obj.getClass() == Student.class) {
            if (existStudent(obj.getIdentityKey(), obj.getPassword())) {
                // set session and cookie for next login without password
                req.getSession().setAttribute("hasLogin", true);
                if (REMEMBER.equals(req.getParameter("remember"))) {
                    Cookie c = new Cookie("user", obj.getIdentityKey() + "&" + obj.getPassword());
                    c.setMaxAge(60 * 60 * 24 * 7);
                    resp.addCookie(c);
                }
                return "true";
            }
            return "false";
        } else if (obj.getClass() == Teacher.class) {
            return existTeacher(obj.getIdentityKey(), obj.getPassword()) + "";
        } else {
            return existManager(obj.getIdentityKey(), obj.getPassword()) + "";
        }
    }

    private boolean existStudent(String id, String password) {
        StudentExample se = new StudentExample();
        StudentExample.Criteria sc = se.createCriteria();
        sc.andStudentIdEqualTo(id);
        sc.andPasswordEqualTo(password);
        return studentService.selectByExample(se).size() == 1;
    }

    private boolean existTeacher(String id, String password) {
        TeacherExample te = new TeacherExample();
        TeacherExample.Criteria tc = te.createCriteria();
        tc.andTeacherIdEqualTo(id);
        tc.andPasswordEqualTo(password);
        return teacherService.selectByExample(te).size() == 1;
    }

    private boolean existManager(String id, String password) {
        ManagerExample me = new ManagerExample();
        ManagerExample.Criteria mc = me.createCriteria();
        mc.andNameEqualTo(id);
        mc.andPasswordEqualTo(password);
        return managerService.selectByExample(me).size() == 1;
    }
}
