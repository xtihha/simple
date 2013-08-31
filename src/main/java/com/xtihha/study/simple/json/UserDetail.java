package com.xtihha.study.simple.json;

import com.alibaba.fastjson.annotation.JSONField;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetail {

    private String address;

    private String notuse;

    @Override
    public String toString() {
        return "address=" + address + ",notuse=" + notuse;
    }

    @JSONField(serialize = false)
    public String getNotuse() {
        return notuse;
    }

    public void setNotuse(String notuse) {
        this.notuse = notuse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
