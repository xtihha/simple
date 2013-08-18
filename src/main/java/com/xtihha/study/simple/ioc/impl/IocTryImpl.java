package com.xtihha.study.simple.ioc.impl;

import com.xtihha.study.simple.ioc.IIocTry;

public class IocTryImpl implements IIocTry {

	public String hello() {
		return "hello";
	}

	public String echo(String input) {
		return input;
	}
}
