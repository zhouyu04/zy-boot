package com.zzyy.zyboot.mapper;

import com.zzyy.zyboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {
    void addUser(User user);
}
