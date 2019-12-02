package com.mf.demo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengfei
 * @Title: UserController
 * @ProjectName xxgl
 * @Description: TODO
 * @date 2019/1/3117:09
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value="getUserName",method = RequestMethod.GET)
    public String getUserName() {
        return "xiaofei";
    }
}
