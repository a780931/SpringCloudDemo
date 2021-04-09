package com.example.democonsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "cloud-provider",path ="/pro" )
@Component
public interface SayHello {
    @GetMapping("/haha")
     Map haha();
}
