package com.xtihha.study.simple.json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class Try {
    private static final Logger logger = LoggerFactory.getLogger(Try.class);

    public static void main(String[] args) {

        UserDetail detail = new UserDetail();
        detail.setAddress("this is address");
        detail.setNotuse("not use");

        User user = new User();
        user.setId(1);
        user.setName("name1");
        user.setDetail(detail);

        System.out.println(JSON.toJSONString(user));

        String json = "{\"detail\":{\"address\":\"this is address\"},\"id\":1,\"name\":\"name1\"}";
        User user2 = JSON.parseObject(json, User.class);
        logger.info("{}", user2);
    }

}
