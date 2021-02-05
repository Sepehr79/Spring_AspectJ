package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAdvice {
    @Pointcut("execution(* beans.Operation.*(..))")
    public void point(){}

    @Around("point()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around and before...");
        Object object = pjp.proceed();
        System.out.println("Around and after...");
        return object;
    }
}
