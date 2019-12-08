package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfGradeMessage;

public interface MfGradeMessageDao {
    int deleteByPrimaryKey(String gradeId);

    int insert(MfGradeMessage record);

    int insertSelective(MfGradeMessage record);

    MfGradeMessage selectByPrimaryKey(String gradeId);

    int updateByPrimaryKeySelective(MfGradeMessage record);

    int updateByPrimaryKey(MfGradeMessage record);
}