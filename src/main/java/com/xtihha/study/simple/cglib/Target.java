package com.xtihha.study.simple.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Target {

    private static final Logger logger = LoggerFactory.getLogger(Target.class);

    @Intercept(intercept = true)
    public String execute() {
        String msg = "this is the original execute msg";
        logger.info(msg);
        return msg;
    }

    public void execute2() {
        logger.info("this is the original execute2 msg");
    }
}
