package com.alekseybykov.examples.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceWatcher {

    @Around("@annotation(com.alekseybykov.examples.aop.pointcut.WatchedInMillis)")
    public Object watchInMillis(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        long startTime = System.currentTimeMillis();

        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append(proceedingJoinPoint.getSignature().toShortString());
        sb.append(", ");
        sb.append((endTime - startTime));
        sb.append(" ms");

        System.out.println(sb.toString());

        return result;
    }

    @Around("@annotation(com.alekseybykov.examples.aop.pointcut.WatchedInNanos)")
    public Object watchInNanos(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        long startTime = System.nanoTime();

        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        sb.append(proceedingJoinPoint.getSignature().toShortString());
        sb.append(", ");
        sb.append((endTime - startTime));
        sb.append(" ns");

        System.out.println(sb.toString());

        return result;
    }
}