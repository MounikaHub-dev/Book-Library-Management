package com.B55.Controller;

import java.io.IOException;

import com.B55.Dao.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		RegisterDao rd = new RegisterDao();
	String status = 	rd.deleteUser(id);
	if(status.equals("success")) {
		response.sendRedirect("ListOfUsers");
		
		
	}
	}

}
