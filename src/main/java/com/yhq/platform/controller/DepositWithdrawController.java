package com.yhq.platform.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanghuiqing on 2018/10/20.
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/Deposit")
public class DepositWithdrawController {

    //跳转登录页面
    @RequestMapping("/makedata")
    public  String  makedata(){

        return "login";
    }





}
