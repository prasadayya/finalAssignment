package com.demo.lastAssignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.lastAssignment.model.userModel;
import com.demo.lastAssignment.repository.UserRepo;

@Service
public class UserserIMPL {
    @Autowired
    UserRepo obj;



    @Override
    public void addUser(userModel usermodel) {
        obj.save(usermodel);
    }

    
}
