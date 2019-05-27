package cn.bw.springstuff.service;

import cn.bw.springstuff.entity.User;
import cn.bw.springstuff.utility.Auth;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:49
 */
public interface UserService {

    User getUserById(long id);

    void insertUser(User user);


    User getUserByName(String name,String email);
}
