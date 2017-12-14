package vip.ipav.springdemo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.ipav.dao.UserMapper;
import vip.ipav.po.User;
import vip.ipav.server.Transaction;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 89003522 on 2017/12/11.
 * 结合Spring整合数据池和工厂类执行SQL语句
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class Spring_MyBatis {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private UserMapper userMapper;

    @Before
    public void before(){
        userMapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
    }

    @Test
    public void getListTest() throws Exception{
        List<User> list = userMapper.findUserByUsername("李");
        System.out.println(list);
    }

    @Test
    public void testFindById() throws Exception{
        System.out.println(userMapper.findUserById(1));
    }

    @Test
    public void findByHashMap() throws Exception{
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("username", "张");
        System.out.println(userMapper.findUserByHashMap(map));
    }

    @Test
    public void findCount() throws Exception{
        System.out.println(userMapper.findUserCount());
    }

    /**
     * 事务测试
     * 必须在事务所在的类方法中抛出异常，才能回滚事务
     */
    @Autowired
    Transaction transaction;

    @Test
    public void insertUser() throws Exception{
        transaction.insertUser(new User(5,"小芳","女",new Date(),"湖北武汉-无异常"));
        transaction.insertUserException(new User(5,"异常","女",new Date(),"异常数据"));
    }
}
