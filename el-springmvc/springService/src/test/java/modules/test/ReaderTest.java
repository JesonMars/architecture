package modules.test;

import com.jesse.modules.test.TestModel;
import com.jesse.modules.test.service.IService.ITestService;
import com.jesse.modules.test.service.Service.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:core/mybatis.xml"})
public class ReaderTest {
    @Autowired
    private TestService testService;

    @Test
    public void test(){
        TestModel model=testService.getById(1);
        TestModel model2=testService.getById(2);
        System.out.println(model.getName());
    }

    @Test
    public void testInsert(){
        TestModel model=new TestModel();
        model.setStore(10);
        model.setName("测试");
        int result=testService.insert(model);

        Assert.assertEquals(result,1);
    }
}
