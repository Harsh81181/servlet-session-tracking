package com.jsp.servlet_session_tracking.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/UserProfile")
public class UserProfileController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession httpSession=req.getSession();
	System.out.println(httpSession.getAttribute("msg"));
	if(httpSession.getAttribute("msg")!=null) {
		req.getRequestDispatcher("user-profile.jsp").forward(req, resp);
	}else {
		req.setAttribute("msg", "Please login again");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
}
}
