package com.kok.jee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kok.jee.dto.User;
import com.kok.jee.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid, password;
		
		userid=request.getParameter("userid");
		password=request.getParameter("password");
		
		LoginService loginservice = new LoginService();
		boolean result = loginservice.authenticate(userid, password);
		if (result) {
			User user = loginservice.getUserDetails(userid);
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);

			return;
		}
		else {
			response.sendRedirect("login.jsp");
			return;
			
		}

	}

}
