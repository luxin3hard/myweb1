package dispatcherservlet.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * Created by lx on 10/04/2018.
 */
@Aspect
@Component
public class MyInterceptor {
/*
    @Around("execution(* dispatcherservlet.HomeController.*(..))")
    public void around(ProceedingJoinPoint joinPoint){

        System.out.println("232132");

        try {
            joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
*/


    @Around("execution(* dispatcherservlet.MyService.*(..))")
    public void before(ProceedingJoinPoint joinPoint) {
        System.out.println("232132");
        try {
            joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}
