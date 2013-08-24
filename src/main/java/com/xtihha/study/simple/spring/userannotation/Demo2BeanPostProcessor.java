package com.xtihha.study.simple.spring.userannotation;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;

@Component
public class Demo2BeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    private SimpleTypeConverter converter = new SimpleTypeConverter();

    @Override
    public boolean postProcessAfterInstantiation(final Object bean, String beanName) throws BeansException {
        super.postProcessAfterInstantiation(bean, beanName);
        ReflectionUtils.doWithFields(bean.getClass(), new FieldCallback() {
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {

                Config cfg = field.getAnnotation(Config.class);
                if (cfg != null) {
                    field.setAccessible(true);// needed
                    Object setValue = field.get(bean);
                    if (setValue == null) {
                        String value = cfg.value();
                        Object _value = converter.convertIfNecessary(value, field.getType());
                        ReflectionUtils.makeAccessible(field);
                        field.set(bean, _value);
                    }
                }
            }
        });

        return true;
    }

}
