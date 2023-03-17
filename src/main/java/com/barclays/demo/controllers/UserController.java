package com.barclays.demo.controllers;

import com.barclays.demo.models.Expense;
import com.barclays.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("givemeauser")
    public User giveMeAUser(){
        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense());
        User user1 = new User("Jon", "jon@gmail.com", expenses);
        return user1;
    }

}
