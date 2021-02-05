package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowing {

    @org.aspectj.lang.annotation.AfterThrowing(
            pointcut = "execution(* beans.Operation.*(..))",
            throwing = "throwable"
    )
    public void advice(JoinPoint joinPoint, Throwable throwable){
        System.out.println("Exception is: " + throwable);
    }

}
