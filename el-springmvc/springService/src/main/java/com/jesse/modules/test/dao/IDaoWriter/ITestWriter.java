package com.jesse.modules.test.dao.IDaoWriter;

import com.jesse.modules.test.TestModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ITestWriter {

    int insert(TestModel model);
}
