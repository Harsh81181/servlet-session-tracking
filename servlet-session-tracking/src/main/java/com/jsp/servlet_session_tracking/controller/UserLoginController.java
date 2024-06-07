package com.jsp.servlet_session_tracking.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/userLogin")
public class UserLoginController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession httpSession=req.getSession();
	
	String username=req.getParameter("username");
	String userpass=req.getParameter("userpass");
	
	if(username.equals("kiran") && userpass.equals("123")) {
		httpSession.setAttribute("msg", userpass);
		httpSession.setMaxInactiveInterval(3);
		req.getRequestDispatcher("user-home.jsp").forward(req, resp);
	}else {
		req.setAttribute("msg", "Incorrect user-name or user-password");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
		
	}
}
}
