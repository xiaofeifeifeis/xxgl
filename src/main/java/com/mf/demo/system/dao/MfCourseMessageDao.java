package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfCourseMessage;

public interface MfCourseMessageDao {
    int deleteByPrimaryKey(String courseId);

    int insert(MfCourseMessage record);

    int insertSelective(MfCourseMessage record);

    MfCourseMessage selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(MfCourseMessage record);

    int updateByPrimaryKey(MfCourseMessage record);
}