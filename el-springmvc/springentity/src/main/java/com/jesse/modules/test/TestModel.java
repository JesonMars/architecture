package com.jesse.modules.test;

import com.jesse.modules.test.enums.EnableEnum;
import com.jesse.modules.test.enums.SexEnum;

import java.util.Date;
import java.util.Hashtable;

public class TestModel {

    private int id;
    private String name;
    private Integer store;
    private Date utime;
    private Date ctime;
    private SexEnum sex;
    private EnableEnum isEnable;

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public EnableEnum getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(EnableEnum enable) {
        isEnable = enable;
    }
}
