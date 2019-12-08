package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfTeacherMessage;

public interface MfTeacherMessageDao {
    int deleteByPrimaryKey(String teacherId);

    int insert(MfTeacherMessage record);

    int insertSelective(MfTeacherMessage record);

    MfTeacherMessage selectByPrimaryKey(String teacherId);

    int updateByPrimaryKeySelective(MfTeacherMessage record);

    int updateByPrimaryKey(MfTeacherMessage record);
}