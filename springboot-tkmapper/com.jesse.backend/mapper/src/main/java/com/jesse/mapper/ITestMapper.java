package com.jesse.mapper;

import com.jesse.model.po.TestModel;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface ITestMapper  extends BaseMapper<TestModel> {
}
