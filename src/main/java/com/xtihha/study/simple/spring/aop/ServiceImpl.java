package com.xtihha.study.simple.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceImpl implements IService {
    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    public void echo() {
        logger.info("this is in function echo()");
    }

    public String echo(String str) {
        logger.info("this is in function echo(String)");
        return str;
    }

}
