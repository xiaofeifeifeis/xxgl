package com.mf.demo.loginUser.service.impl;

import com.mf.demo.loginUser.dao.LoginUserDao;
import com.mf.demo.loginUser.model.LoginUser;
import com.mf.demo.loginUser.service.LoginUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mengfei
 * @Title: UserServiceImpl
 * @ProjectName xxgl
 * @Description: TODO 系统登录服务层
 * @date 2019/1/31 17:06
 */
@Service
public class LoginUserServiceImpl implements LoginUserService {
    private Logger logger = LoggerFactory.getLogger(LoginUserServiceImpl.class);
    @Autowired
    private LoginUserDao loginUserDao;

    public List<LoginUser> queryAllLoginUser(){
        logger.info("当前是系统登录方法");
        List<LoginUser> loginUserList = loginUserDao.queryAllLoginUser("");
        for (int i = 0; i < loginUserList.size(); i++) {
            System.out.println(loginUserList.get(i).getUserName());
        }
        return loginUserList;
    }

}
