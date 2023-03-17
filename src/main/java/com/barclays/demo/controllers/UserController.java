package com.barclays.demo.controllers;

import com.barclays.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("givemeauser")
    public User giveMeAUser(){
        User user1 = new User("Jon", "jon@gmail.com", 20);
        return user1;
    }

}
