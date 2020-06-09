package edu.tyut.service;

import edu.tyut.service.helper.CriteriaHelper;

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

    @Before("execution(* edu.tyut.service.impl.*.*(..)) &&" +
            "!@annotation(edu.tyut.annotation.AOPIgnore) &&" +
            "!execution(* edu.tyut.service.helper.CriteriaHelper.*(..))))")
    public void resetStudentExample(JoinPoint joinPoint)  {
        try {
            Object target = joinPoint.getTarget();
            Method clear = target.getClass().getMethod(CriteriaHelper.CLEAR_SIGNATURE);
            Method create = target.getClass().getMethod(CriteriaHelper.CREATE_SIGNATURE);
            if (logger.isDebugEnabled()) {
                logger.debug("正在重置：" + target.getClass().getName() + "的example");
            }
            clear.invoke(target);
            if (logger.isDebugEnabled()) {
                logger.debug("正在创建：" + target.getClass().getName() + "的criteria");
            }
            create.invoke(target);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error("在清理和创建example时出现异常: " + e.getMessage(), e.getCause());
        }
    }
}
