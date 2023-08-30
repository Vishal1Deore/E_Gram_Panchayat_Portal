package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface MyService {
    boolean storeUserInDataBase(User user);
    int loginUser(String UIusername, String UIpassword);
}
