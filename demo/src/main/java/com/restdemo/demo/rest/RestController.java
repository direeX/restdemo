package com.restdemo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController //adnotacja wskazująca że jest kontrolerem rest
@RequestMapping("/test")  // endpoint test
public class RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

}
