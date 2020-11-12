package com.example.nacosproducer.controller;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/nacos")
@RestController
//@NacosPropertySource(dataId = "nacostest",autoRefreshed = true)
public class NacosTestController {


    @RequestMapping("/easy")
    public String easyTest(){
        return "success";
    }

}
