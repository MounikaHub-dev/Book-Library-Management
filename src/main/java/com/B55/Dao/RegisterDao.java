package com.B55.Dao;

//import com.B55.Controller.RegisterModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.B55.model.RegisterModel;
public class RegisterDao implements RegisterDaoInterface{
	String status = "fail";
	public String insertUsers(RegisterModel rm)  {
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch55","root","root");
				PreparedStatement ps = con.prepareStatement("insert into users (fullname, email, password) values(?, ?, ?)");
				ps.setString(1, rm.getFullname());
				ps.setString(2, rm.getEmail());
				ps.setString(3, rm.getPassword());
				int n = ps.executeUpdate();
				if(n>0) {
					System.out.println(n + ": rows effected");
					status = "success";
				
				} else {
					System.out.println("Failed to insert");
				}
					
			} catch (Exception e) {
				System.out.println(e);
			}
			return status;	
		
	}

	public RegisterModel selectById(int id) {
	    RegisterModel rm = null;
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch55", "root", "root");
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id = ?");
	        ps.setInt(1, id);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            rm = new RegisterModel(); 
	            rm.setId(rs.getInt("id"));
	            rm.setFullname(rs.getString("fullname"));
	            rm.setEmail(rs.getString("email"));
	            rm.setPassword(rs.getString("password"));
	        }

	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return rm;
	}

	

			
	public List<RegisterModel> getALLUsers() {
		String status = "fail";
		List<RegisterModel> listofusers=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch55", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from users");

			

			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 RegisterModel	 e=new RegisterModel();
				 e.setId(rs.getInt("id"));
				 e.setFullname(rs.getString("fullname"));
				 e.setEmail(rs.getString("email"));
				 e.setPassword(rs.getString("password"));
				 System.out.println("----------------");
				 System.out.println(e);
				 listofusers.add(e);
				 
			 }
			

		} catch (Exception e1) {

			e1.printStackTrace();
		}

		System.out.println("in list--------");
		System.out.println(listofusers);
		
		
		return listofusers;

	}
	public String deleteUser(int id) {
		String status="fail";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch55", "root", "root");
               PreparedStatement st = con.prepareStatement("delete from users where id=?");
               st.setInt(1,id);

               
             int rs = st.executeUpdate();
             if(rs>0) {
            	 status="success";
             }
             
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
		
	}

	public String updateUser(RegisterModel user) {
	    String status = "fail";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch55", "root", "root");

	        PreparedStatement ps = con.prepareStatement("update users set fullname=?, email=?, password=? where id=?");
	        ps.setString(1, user.getFullname());
	        ps.setString(2, user.getEmail());
	        ps.setString(3, user.getPassword());
	        ps.setInt(4, user.getId());

	        int n = ps.executeUpdate();
	        if (n > 0) {
	            status = "success";
	            System.out.println(n + " row updated !!");
	        } else {
	            System.out.println("Invalid Input !!");
	        }

	    } catch (Exception e1) {
	        e1.printStackTrace();
	    }

	    return status;
	}



	


}
