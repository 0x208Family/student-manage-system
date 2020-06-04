package edu.tyut.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=================== interceptor working ===================");

        if (request.getSession().getAttribute("hasLogin") != null) {
            // Try to get login information from session
            request.getRequestDispatcher("/pages/success.jsp").forward(request, response);
        } else {
            // Try to get login information from cookie
            for (Cookie c : request.getCookies()) {
                if (c.getName().equals("user")) {
                    request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
                }
            }
        }
        return true;
    }
}
