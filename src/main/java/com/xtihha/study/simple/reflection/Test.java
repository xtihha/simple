package com.xtihha.study.simple.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class Test<T, K> extends ClassA<T> {

    public static void main(String args[]) throws Exception {

        System.out.println("superclass: " + Test.class.getSuperclass().getName());

        Type type = Test.class.getGenericSuperclass();
        System.out.println("genericSuperclass: " + type);

        if (ParameterizedType.class.isAssignableFrom(type.getClass())) {
            System.out.print("actualTypeArguments: ");
            for (Type t1 : ((ParameterizedType) type).getActualTypeArguments()) {
                System.out.print(t1 + ",");
            }
            System.out.println();

            System.out.println("ownerType: " + ((ParameterizedType) type).getOwnerType());

            System.out.println("rawType: " + ((ParameterizedType) type).getRawType());
        }

        for (TypeVariable<Class<Test>> variable : Test.class.getTypeParameters()) {
            System.out.println(variable + ", " + variable.getName() + "," + variable.getBounds());
        }

    }
}