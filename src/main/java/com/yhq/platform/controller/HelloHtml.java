package com.yhq.platform.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by yanghuiqing on 2018/10/19.
 */

@EnableAutoConfiguration
@Controller

public class HelloHtml {
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String,Object> map){
        map.put("hello","hello");
        return "hello";
    }
}
