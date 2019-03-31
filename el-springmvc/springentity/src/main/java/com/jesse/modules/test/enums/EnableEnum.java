package com.jesse.modules.test.enums;

import java.util.Hashtable;

public enum  EnableEnum {
    T(1,true),
    F(2,false);
    private int index;
    private boolean type;

    EnableEnum(int index,boolean type){
        this.index=index;
        this.type=type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

}
