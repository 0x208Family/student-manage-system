package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;

import edu.tyut.bean.mgb.Manager;
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
        // check login information and save login information to the session and cookie
        if (obj.getClass() == Student.class) {
            Student student = studentService.queryById(obj.getIdentityKey());
            if (student != null && student.getPassword().equals(obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                Cookie c = new Cookie(ConstFlg.STUDENT_COOKIE, SystemUtil.serialization(obj));
                c.setMaxAge(60);
                resp.addCookie(c);
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登陆成功");
                }
                return true;
            }
        } else if (obj.getClass() == Teacher.class) {
            Teacher teacher = teacherService.queryById(obj.getIdentityKey());
            if (teacher != null && teacher.getPassword().equals(obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                Cookie c = new Cookie(ConstFlg.TEACHER_COOKIE, SystemUtil.serialization(obj));
                c.setMaxAge(60);
                resp.addCookie(c);
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登陆成功");
                }
                return true;
            }
        } else { // manager
            Manager manager = managerService.queryByPrimaryKey(obj.getIdentityKey());
            if (manager != null && manager.getPassword().equals(obj.getPassword())) {
                req.getSession().setAttribute(ConstFlg.HAS_LOGIN, true);
                Cookie c = new Cookie(ConstFlg.MANAGER_COOKIE, SystemUtil.serialization(obj));
                c.setMaxAge(60);
                resp.addCookie(c);
                if (logger.isInfoEnabled()) {
                    logger.info(obj.getClass().getName() + "登陆成功");
                }
                return true;
            }
        }
        return false;
    }
}
