package com.xtihha.study.simple.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMethodInterceptor implements MethodInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(MyMethodInterceptor.class);

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        logger.info("interceptor starts....");
        Object result = proxy.invokeSuper(obj, args);
        logger.info("interceptor ends....");
        return result;
    }
}
