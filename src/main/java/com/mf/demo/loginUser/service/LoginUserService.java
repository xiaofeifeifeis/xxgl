package com.mf.demo.loginUser.service;

import com.mf.demo.loginUser.model.LoginUser;

import java.util.List;

/**
 * @author mengfei
 * @Title: LoginUserService
 * @ProjectName xxgl
 * @Description: TODO 系统登录接口层
 * @date 2019/1/3117:05
 */
public interface LoginUserService {
    List<LoginUser> queryAllLoginUser();
}
