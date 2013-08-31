package com.xtihha.study.simple.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class Test<T, K> extends ClassA<T> {

    public static void main(String args[]) throws Exception {

        System.out.println("======getSuperclass======:");
        System.out.println(Test.class.getSuperclass().getName());

        System.out.println("======getGenericSuperclass======:");
        Type t = Test.class.getGenericSuperclass();
        System.out.println(t);

        if (ParameterizedType.class.isAssignableFrom(t.getClass())) {
            System.out.print("----------->getActualTypeArguments:");
            for (Type t1 : ((ParameterizedType) t).getActualTypeArguments()) {
                System.out.print(t1 + ",");
            }
            System.out.println();
            System.out.println("-----getOwnerType:");
            System.out.println(((ParameterizedType) t).getOwnerType());

            System.out.println("----getRawType");
            System.out.println(((ParameterizedType) t).getRawType());
        }

        for (TypeVariable<Class<Test>> variable : Test.class.getTypeParameters()) {
            System.out.println(variable + ", " + variable.getName() + "," + variable.getBounds());
        }

    }
}