package com.xtihha.study.simple.spring.userannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("demo")
public class DemoAnnotation2 {

    @Config("123")
    private String name = "abc";

    @Config("default department")
    private String dept;

    public void hello() {

    }

    public void print() {
        System.out.println("name=" + name + ", dept=" + dept);
    }

    public static void main(String[] args) {
        String beanFilePath = DemoAnnotation2.class.getPackage().getName().replace(".", "/") + "/userannotation.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(beanFilePath);
        DemoAnnotation2 demo = (DemoAnnotation2) ctx.getBean("demo");
        demo.print();
    }
}
