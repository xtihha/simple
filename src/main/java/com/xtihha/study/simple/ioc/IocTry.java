package com.xtihha.study.simple.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.xtihha.study.simple.ioc.impl.IocTryImpl;

public class IocTry {
	private static final Logger logger = LoggerFactory.getLogger(IocTry.class);

	public static void main(String[] args) {
		String beanFilePath = IocTry.class.getPackage().getName()
				.replace(".", "/")
				+ "/simple-beans.xml";
		logger.info("bean file path is {}", beanFilePath);
		ClassPathResource res = new ClassPathResource(beanFilePath);
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);

		IocTryImpl iocTry = (IocTryImpl) factory.getBean("iocTry");
		logger.info(iocTry.hello());
		logger.info(iocTry.echo("hello bean factory"));
	}
}
