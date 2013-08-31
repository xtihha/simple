package com.xtihha.study.simple.reflection;

import com.sankuai.meituan.common.reflect.TypeReference;

public class ReflectionTry {

    public static void main(String[] args) {
        System.out.println(TypeReference.LIST_STRING);
        
        
        StackTraceElement[] traces = Thread.currentThread().getStackTrace();
        for(StackTraceElement ele : traces)
            System.out.println(ele);
    }

}
