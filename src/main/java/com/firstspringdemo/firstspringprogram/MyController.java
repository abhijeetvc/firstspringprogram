package com.firstspringdemo.firstspringprogram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class MyController {

    @GetMapping(value="/data1")
    public String doSomething(){
        return "Hello Spring demo";
    }
}
