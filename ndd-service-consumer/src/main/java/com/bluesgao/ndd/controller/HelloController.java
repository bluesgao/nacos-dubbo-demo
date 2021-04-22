package com.bluesgao.ndd.controller;

import com.bluesgao.ndd.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @DubboReference
    private HelloService helloService;
    @GetMapping("/hi/{userName}")
    public String hi(@PathVariable String userName){
        return helloService.hi(userName);
    }
}
