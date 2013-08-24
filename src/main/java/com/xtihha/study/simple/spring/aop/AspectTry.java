package com.xtihha.study.simple.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTry {

    public static void main(String[] args) {
        String beanFilePath = AspectTry.class.getPackage().getName().replace(".", "/") + "/aop-try.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(beanFilePath);

        IService sa = (IService) ctx.getBean("sa");
        sa.echo();
        sa.echo("heihei");

        ServiceB sb = (ServiceB) ctx.getBean("sb");
        sb.watch();
    }

    public void doBefore(JoinPoint joinPoint) {
        System.out.println("doBefore");
    }

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("after:" + joinPoint.getTarget() + "." + joinPoint.getSignature().getName());
    }

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("doAround");
        pjp.proceed();
    }

    public void doReturning(JoinPoint joinPoint) {
        System.out.println("doReturning");
    }

    public void doThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("doThrowing");
    }

}
