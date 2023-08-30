package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  //for creating table of village in database
@Data // for set the and get the value(getters and setter)
@NoArgsConstructor // default constructor to initalize the object property
@AllArgsConstructor // parameterised constructor
@ToString // to print the object as is format
public class Village {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String villageName;
	int pincode;

}
