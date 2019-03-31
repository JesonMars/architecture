import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.jesse.modules.Test.controller.TestController;
import com.jesse.modules.test.request.TestDataRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath*:dispatcher-servlet.xml","classpath*:spring-*.xml","classpath*:core/mybatis.xml"})
@WebAppConfiguration
public class ControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    //MockMvcBuilders.standaloneSetup(new TestController()).build();
    }



    @Test
    public void test() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/test/index").accept(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }

    @Test
    public void testr() throws Exception{
//        mockMvc.perform(MockMvcRequestBuilders.get("/test/testr").accept(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
        TestDataRequest request=new TestDataRequest();
        request.setId(1);
        request.setName("test");
        request.setStore(10);
        String jp=JSONObject.toJSONString(request);

        mockMvc.perform(MockMvcRequestBuilders.post("/test/testr")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .content(jp.getBytes()))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.testModel.id").value(1))
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
    }

    @Test
    public void testdata() throws Exception {
        HashMap map=new HashMap();
        String param=JSONObject.toJSONString(map);
        mockMvc.perform(MockMvcRequestBuilders.post("/test/data").param("request",param))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
