package com.jesse.modules;

import com.jesse.modules.request.Request;

import java.io.Serializable;

public class BaseRequest implements Serializable {

    public BaseRequest(){

    }
    public BaseRequest(Request request){
        this.setRequest(request);
    }

    private Request request;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
