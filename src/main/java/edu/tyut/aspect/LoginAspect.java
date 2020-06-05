package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;

import edu.tyut.bean.mgb.Student;
import edu.tyut.service.ManagerService;
import edu.tyut.service.StudentService;
import edu.tyut.service.TeacherService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 16202
 */
@Component
@Aspect
public class LoginAspect {

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
    public String checkHandler(ProceedingJoinPoint pjp) {
        LoginInformation info = (LoginInformation) pjp.getArgs()[0];
        HttpServletRequest req = (HttpServletRequest) pjp.getArgs()[1];

        // check login information and save login information to the session and cookie
        if (info.getClass() == Student.class) {

        }
        return "true";
    }
}
