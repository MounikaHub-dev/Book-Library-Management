package com.B55.Controller;

import java.io.IOException;

import com.B55.Dao.RegisterDao;
import com.B55.model.RegisterModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("get elements by id called");
		int id = Integer.parseInt(request.getParameter("id"));
		RegisterDao rd = new RegisterDao();
		RegisterModel rm = rd.selectById(id);
		request.setAttribute("rm", rm);
		RequestDispatcher rp = request.getRequestDispatcher("update.jsp");
		rp.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("Updated object");
		System.out.println(id + " " + fullname + " " + email + " " + password);
		RegisterModel rm = new RegisterModel();
		rm.setId(id);
		rm.setFullname(fullname);
		rm.setEmail(email);
		rm.setPassword(password);
		RegisterDao rd = new RegisterDao();
		String status = rd.updateUser(rm);
		resp.sendRedirect("ListOfUsers");
	}

}
