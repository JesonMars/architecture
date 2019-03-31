package com.jesse.modules.test.service.Service;

import com.jesse.modules.test.dao.IDaoReader.ITestReader;
import com.jesse.modules.test.TestModel;
import com.jesse.modules.test.dao.IDaoWriter.ITestWriter;
import com.jesse.modules.test.service.IService.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService implements ITestService {

    @Resource
    ITestReader iTestReader;

    @Resource
    ITestWriter iTestWriter;

    @Override
    public TestModel getById(Integer id) {
        TestModel param=new TestModel();
        param.setId(id);
        return iTestReader.getById(param);
    }

    @Override
    public int insert(TestModel model) {
        System.out.println("将要写入："+model.getName());
        return iTestWriter.insert(model);
    }
}
