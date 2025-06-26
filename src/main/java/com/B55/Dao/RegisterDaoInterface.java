package com.B55.Dao;

import java.util.List;

import com.B55.model.RegisterModel;
import com.B55.model.loginModel;

public interface RegisterDaoInterface {
	public String insertUsers(RegisterModel rm);
	public RegisterModel selectById(int id);
	public List<RegisterModel> getALLUsers();
	public String deleteUser(int id);
	public String updateUser(RegisterModel user);


}
