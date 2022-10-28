package com.bhavna.payload;

import javax.persistence.*;
import javax.validation.constraints.*;


public class UserDto {
	// for data transfer 
	@Id
	private int id;
	
	@NotEmpty
	private String name;
	
	@Email
	private String email;
	
	@NotEmpty
	@Size(min=4,message="password should be atleast 4 characters.")
	private String password;
	
	@NotNull
	private String intrest;
	
	private String mobile;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIntrest() {
		return intrest;
	}
	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}
	public UserDto() {
		super();
	}
	
	

}
