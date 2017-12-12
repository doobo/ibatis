package vip.ipav.springdemo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.ipav.dao.DiscussMapper;
import vip.ipav.dao.UserMapper;
import vip.ipav.po.User;

/**
 * Created by 89003522 on 2017/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MoreTableTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private UserMapper userMapper;
    private DiscussMapper discussMapper;

    @Before
    public void before(){
        userMapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
        discussMapper = sqlSessionFactory.openSession().getMapper(DiscussMapper.class);
    }

    @Test
    public void findDiscussByUid() throws Exception{
        System.out.println( discussMapper.findDiscussByUid(1));
    }

    @Test
    public void findDiscussByUser() throws Exception {
        System.out.println( discussMapper.findDiscussByUser(null));
    }

    @Test
    public void findDiscussByArray() throws Exception {//数组查询
        System.out.println(discussMapper.findDiscussByArray(new int[]{2,3}));
    }

    @Test
    public void findDiscussList() throws Exception {
        System.out.println(discussMapper.findDiscussList());
    }

    @Test
    public void findDiscussResultMap() throws Exception {
        System.out.println(discussMapper.findDiscussResultMap());
    }
}
