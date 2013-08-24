package com.xtihha.study.simple.spring.annotation;

public class UseAnnotation {
    @AnnotationTry(value = 1, week = DateEnum.Saturday, comments = { "abc", "123" })
    public void try1() {

    }

    @AnnotationTry(value = 2, def = "not default", week = DateEnum.Friday, comments = { "qwert" })
    public void try2() {

    }

    public static void main(String[] args) {

    }

}
