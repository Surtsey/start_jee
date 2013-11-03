package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class xmlServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from xmlServlet!");
		//System.out.println(request.getContentType());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession(); 
		ServletContext context = request.getServletContext();
		
		if (userName!="" && userName!=null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		writer.println("Request parameter has username as " + userName);
		writer.println("Session parameter has username as " + (String) session.getAttribute("savedUserName"));
		writer.println("Context parameter has username as " + (String) context.getAttribute("savedUserName"));
		
		//writer.println("<h3> HELLO from the GET method, " + userName + "!</h3>");
		//writer.println("<p><a href="www.google.com"> links </a></p>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from xmlServlet!");
		//System.out.println(request.getContentType());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		writer.println("<h3> HELLO from the POST method, " + userName + "! Your fullname is " + fullName + "</h3>");
		//writer.println("<p><a href="www.google.com"> links </a></p>");
		
		String prof = request.getParameter("prof");
		writer.println("You are a " + prof + ". Congratulations!");
		String[] location = request.getParameterValues("location");
		writer.println("Your are at " + location.length + " places:");
		for (int i=0; i<location.length; i++){
		writer.println(location[i]);
		}
	}

}
