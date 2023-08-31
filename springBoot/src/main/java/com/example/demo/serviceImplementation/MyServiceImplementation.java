package com.example.demo.serviceImplementation;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.model.Village;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.VilllageRepo;
import com.example.demo.service.MyService;

@Component
public class MyServiceImplementation implements MyService {
	
	@Autowired 
	UserRepo userRepo;
	@Autowired
	VilllageRepo villageRepo;
	

	@Override
	public List<User> getunverifiedUser() {
		// TODO Auto-generated method stub
		try {
			List<User> allData=userRepo.getDataofUnverifiedUser();
			return allData;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}


	@Override
	public List<Village> getAllVillage() {
		// TODO Auto-generated method stub
		try {
			List<Village> allvillage=villageRepo.findAll();
			return allvillage;
		}
		catch(Exception e) {
			e.printStackTrace();
		return null;}
	}
	
	@Override
	public boolean addvillageDataInDb(Village village) {
		try {
			villageRepo.save(village); 
			return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		return false;
		}
	}
	
	
	@Override
	public int loginUser(String UIusername, String UIpassword) {
		// TODO Auto-generated method stub
		int cnt = userRepo.countByUsername(UIusername);
		if(cnt==1) {
			User user= userRepo.getUserFromUsername(UIusername);
			if(user.getUsername().equals(UIusername)&&user.getPassword().equals(UIpassword)) {
				return user.getUserRole();
			}
			else
				return -1;
		}
		return -1;
	}

	@Override
	public boolean storeUserInDataBase(User user) {
		try {
			user.setRegistrationDate(new Date());
			user.setUserRole(3);
			user.setIsUserVerified(1);
			userRepo.save(user);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}





	

}
