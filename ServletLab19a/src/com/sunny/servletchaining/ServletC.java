package com.sunny.servletchaining;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletC extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		System.out.println("Servlet C Started");
		RequestDispatcher rd=request.getRequestDispatcher("b.sunny");
		rd.forward(request, response);

		System.out.println("Servlet C Ended");

	
	}

}