package com.zzyy.zyboot.server;

import com.zzyy.zyboot.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface RelationServer extends Repository{


    void addUser(User user);
}
