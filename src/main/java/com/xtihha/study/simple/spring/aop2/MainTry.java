package com.xtihha.study.simple.spring.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xtihha.study.simple.spring.aop.ServiceB;

public class MainTry {
    public static void main(String[] args) {
        String beanFilePath = AspectTry2.class.getPackage().getName().replace(".", "/") + "/aop-try2.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(beanFilePath);

        Service sa = (Service) ctx.getBean("sa");
        sa.echo();

        ServiceB sb = (ServiceB) ctx.getBean("sb");
        sb.watch();
    }
}
