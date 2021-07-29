package com.sapient.helloworldservice.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Aspect
@Component
public class LoggingAdvice {
    private static final String POINTCUT = "@annotation(com.sapient.helloworldservice.annotation.LogExecutionTime)";

    @Around(POINTCUT)
    public Object logMethodAround(ProceedingJoinPoint jp) throws Throwable {
        log.info("Entering class {} within method {} with arguments {}",
                jp.getSignature().getDeclaringTypeName(),
                jp.getSignature().getName(),
                jp.getArgs());
        long start = System.nanoTime();
        Object returnVal = jp.proceed();
        long end = System.nanoTime();
        log.info("Execution time was {} in ms", TimeUnit.NANOSECONDS.toMillis(end-start));
        log.info("Exiting class {} within method {} with return value {} ",
                jp.getSignature().getDeclaringTypeName(),
                jp.getSignature().getName(),
                returnVal);

        return returnVal;
    }

}