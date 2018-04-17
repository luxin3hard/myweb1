package dispatcherservlet.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


/**
 * Created by lx on 10/04/2018.
 */
@Aspect
public class MyInterceptor {
    @Around("execution(* dispatcherservlet.HomeController.home(..))")
    public void around(ProceedingJoinPoint joinPoint){

        System.out.println("232132");

        try {
            joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}
