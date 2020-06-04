package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.StudentExample;
import edu.tyut.bean.mgb.Teacher;
import edu.tyut.service.StudentService;
import edu.tyut.service.TeacherService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class LoginAspect {

    private StudentService studentService;

    private TeacherService teacherService;

    public LoginAspect(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public String loginDispatcher(ProceedingJoinPoint pjp) {
        LoginInformation obj = (LoginInformation) pjp.getArgs()[0];
        HttpServletRequest req = (HttpServletRequest) pjp.getArgs()[1];
        System.out.println(req.getParameter("remember"));
        System.out.println(obj);
        if (obj.getClass() == Student.class) {
            if (existStudent(obj.getIdentityKey(), obj.getPassword())) {
                return "success";
            } else {
                return "error";
            }
        } else if (obj.getClass() == Teacher.class) {
            return "success";
        } else {
            return "success";
        }
    }

    private boolean existStudent(String id, String password) {
        StudentExample se = new StudentExample();
        StudentExample.Criteria sc = se.createCriteria();
        sc.andStudentIdEqualTo(id);
        sc.andPasswordEqualTo(password);
        return studentService.selectByExample(se).size() == 1;
    }
}
