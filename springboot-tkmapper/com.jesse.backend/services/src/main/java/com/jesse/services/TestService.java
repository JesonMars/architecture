package com.jesse.services;

import com.jesse.iservices.ITestService;
import com.jesse.mapper.ITestMapper;
import com.jesse.model.po.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Autowired
    ITestMapper testMapper;

    @Override
    public TestModel getOne(TestModel param) {
        return testMapper.selectOne(param);
    }

    @Override
    public TestModel addOne(TestModel param) {
        testMapper.insert(param);
        return param;
    }

    @Override
    public TestModel deleteOne(TestModel param) {
        testMapper.delete(param);
        return param;
    }

    @Override
    public TestModel updateOne(TestModel param) {
        testMapper.updateByPrimaryKeySelective(param);
        return param;
    }
}
