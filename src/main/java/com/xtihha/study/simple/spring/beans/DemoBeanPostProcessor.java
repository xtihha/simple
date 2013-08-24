package com.xtihha.study.simple.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

@Component //needed, so spring can scan this compoent 
public class DemoBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        super.postProcessAfterInstantiation(bean, beanName);
        System.out.println("this is post process after intantiation");
        return true;
    }

}
