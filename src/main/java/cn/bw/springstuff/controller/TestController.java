package cn.bw.springstuff.controller;

import cn.bw.springstuff.entity.User;
import cn.bw.springstuff.service.UserService;
import cn.bw.springstuff.utility.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 10:29
 */

@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi this is SpringStuff";
    }

    @GetMapping("/name")
    @Auth
    public User getUserByName(String name) {
        User user = userService.getUserByName(name);
        return user;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/admin")
    @Auth(roleName = {"admin", "Administrator"})
    public String admin(long id) {
        log.info("admin --- running");
        User admin = userService.getUserById(id);
        return admin.getId() + " name: " + admin.getName() + " email: " + admin.getEmail();
    }


}
