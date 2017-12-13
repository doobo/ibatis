package vip.ipav.springdemo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.ipav.dao.ContentMapper;
import vip.ipav.dao.UserMapper;

/**
 * Created by 89003522 on 2017/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MoreTableTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private UserMapper userMapper;
    private ContentMapper descMapper;

    @Before
    public void before(){
        userMapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
        descMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
    }

    @Test
    public void findDiscussByUid() throws Exception{
        System.out.println( descMapper.findContentByUid(1));
    }

    @Test
    public void findDiscussByUser() throws Exception {
        System.out.println( descMapper.findContentByUser(null));
    }

    @Test
    public void findDiscussByArray() throws Exception {//数组查询
        System.out.println(descMapper.findContentByArray(new int[]{2,3}));
        System.out.println(descMapper.findContentByArray2(new int[]{2,3}));
    }

    @Test
    public void findDiscussList() throws Exception {
        System.out.println(descMapper.findContentList());
    }

    @Test
    public void findDiscussResultMap() throws Exception {
        System.out.println(descMapper.findContentResultMap());
    }

    @Test
    public void findMoreMap() throws Exception {
        System.out.println(descMapper.findMoreMap());
    }
}
