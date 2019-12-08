package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfStudentMessage;

public interface MfStudentMessageDao {
    int deleteByPrimaryKey(String studentId);

    int insert(MfStudentMessage record);

    int insertSelective(MfStudentMessage record);

    MfStudentMessage selectByPrimaryKey(String studentId);

    int updateByPrimaryKeySelective(MfStudentMessage record);

    int updateByPrimaryKey(MfStudentMessage record);
}