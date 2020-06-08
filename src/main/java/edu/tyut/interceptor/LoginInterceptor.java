package edu.tyut.interceptor;

import edu.tyut.bean.InstructorLoginAdapter;
import edu.tyut.bean.ManagerLoginAdapter;
import edu.tyut.bean.StudentLoginAdapter;
import edu.tyut.bean.TeacherLoginAdapter;
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
                        String stuJson = SystemUtil.URLDecoder(c.getValue());
                        StudentLoginAdapter student = SystemUtil.deserialization(stuJson, StudentLoginAdapter.class);
                        if (student != null && studentService.loginChecker(student)) {
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, student.homePath());
                            request.getRequestDispatcher(student.homePath()).forward(request, response);
                            logger.info("用户：[" + student.uniqueKey() + "]登录成功，方式：cookie");
                            return true;
                        }
                        break;
                    case ConstFlg.TEACHER_COOKIE:
                        String teaJson = SystemUtil.URLDecoder(c.getValue());
                        TeacherLoginAdapter teacher = SystemUtil.deserialization(teaJson, TeacherLoginAdapter.class);
                        if (teacher != null && teacherService.loginChecker(teacher)) {
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, teacher.homePath());
                            request.getRequestDispatcher(teacher.homePath()).forward(request, response);
                            logger.info("用户：[" + teacher.uniqueKey() + "]登录成功，方式：cookie");
                            return true;
                        }
                        break;
                    case ConstFlg.INSTRUCTOR_COOKIE:
                        String insJson = SystemUtil.URLDecoder(c.getValue());
                        InstructorLoginAdapter instructor = SystemUtil.deserialization(insJson, InstructorLoginAdapter.class);
                        if (instructor != null && instructorService.loginChecker(instructor)) {
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, instructor.homePath());
                            request.getRequestDispatcher(instructor.homePath()).forward(request, response);
                            logger.info("用户：[" + instructor.uniqueKey() + "]登录成功，方式：cookie");
                            return true;
                        }
                        break;
                    case ConstFlg.MANAGER_COOKIE:
                        String manJson = SystemUtil.URLDecoder(c.getValue());
                        ManagerLoginAdapter manager = SystemUtil.deserialization(manJson, ManagerLoginAdapter.class);
                        if (manager != null && managerService.loginChecker(manager)) {
                            request.getSession().setAttribute(ConstFlg.HAS_LOGIN, manager.homePath());
                            request.getRequestDispatcher(manager.homePath()).forward(request, response);
                            logger.info("用户：[" + manager.uniqueKey() + "]登录成功，方式：cookie");
                            return true;
                        }
                        break;
                } // end of switch
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("no login information found in session or cookie");
        }
        return true;
    }
}
