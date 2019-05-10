package cn.bw.springstuff.service;

import cn.bw.springstuff.entity.User;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:49
 */
public interface UserService {

    User getUserById(long id);

    void insertUser(User user);
}
