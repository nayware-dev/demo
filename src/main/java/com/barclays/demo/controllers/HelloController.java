package com.barclays.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "its a nice day";
    }
    @GetMapping("expenses")
    public String expenses(){
        return "travel expenses";
    }
    @GetMapping
    public String intro(){
        return "You are on the intro page";
    }
    @GetMapping("paidExpenses")
    public String paidExpenses(){
        return "These expenses have been paid";
    }
}

