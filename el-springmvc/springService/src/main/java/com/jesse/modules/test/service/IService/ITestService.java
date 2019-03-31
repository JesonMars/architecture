package com.jesse.modules.test.service.IService;

import com.jesse.modules.test.TestModel;

public interface ITestService {
    TestModel getById(Integer id);

    int insert(TestModel model);
}
