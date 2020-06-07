package edu.tyut.interceptor;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.bean.mbg.Manager;
import edu.tyut.bean.mbg.Student;
import edu.tyut.bean.mbg.Teacher;
import edu.tyut.controller.ConstFlg;
import edu.tyut.service.InstructorService;
import edu.tyut.service.ManagerService;
import edu.tyut.service.StudentService;
import edu.tyut.service.TeacherService;
import edu.tyut.util.SystemUtil;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger logger = Logger.getLogger(LoginInterceptor.class);

    private StudentService studentService;

    private TeacherService teacherService;

    private InstructorService instructorService;

    private ManagerService managerService;

    public LoginInterceptor(StudentService studentService, TeacherService teacherService,
                            InstructorService instructorService, ManagerService managerService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.managerService = managerService;
        this.instructorService = instructorService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getSession().getAttribute(ConstFlg.HAS_LOGIN) != null) {
            // Try to get login information from session
            request.getRequestDispatcher((String) request.getSession().getAttribute(ConstFlg.HAS_LOGIN))
                    .forward(request, response);
            logger.info("login information get from session");
            return true;
        } else {
            // Try to get login information from cookie
            for (Cookie c : request.getCookies()) {
                switch (c.getName()) {
                    case ConstFlg.STUDENT_COOKIE:
                        String stuJson = SystemUtil.cookieToJson(c.getValue());
                        Student stu = SystemUtil.deserialization(stuJson, Student.class);
                        if (stu != null && studentService.loginChecker(stu)) {
                            request.getRequestDispatcher(ConstFlg.STUDENT_HOME).forward(request, response);
                            logger.info("用户：[" + stu.getStudentId() + "] 登录成功：方式：cookie");
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.STUDENT_HOME);
                        }
                        return true;
                    case ConstFlg.TEACHER_COOKIE:
                        String teaJson = SystemUtil.cookieToJson(c.getValue());
                        Teacher tea = SystemUtil.deserialization(teaJson, Teacher.class);
                        if (tea != null && teacherService.loginChecker(tea)) {
                            request.getRequestDispatcher(ConstFlg.TEACHER_HOME).forward(request, response);
                            logger.info("用户：[" + tea.getTeacherId() + "] 登录成功：方式：cookie");
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.TEACHER_HOME);
                        }
                        return true;
                    case ConstFlg.INSTRUCTOR_COOKIE:
                        String insJson = SystemUtil.cookieToJson(c.getValue());
                        Instructor ins = SystemUtil.deserialization(insJson, Instructor.class);
                        if (ins != null && instructorService.loginChecker(ins)) {
                            request.getRequestDispatcher(ConstFlg.INSTRUCTOR_HOME).forward(request, response);
                            logger.info("用户：[" + ins.getName() + "] 登录成功：方式：cookie");
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.INSTRUCTOR_HOME);
                        }
                        return true;
                    case ConstFlg.MANAGER_COOKIE:
                        String manJson = SystemUtil.cookieToJson(c.getValue());
                        Manager man = SystemUtil.deserialization(manJson, Manager.class);
                        if (man != null && managerService.loginChecker(man)) {
                            request.getRequestDispatcher(ConstFlg.MANAGER_HOME).forward(request, response);
                            logger.info("用户：[" + man.getName() + "] 登录成功：方式：cookie");
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, ConstFlg.MANAGER_HOME);
                        }
                        return true;
                }
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("no login information found in session or cookie");
        }
        return true;
    }
}
