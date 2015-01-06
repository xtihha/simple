package com.xtihha.study.simple.guice;

/**
 * User: zhangxiaohu
 * Date: 14-1-29
 * Time: 下午5:55
 */
public class ServiceImpl2 implements IService{
    @Override
    public void serve() {
        System.out.println("this is another service implementation");
    }
}
