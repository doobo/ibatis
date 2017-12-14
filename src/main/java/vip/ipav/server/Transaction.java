package vip.ipav.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.ipav.dao.UserMapper;
import vip.ipav.po.User;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by 89003522 on 2017/12/13.
 */
@Service
@Transactional
public class Transaction {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user) throws Exception {
        userMapper.insertUser(user);
    }

    public void insertUserException(User user) throws Exception {
        userMapper.insertUser(user);
        throw new RuntimeException("事务测试！");
    }
}
