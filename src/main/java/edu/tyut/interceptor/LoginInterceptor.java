package edu.tyut.interceptor;

import edu.tyut.bean.mgb.Manager;
import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.Teacher;
import edu.tyut.controller.ConstFlg;
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

    private ManagerService managerService;

    public LoginInterceptor(StudentService studentService, TeacherService teacherService, ManagerService managerService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.managerService = managerService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getSession().getAttribute(ConstFlg.HAS_LOGIN) != null) {
            if (logger.isInfoEnabled()) {
                logger.info("login information get from session");
            }
            // Try to get login information from session
            request.getRequestDispatcher("/pages/success.jsp").forward(request, response);
        } else {
            // Try to get login information from cookie
            for (Cookie c : request.getCookies()) {
                if (ConstFlg.STUDENT_COOKIE.equals(c.getName())) {
                    Student student = SystemUtil.deserialization(c.getValue(), Student.class);

                    request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
                } else if (ConstFlg.TEACHER_COOKIE.equals(c.getName())) {
                    Teacher teacher = SystemUtil.deserialization(c.getValue(), Teacher.class);
                    request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
                } else if (ConstFlg.MANAGER_COOKIE.equals(c.getName())) {
                    Manager manager = SystemUtil.deserialization(c.getValue(), Manager.class);
                    request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
                }
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("no login information found in session or cookie");
        }
        return true;
    }
}
