package com.jesse.modules;

import com.jesse.modules.response.Response;
import sun.net.util.IPAddressUtil;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    public BaseResponse(){
        Response response=new Response();
        response.setCode(0);
        response.setStatus("success");
        this.setResponse(response);
    }
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
