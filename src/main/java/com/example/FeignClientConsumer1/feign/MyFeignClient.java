package com.example.FeignClientConsumer1.feign;

import com.example.FeignClientConsumer1.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "DISCOVERCLIENTPRODUCER")
public interface MyFeignClient {
    @GetMapping("/emp/show")
    public String showMsg();

    @PostMapping("/emp/addEmp")
    public String addEmp(@RequestBody Employee employee);
}
