package com.example.FeignClientConsumer1.controller;

import com.example.FeignClientConsumer1.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping("/info")
    public String getEmpData(){
        return myFeignClient.showMsg();
    }
}
