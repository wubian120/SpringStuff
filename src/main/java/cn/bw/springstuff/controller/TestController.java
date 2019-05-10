package cn.bw.springstuff.controller;

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

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi this is SpringStuff";
    }
}
