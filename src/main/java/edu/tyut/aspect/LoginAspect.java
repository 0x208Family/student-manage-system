package edu.tyut.aspect;

import edu.tyut.bean.LoginInformation;
import edu.tyut.service.helper.LoginHelper;
import edu.tyut.util.SpringContextUtil;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 16202
 */
@Component
@Aspect
public class LoginAspect {

    private static final Logger logger = Logger.getLogger(LoginAspect.class);

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public boolean checkHandler(ProceedingJoinPoint pjp) {
        LoginInformation info = (LoginInformation) pjp.getArgs()[0];
        Map<String, LoginHelper> serviceMap = SpringContextUtil.getBeanOfType(LoginHelper.class);
        try {
            for (LoginHelper helper : serviceMap.values()) {
                if (info.getClass() == helper.serviceFor()) {
                    if (helper.loginChecker(info)) {
                        if ((boolean) pjp.proceed(pjp.getArgs())) {
                            logger.info("用户：[" + info.getLoginKey() + "]登录成功");
                            return true;
                        }
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
