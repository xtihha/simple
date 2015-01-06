package com.xtihha.study.simple.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * User: zhangxiaohu
 * Date: 14-1-29
 * Time: 下午6:15
 */

public class PayService {
    @Inject
    public void guice(@Named("service_impl2") IService service) {
        service.serve();
    }
}
