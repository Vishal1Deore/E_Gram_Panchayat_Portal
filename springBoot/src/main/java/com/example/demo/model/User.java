package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String fullname;
	String username;
	String password;
	Date registrationDate;
	int userRole;
	double mobNum;
	int isUserVerified;
	


}
