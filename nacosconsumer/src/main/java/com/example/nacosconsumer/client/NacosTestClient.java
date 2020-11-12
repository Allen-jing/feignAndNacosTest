package com.example.nacosconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provide-service")
public interface NacosTestClient {

    @RequestMapping("/nacos/easy")
    String easyTest();

}
