package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/paste")
public class PersonServlet extends HttpServlet {

	public PersonServlet() {
		System.out.println("created default constructor of person servlet");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created do post method");
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String  gender=req.getParameter("gender");
		String address=req.getParameter("address");
		String reason=req.getParameter("reason");
		
		System.out.println("firstName" +firstName);
		System.out.println("lastName" +lastName);
		System.out.println("gender" +gender);
		System.out.println("address" +address);
		System.out.println("reason" +reason);
		
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("firstName",firstName);
		req.setAttribute("lastName",lastName);
		req.setAttribute("gender",gender);
		req.setAttribute("address",address);
		req.setAttribute("reason",reason);
		
		dispatcher.forward(req, resp);
		
		
		
		
		
		
		
	}
	
	
}
