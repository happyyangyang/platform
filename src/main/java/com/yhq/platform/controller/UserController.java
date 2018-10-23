package com.yhq.platform.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanghuiqing on 2018/10/20.
 */
@EnableAutoConfiguration
@Controller
@RequestMapping("/user")
public class UserController {

    //跳转登录页面
    @RequestMapping("/loginPage")
    public  String  toLogin(){
        return "login";
    }

    //跳转注册页
    @RequestMapping("/registerPage")
    public  String  toRegister(){
        return "registerPage";
    }

    //跳转找回密码页
    @RequestMapping("/getPasswordPage")
    public  String  toGetPassword(){
        return "getPswPage";
    }

    //跳转菜单
    @RequestMapping("/toMenuPage")
    public  String  toMenuPage(){
        return "menu";
    }

    //跳转到主页
    @RequestMapping("/toHomePage")
    public  String  toHomePage(){
        return "homePage";
    }

    //正确登录
    @RequestMapping("/login")
    public String login(){

        return "";
    }



}
