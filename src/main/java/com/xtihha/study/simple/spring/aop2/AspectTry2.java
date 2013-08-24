package com.xtihha.study.simple.spring.aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectTry2 {

    @After(value = "execution(* com.xtihha.study.simple.spring.aop2.*.*(..))")
    public void doAfter2(JoinPoint jp) {
        System.out.println("after2 :" + jp.getSignature());
    }

}
