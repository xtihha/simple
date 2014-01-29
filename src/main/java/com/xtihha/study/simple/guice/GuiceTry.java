package com.xtihha.study.simple.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * User: zhangxiaohu
 * Date: 14-1-29
 * Time: 下午5:49
 */
public class GuiceTry {

    public static void main(String []args){
        Injector injector = Guice.createInjector(new ServiceModule());
        IService service = injector.getInstance(IService.class);

        service.serve();
    }
}
