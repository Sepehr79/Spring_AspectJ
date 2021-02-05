package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturning {

    @org.aspectj.lang.annotation.AfterReturning(
            pointcut = "execution(* beans.Operation.*(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("After returning");
    }
}
