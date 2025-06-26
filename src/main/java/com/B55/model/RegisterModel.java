package com.B55.model;


public class RegisterModel  {
	private int id;
	private String fullname;
	private  String email;
	private String password;
	
	public RegisterModel() {
		
	}
	
	public RegisterModel( int id,String fn, String em, String pwd) {
		this.id = id;
		this.fullname = fn;
		this.email = em;
		this.password = pwd;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public  String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
		return "RegisterModel [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ "]";
	}

	
	
	

	

}
