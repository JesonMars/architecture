package com.jesse.api;

import com.jesse.iservices.ITestService;
import com.jesse.model.po.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
    @Autowired
    ITestService testService;

    @RequestMapping("getOne")
    public TestModel getOne(){
        TestModel testModel=new TestModel().setId(1);
        return testService.getOne(testModel);
    }

    @RequestMapping("addOne")
    public TestModel addOne(@RequestBody TestModel testModel){
        return testService.addOne(testModel);
    }

    @RequestMapping("delOne")
    public TestModel delOne(@RequestBody TestModel testModel){
        return testService.deleteOne(testModel);
    }

    @RequestMapping("updateOne")
    public TestModel updateOne(@RequestBody TestModel testModel){
        return testService.updateOne(testModel);
    }
}
