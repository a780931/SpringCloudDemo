package com.example.democonsumer.controller;


import com.example.democonsumer.feign.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/feign")
public class TestFeignController {
    @Autowired
    private SayHello sayHello;

    @GetMapping("/test")
    public Map tets(){
        return sayHello.haha();
    }
}
