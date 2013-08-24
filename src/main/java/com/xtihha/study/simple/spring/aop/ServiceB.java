package com.xtihha.study.simple.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceB {
    private static final Logger logger = LoggerFactory.getLogger(ServiceB.class);

    public void watch() {
        logger.info("this is function watch()");
    }
}
