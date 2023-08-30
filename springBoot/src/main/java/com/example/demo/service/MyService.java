package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.Village;

@Service
public interface MyService {
    boolean storeUserInDataBase(User user);
    int loginUser(String UIusername, String UIpassword);
    boolean addvillageDataInDb(Village village);
}
