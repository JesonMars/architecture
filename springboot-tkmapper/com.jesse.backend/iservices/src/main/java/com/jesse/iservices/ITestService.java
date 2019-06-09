package com.jesse.iservices;

import com.jesse.model.po.TestModel;
import org.springframework.stereotype.Service;

@Service
public interface ITestService {

    TestModel getOne(TestModel param);

    TestModel addOne(TestModel param);

    TestModel deleteOne(TestModel param);

    TestModel updateOne(TestModel param);
}
