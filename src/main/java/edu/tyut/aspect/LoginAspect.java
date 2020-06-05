package edu.tyut.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 16202
 */
@Component
@Aspect
public class LoginAspect {

    @Around("execution(* edu.tyut.controller.LoginController.check(..))")
    public String checkHandler(ProceedingJoinPoint pjp) {
        return "true";
    }
}
