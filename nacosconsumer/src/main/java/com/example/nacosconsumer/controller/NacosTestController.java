package com.example.nacosconsumer.controller;

import com.example.nacosconsumer.client.NacosTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/nacos")
@RestController
public class NacosTestController {

    @Autowired
    private NacosTestClient nacosTestClient;

    @RequestMapping("/easy")
    public String easyTest(){
        System.out.println("0000");
        return nacosTestClient.easyTest();
    }

}
