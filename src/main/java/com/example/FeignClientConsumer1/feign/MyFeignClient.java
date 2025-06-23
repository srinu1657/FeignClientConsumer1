package com.example.FeignClientConsumer1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "DISCOVERCLIENTPRODUCER")
public interface MyFeignClient {
    @GetMapping("/emp/show")
    public String showMsg();
}
