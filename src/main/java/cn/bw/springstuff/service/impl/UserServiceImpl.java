package cn.bw.springstuff.service.impl;

import cn.bw.springstuff.dao.UserMapper;
import cn.bw.springstuff.entity.User;
import cn.bw.springstuff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.selectUserById(id);
    }


    @Override
    public void insertUser(User user) {

        userMapper.insertUser(user);

    }
}
