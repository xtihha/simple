package com.xtihha.study.simple.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class MyCallbackFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        Intercept intercept = method.getAnnotation(Intercept.class);
        if (intercept == null || !intercept.intercept())
            return 1;// 返回的是index，需要参考Try.java里设置的Callback数组
        return 0;
    }

}
