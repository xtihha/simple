package com.xtihha.study.simple.guice;

/**
 * User: zhangxiaohu
 * Date: 14-1-29
 * Time: 下午5:48
 */
public class ServiceImpl implements IService{

    @Override
    public void serve() {
        System.out.println("this is the default implementation");
    }
}
