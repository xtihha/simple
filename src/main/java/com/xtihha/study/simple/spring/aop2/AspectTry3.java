package com.xtihha.study.simple.spring.aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectTry3 {

    @After("execution(* com.xtihha.study.simple.spring.aop.*.*(..))")
    public void doAfter(JoinPoint jp) {
        System.out.println("after :" + jp.getSignature());
    }
}
