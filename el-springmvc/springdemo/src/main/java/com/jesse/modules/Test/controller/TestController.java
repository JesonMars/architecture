package com.jesse.modules.Test.controller;

import com.alibaba.fastjson.JSONObject;
import com.jesse.modules.test.TestModel;
import com.jesse.modules.test.request.TestDataRequest;
import com.jesse.modules.test.response.TestDataResponse;
import com.jesse.modules.test.service.IService.ITestService;
import com.jesse.modules.test.service.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("index")
    public ModelAndView getIndex(){
        return new ModelAndView("/test/index.ftl");
    }

    @RequestMapping("test1")
    public ModelAndView test1(){
        return new ModelAndView("/test/test1");
    }
    @RequestMapping("test2")
    public ModelAndView test2(){
        return new ModelAndView("/test/test2.html");
    }

    @RequestMapping("test3")
    public ModelAndView test3(){
        return new ModelAndView("/test/test3.vm");
    }

    @RequestMapping("testr")
    @ResponseBody
    public TestDataResponse testR(TestDataRequest request){
        System.out.println(request.getName());
        TestModel testModel=testService.getById(1);

        TestDataResponse testDataResponse=new TestDataResponse();
        testDataResponse.setTestModel(testModel);
        return testDataResponse;
    }
    @RequestMapping("data")
    @ResponseBody
    public TestDataResponse data(@RequestParam Map<String,Object> request){
        System.out.println(JSONObject.toJSONString(request));
        return new TestDataResponse();
    }

    @RequestMapping("testjs")
    public String testjq(){
        return "/test/testjs.html";
    }
}
