package com.barclays.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    @GetMapping("random")
    public Double giveMeARandomNumber(){
        return Math.random();
    }
}
