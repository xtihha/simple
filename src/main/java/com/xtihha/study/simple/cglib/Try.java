package com.xtihha.study.simple.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Try {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MyMethodInterceptor());

        Target target = (Target) enhancer.create();
        System.out.println(target.execute());
        target.execute2();
    }

}
