package com.example.FeignClientConsumer1.controller;

import com.example.FeignClientConsumer1.feign.MyFeignClient;
import com.example.FeignClientConsumer1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping("/info")
    public String getEmpData(){
        System.out.println("implemetnaion class"+myFeignClient.getClass().getName());
        return myFeignClient.showMsg();
    }

    @GetMapping("/addEmp")
    public String addEmployee(){
        Employee employee=new Employee();
        employee.setId("100");
        employee.setName("srinivas");
        return myFeignClient.addEmp(employee);
    }


}
