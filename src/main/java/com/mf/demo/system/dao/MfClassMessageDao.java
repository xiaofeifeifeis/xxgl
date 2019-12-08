package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfClassMessage;

public interface MfClassMessageDao {
    int deleteByPrimaryKey(String classId);

    int insert(MfClassMessage record);

    int insertSelective(MfClassMessage record);

    MfClassMessage selectByPrimaryKey(String classId);

    int updateByPrimaryKeySelective(MfClassMessage record);

    int updateByPrimaryKey(MfClassMessage record);
}