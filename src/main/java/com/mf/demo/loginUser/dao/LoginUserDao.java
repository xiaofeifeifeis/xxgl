package com.mf.demo.loginUser.dao;

import com.mf.demo.loginUser.model.LoginUser;
import com.mf.demo.system.dao.MfLoginUserDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginUserDao extends MfLoginUserDao {
    List<LoginUser> queryAllLoginUser(@Param(value="userId") String userId);
}