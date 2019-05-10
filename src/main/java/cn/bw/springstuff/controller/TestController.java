package cn.bw.springstuff.controller;

import cn.bw.springstuff.entity.User;
import cn.bw.springstuff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 10:29
 */

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/u1", method = RequestMethod.GET)
    public User getUserById() {
        long id = 1;
        User u1 = userService.getUserById(id);
        return u1;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi this is SpringStuff";
    }


}
