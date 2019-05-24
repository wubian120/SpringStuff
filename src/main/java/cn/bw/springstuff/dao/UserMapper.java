package cn.bw.springstuff.dao;

import cn.bw.springstuff.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:31
 */
@Mapper
public interface UserMapper {

    User selectUserById(Long id);

//    List<User> selectAllUsers();

//    void updateUser(User user);

//    void deleteUserById(long id);

    void insertUser(User user);

    User selectUserByName(String name);

}
