package com.xtihha.study.simple.spring.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClassAnnotation
class ParentClassAnnotation {

}

public class ChildClassAnnotation extends ParentClassAnnotation {
    private static final Logger logger = LoggerFactory.getLogger(ChildClassAnnotation.class);

    public static void main(String[] args) {
        Class<ChildClassAnnotation> clz = ChildClassAnnotation.class;
        Class<ParentClassAnnotation> clz2 = ParentClassAnnotation.class;
        logger.info("parent({}), child({})", clz2.isAnnotationPresent(ClassAnnotation.class),
                clz.isAnnotationPresent(ClassAnnotation.class));

    }
}