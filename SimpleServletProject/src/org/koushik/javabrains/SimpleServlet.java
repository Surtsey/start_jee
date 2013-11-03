package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method!");
		//System.out.println(request.getContentType());
		PrintWriter writer = response.getWriter();
		writer.println("<h3> HELLO from GET method!</h3>");
		writer.println("<h3> How are you?</h3>");
		writer.println("<p> <a href='http://localhost:8080/SimpleServletProject'> go to homepage </a></p>");
		ServletContext context = request.getServletContext();
		writer.println("Context parameter has username as " + (String) context.getAttribute("savedUserName"));
		
	}

}
