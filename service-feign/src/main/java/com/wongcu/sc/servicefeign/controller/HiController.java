package com.wongcu.sc.servicefeign.controller;

import com.wongcu.sc.servicefeign.feign.ServiceHiFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    ServiceHiFeignClient serviceHiFeignClients;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return serviceHiFeignClients.hi(name);
    }
}
