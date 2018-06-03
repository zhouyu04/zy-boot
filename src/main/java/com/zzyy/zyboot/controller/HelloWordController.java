package com.zzyy.zyboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
