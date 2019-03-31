package com.jesse.modules.test.response;

import com.jesse.modules.BaseResponse;
import com.jesse.modules.test.TestModel;

import java.io.Serializable;

public class TestDataResponse extends BaseResponse {

    private TestModel testModel;

    public TestModel getTestModel() {
        return testModel;
    }

    public void setTestModel(TestModel testModel) {
        this.testModel = testModel;
    }
}
