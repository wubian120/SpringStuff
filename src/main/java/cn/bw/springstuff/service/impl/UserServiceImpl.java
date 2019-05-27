package cn.bw.springstuff.service.impl;

import cn.bw.springstuff.dao.UserMapper;
import cn.bw.springstuff.entity.User;
import cn.bw.springstuff.service.UserService;
import cn.bw.springstuff.utility.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:51
 */
@Slf4j
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

    @Override
    @Auth(roleName = {"admin"})
    public User getUserByName(String name,String email) {

        log.info("UserServiceImpl-getUserByName-run.");
        return userMapper.selectUserByName(name);
    }


}
