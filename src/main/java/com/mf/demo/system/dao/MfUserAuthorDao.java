package com.mf.demo.system.dao;

import com.mf.demo.system.model.MfUserAuthor;

public interface MfUserAuthorDao {
    int deleteByPrimaryKey(String authorId);

    int insert(MfUserAuthor record);

    int insertSelective(MfUserAuthor record);

    MfUserAuthor selectByPrimaryKey(String authorId);

    int updateByPrimaryKeySelective(MfUserAuthor record);

    int updateByPrimaryKey(MfUserAuthor record);
}