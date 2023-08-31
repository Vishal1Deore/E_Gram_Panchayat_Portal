package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.Village;

@Service
public interface MyService {
    boolean storeUserInDataBase(User user);
    int loginUser(String UIusername, String UIpassword);
    List<User> getunverifiedUser();
    boolean addvillageDataInDb(Village village);
    
    List<Village> getAllVillage();
    
    
}
