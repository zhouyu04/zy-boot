package com.zzyy.zyboot.server.RelationServerImpl;

import com.zzyy.zyboot.entity.User;
import com.zzyy.zyboot.mapper.UserMapper;
import com.zzyy.zyboot.server.RelationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@Service
public class RelationServerImpl implements RelationServer {

    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
