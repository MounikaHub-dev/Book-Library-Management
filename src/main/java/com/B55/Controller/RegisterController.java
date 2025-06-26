package com.B55.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.B55.Dao.RegisterDao;
import com.B55.model.RegisterModel;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	
	public RegisterController() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello Servlet!!");
		String fullname = request.getParameter("fullname");
		System.out.println("Controller data :" + fullname);
		
		String email = request.getParameter("email");
		System.out.println("Controller data :" + email);
		
		
		String password = request.getParameter("password");
		System.out.println("Controller data :" + password);
		
		
		
		RegisterModel rm = new RegisterModel();
		rm.setFullname(fullname);
		System.out.println("Model Data :" + rm.getFullname());
		rm.setEmail(email);
		System.out.println("Model Data :" + rm.getEmail());
		rm.setPassword(password);
		System.out.println("Model Data :" + rm.getPassword());
		
		RegisterDao rd = new RegisterDao();
		String status = rd.insertUsers(rm);
		
		System.out.println(status);
		
		if(status.equals("success")) {
			RequestDispatcher rsd =request.getRequestDispatcher("login.jsp");
			rsd.forward(request, response);
	
		}else {
			RequestDispatcher rsd =request.getRequestDispatcher("index.jsp");
			rsd.forward(request, response);
			
		}
	}

}
