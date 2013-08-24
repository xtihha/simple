package com.xtihha.study.simple.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("demo1")
public class DemoBeans {

    public void demo() {
        System.out.println("this is DemoBeans.demo()");
    }

    public static void main(String[] args) {
        String beanFilePath = DemoBeans.class.getPackage().getName().replace(".", "/") + "/simple-beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(beanFilePath);
        DemoBeans demo1 = (DemoBeans) ctx.getBean("demo1");
        demo1.demo();
    }
}
