package com.mf.demo.loginUser.controller;

import com.mf.demo.loginUser.model.LoginUser;
import com.mf.demo.loginUser.service.LoginUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mengfei
 * @Title: UserController
 * @ProjectName xxgl
 * @Description: TODO 系统登录控制层
 * @date 2019/1/3117:09
 */
@RestController
@RequestMapping(value = "loginUser")
public class LoginUserController {
    private Logger logger = LoggerFactory.getLogger(LoginUserController.class);

    @Autowired
    private LoginUserService loginUserService;

    @RequestMapping(value="getUserName",method = RequestMethod.GET)
    public String getUserName() {
        return "xiaofei";
    }

    @RequestMapping(value="queryAllLoginUserList",method = RequestMethod.GET)
    public List<LoginUser> queryAllLoginUserList(){
        logger.info("---获取当前系统所有登录用户---");
        return loginUserService.queryAllLoginUser();
    }
}
