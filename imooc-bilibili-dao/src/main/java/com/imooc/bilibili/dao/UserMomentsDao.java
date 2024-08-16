package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.UserMoment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMomentsDao {
    void addUserMoments(UserMoment userMoment);

    Integer pageCountMoments(Map<String, Object> params);

    List<UserMoment> pageListMoments(Map<String, Object> params);
}
