package edu.tyut.service.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
@Aspect
public class ServiceAspect {

    private static final Logger logger = Logger.getLogger(ServiceAspect.class);

    @Before("execution(* edu.tyut.service.impl.*.select*(..)) ||" +
            "execution(* edu.tyut.service.impl.*.update*(..)) ||" +
            "execution(* edu.tyut.service.impl.*.delete*(..)) )))")
    public void resetStudentExample(JoinPoint joinPoint)  {
        try {
            if (logger.isDebugEnabled()) {
                logger.debug("正在执行example的清理和创建工作");
            }
            Object target = joinPoint.getTarget();
            Method clear = target.getClass().getMethod(CriteriaHelper.CLEAR_SIGNATURE);
            Method create = target.getClass().getMethod(CriteriaHelper.CREATE_SIGNATURE);
            clear.invoke(target);
            create.invoke(target);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error("在清理和创建example时出现异常", e.getCause());
        }
    }
}
