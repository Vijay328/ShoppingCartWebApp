package com.niit.ShoppingCartWebApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String UserID=request.getParameter("UserID");
		String Password=request.getParameter("Password");
		LoginDAO loginDAO =new LoginDAO();
		RequestDispatcher dispatcher;
		if(loginDAO.isValidUser(UserID,Password) ==true)
		{
		dispatcher=request.getRequestDispatcher("home.html");
		dispatcher.forward(request,response);	
		}
		else
		{
			dispatcher=request.getRequestDispatcher("Log.html");
			PrintWriter writer=response.getWriter();
			writer.append("Invalid credentials...please try again");
			writer.append("<h1>do another</h1>");
			dispatcher.include(request, response);
		
		
		
		
		
	}

}
}
