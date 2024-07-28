package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.UserMoment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMomentsDao {
    void addUserMoments(UserMoment userMoment);
}
