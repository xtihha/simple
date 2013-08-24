package com.xtihha.study.simple.spring.ioc.impl;

import com.xtihha.study.simple.spring.ioc.IIocTry;

public class IocTryImpl implements IIocTry {

    public String hello() {
        return "hello";
    }

    public String echo(String input) {
        return input;
    }
}
