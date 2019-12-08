package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfLoginUser;
import org.springframework.stereotype.Repository;

@Repository
public interface MfLoginUserDao {
    int deleteByPrimaryKey(String userId);

    int insert(MfLoginUser record);

    int insertSelective(MfLoginUser record);

    MfLoginUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(MfLoginUser record);

    int updateByPrimaryKey(MfLoginUser record);
}