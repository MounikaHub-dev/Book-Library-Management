package com.B55.model;

public class loginModel {
	private String email;
	private String password;
	
	public loginModel() {
		
	}
public loginModel(String em,String pwd) {
	this.email = em;
	this.password = pwd;
		
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
@Override
public String toString() {
return email + ":"+ password ;

}

}
