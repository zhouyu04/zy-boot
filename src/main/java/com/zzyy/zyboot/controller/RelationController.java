package com.zzyy.zyboot.controller;

import com.zzyy.zyboot.entity.User;
import com.zzyy.zyboot.server.RelationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.eclipse.jdt.internal.compiler.codegen.ConstantPool.Append;

@Controller
@RequestMapping("/relation")
public class RelationController {


    @Autowired
    RelationServer relationServer;

    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("/addUser")
    public void addUser(User user){
        System.out.println(user);
        relationServer.addUser(user);
    }
}
