package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;

import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.Teacher;
import edu.tyut.controller.ConstFlg;
import edu.tyut.service.ManagerService;
import edu.tyut.service.StudentService;
import edu.tyut.service.TeacherService;
import edu.tyut.util.SystemUtil;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 16202
 */
@Component
@Aspect
public class LoginAspect {

    private static final Logger logger = Logger.getLogger(LoginAspect.class);

    private static final int COOKIE_MAX_AGE = 604800;

    StudentService studentService;

    TeacherService teacherService;

    ManagerService managerService;

    public LoginAspect(StudentService studentService, TeacherService teacherService,
                       ManagerService managerService)
    {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.managerService = managerService;
    }

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public boolean checkHandler(ProceedingJoinPoint pjp) {
        LoginInformation obj = (LoginInformation) pjp.getArgs()[0];
        HttpServletRequest req = (HttpServletRequest) pjp.getArgs()[1];
        HttpServletResponse resp = (HttpServletResponse) pjp.getArgs()[2];

        System.out.println(obj);
        boolean remember = req.getParameter("remember") != null;
        // check login information and save login information to the session and cookie
        if (obj.getClass() == Student.class) {
            if (studentService.loginHelper(obj.getIdentityKey(), obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                if (remember) {
                    String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(obj));
                    Cookie c = new Cookie(ConstFlg.STUDENT_COOKIE, cookieValue);
                    c.setMaxAge(COOKIE_MAX_AGE);
                    resp.addCookie(c);
                }
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登录成功");
                }
                return true;
            }
        } else if (obj.getClass() == Teacher.class) {
            if (teacherService.loginHelper(obj.getIdentityKey(), obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                if (remember) {
                    String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(obj));
                    Cookie c = new Cookie(ConstFlg.STUDENT_COOKIE, cookieValue);
                    c.setMaxAge(COOKIE_MAX_AGE);
                    resp.addCookie(c);
                }
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登录成功");
                }
                return true;
            }
        } else { // manager
            if (managerService.loginHelper(obj.getIdentityKey(), obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                if (remember) {
                    String cookieValue = SystemUtil.jsonToCookie(SystemUtil.serialization(obj));
                    Cookie c = new Cookie(ConstFlg.STUDENT_COOKIE, cookieValue);
                    c.setMaxAge(COOKIE_MAX_AGE);
                    resp.addCookie(c);
                }
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登录成功");
                }
                return true;
            }
        }
        return false;
    }
}
