/*
 * Created by IntelliJ IDEA.
 * User: meituan
 * Date: 14-1-29
 * Time: 下午5:48
 */
package com.xtihha.study.simple.guice;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IService.class).to(ServiceImpl.class);
    }
}
