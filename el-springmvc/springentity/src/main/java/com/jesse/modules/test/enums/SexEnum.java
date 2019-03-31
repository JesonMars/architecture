package com.jesse.modules.test.enums;

public enum SexEnum {
    M("Male","男"),
    F("Female","女"),
    N("None","未知");

    private String sex;
    private String type;
    SexEnum(String sex,String type){
        this.sex=sex;
        this.type=type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
