package vip.ipav.vip.ipav.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.ipav.dao.UserMapper;
import vip.ipav.po.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 89003522 on 2017/12/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class Spring_MyBatis {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void getListTest() throws Exception{
        UserMapper userMapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
        List<User> list = userMapper.findUserByUsername("李");
        System.out.println(list);
    }
}
