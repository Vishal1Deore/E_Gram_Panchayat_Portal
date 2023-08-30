package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.Village;
import com.example.demo.service.MyService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class MyController {
	
	@Autowired
	MyService service;
	
	@PostMapping("addvillageData")
	public boolean addvillageData(@RequestBody Village village) {
		return service.addvillageDataInDb(village);
	}
		
	@PostMapping("register")
	public boolean register(@RequestBody User user) {
		return service.storeUserInDataBase(user);
	}
	
	@GetMapping("login{UIusername}/{UIpassword}")
	public int login(@PathVariable String UIusername,@PathVariable String UIpassword) {
		return service.loginUser(UIusername, UIpassword);
	}
	
	
	

}
