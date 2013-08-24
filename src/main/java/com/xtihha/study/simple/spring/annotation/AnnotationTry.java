package com.xtihha.study.simple.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum DateEnum {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface AnnotationTry {
    int value();

    String def() default "default value";

    DateEnum week();

    String[] comments();
}
