package com.xtihha.study.simple.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class Try {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        // enhancer.setCallback(new MyMethodInterceptor());
        enhancer.setCallbacks(new Callback[] { new MyMethodInterceptor(), NoOp.INSTANCE });
        enhancer.setCallbackFilter(new MyCallbackFilter());

        Target target = (Target) enhancer.create();
        System.out.println(target.execute());
        target.execute2();
        target.execute3();
    }
}
