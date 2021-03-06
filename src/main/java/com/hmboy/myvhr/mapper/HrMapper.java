package com.hmboy.myvhr.mapper;

import com.hmboy.myvhr.model.Hr;
import org.springframework.stereotype.Component;

@Component
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String name);
}