package com.mf.demo.loginUser.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.mf.demo.loginUser.dao.LoginUserDao;
import com.mf.demo.loginUser.model.LoginUser;
import com.mf.demo.loginUser.service.LoginUserService;
import com.mf.redis.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
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
    @Autowired
    private RedisUtil redisUtil;

    public List<LoginUser> queryAllLoginUser(){
        logger.info("当前是系统登录方法");
        List<LoginUser> loginUsers = (List<LoginUser>) redisUtil.get("userList");
        if(CollectionUtils.isEmpty(loginUsers)) {
            loginUsers = loginUserDao.queryAllLoginUser("");
            redisUtil.set("userList", JSONUtils.toJSONString(loginUsers));
        }
        for (int i = 0; i < loginUsers.size(); i++) {
            System.out.println(loginUsers.get(i).getUserName());
        }
        return loginUsers;
    }

}
