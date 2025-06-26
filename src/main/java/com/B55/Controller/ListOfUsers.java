package com.B55.Controller;

import java.io.IOException;
import java.util.List;

import com.B55.Dao.RegisterDao;
import com.B55.model.RegisterModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListOfUsers")
public class ListOfUsers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("request for all users");
		RegisterDao rd = new RegisterDao();
		List<RegisterModel> allusers = rd.getALLUsers();
		if( allusers!=null) {
		request.setAttribute("allusers", allusers);
	RequestDispatcher rp =	request.getRequestDispatcher("ListOfUsers.jsp");
	rp.forward(request,response);
}
}
}

