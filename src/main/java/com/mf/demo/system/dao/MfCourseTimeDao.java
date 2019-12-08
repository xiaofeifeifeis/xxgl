package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfCourseTime;

public interface MfCourseTimeDao {
    int deleteByPrimaryKey(String timeId);

    int insert(MfCourseTime record);

    int insertSelective(MfCourseTime record);

    MfCourseTime selectByPrimaryKey(String timeId);

    int updateByPrimaryKeySelective(MfCourseTime record);

    int updateByPrimaryKey(MfCourseTime record);
}