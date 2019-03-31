package com.jesse.modules.test.dao.IDaoReader;

import com.jesse.modules.test.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ITestReader {
    TestModel getById(TestModel model);
}
