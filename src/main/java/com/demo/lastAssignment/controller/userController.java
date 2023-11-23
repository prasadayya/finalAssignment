package com.demo.lastAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.lastAssignment.model.userModel;
import com.demo.lastAssignment.service.UserserIMPL;

@Controller
public class userController {
    @Autowired
    UserserIMPL us;

    @GetMapping("/index")
    public String home() {
        return "index";
    }

     @PostMapping("/saveUser")
    public String register(@RequestBody userModel usermodel) {

        us.addUser(usermodel);
        System.out.println("user added");
        return "user added sucessfully";
    }

    
}
