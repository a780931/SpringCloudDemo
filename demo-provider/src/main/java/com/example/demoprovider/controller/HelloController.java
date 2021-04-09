package com.example.demoprovider.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pro")
public class HelloController {
    @GetMapping("/haha")
    public Map sayHi(){
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("key","hhihihihi");
        return objectObjectHashMap;
    }
}
