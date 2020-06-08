package edu.tyut.aspect;

import edu.tyut.bean.LoginAdapter;
import edu.tyut.controller.ConstFlg;
import edu.tyut.service.helper.LoginHelper;
import edu.tyut.util.SpringContextUtil;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author 16202
 */
@Component
@Aspect
public class LoginAspect {

    private static final Logger logger = Logger.getLogger(LoginAspect.class);

    private static final int COOKIE_MAX_AGE = 604800;

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public boolean checkHandler(ProceedingJoinPoint pjp) {
        LoginAdapter adapter = (LoginAdapter) pjp.getArgs()[0];
        HttpServletRequest req = (HttpServletRequest) pjp.getArgs()[1];
        HttpServletResponse resp = (HttpServletResponse) pjp.getArgs()[2];

        Map<String, LoginHelper> serviceMap = SpringContextUtil.getBeanOfType(LoginHelper.class);

        try {
            for (LoginHelper helper : serviceMap.values()) {
                if (adapter.loginObject() == helper.serviceFor()) {
                    if (helper.loginChecker(adapter)) {
                        // add information in session
                        req.getSession().setAttribute(ConstFlg.HAS_LOGIN, adapter.homePath());

                        // add cookie
                        if (req.getParameter(ConstFlg.REMEMBER) != null) {
                            Cookie c = new Cookie(adapter.cookieName(), adapter.cookieValue());
                            c.setMaxAge(COOKIE_MAX_AGE);
                            resp.addCookie(c);
                        }

                        logger.info("用户：[" + adapter.uniqueKey() + "]登录成功，方式：账号密码");
                        return true;
                    }
                    return false;
                }
            }
        } catch (Throwable t) {
            logger.error(t.getMessage(), t.getCause());
        }
        return false;
    }
}
