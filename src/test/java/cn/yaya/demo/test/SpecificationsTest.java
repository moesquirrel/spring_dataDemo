package cn.yaya.demo.test;

import cn.yaya.demo.dao.CustomerDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpecificationsTest {
    @Autowired
    private CustomerDao customerDao;
    public void testSpec(){

    }

}
