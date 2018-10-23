package com.yhq.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yhq.platform.entity.DespositParms;
import com.yhq.platform.service.WalletMockService;

/**
 * Created by yanghuiqing on 2018/10/20.
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/wallet")
public class WalletMockController {

    @Autowired
    WalletMockService walletMockService;

    //正确登录
    @RequestMapping("/mock")
    public String login(DespositParms despositParms ){
        walletMockService.
        return "";
    }



}
