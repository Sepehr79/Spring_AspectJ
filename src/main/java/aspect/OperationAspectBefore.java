package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class OperationAspectBefore {
    @Pointcut("execution(* beans.Operation.*(..))")
    public void advice(){ }

    @Before("advice()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("before advice");
        /*System.out.println(joinPoint.getSignature());
        for (Object object: joinPoint.getArgs())
            System.out.println(object);*/
    }

    @After("advice()")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("After advice");
    }

}
