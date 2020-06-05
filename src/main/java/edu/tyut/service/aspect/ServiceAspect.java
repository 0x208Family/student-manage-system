package edu.tyut.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
@Aspect
public class ServiceAspect {

    @Before("execution(* edu.tyut.service.impl.*.select*(..)) ||" +
            "execution(* edu.tyut.service.impl.*.update*(..)) ||" +
            "execution(* edu.tyut.service.impl.*.delete*(..)) )))")
    public void resetStudentExample(JoinPoint joinPoint)  {
        try {
            Object target = joinPoint.getTarget();
            Method clear = target.getClass().getMethod("clearCriteria");
            Method create = target.getClass().getMethod("createCriteria");
            clear.invoke(target);
            create.invoke(target);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
