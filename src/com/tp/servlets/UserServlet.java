package com.tp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tp.entities.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String erreur="";
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String sc=request.getParameter("score");
		String ag=request.getParameter("age");
		int score=0;
		int age=0;
		try
		{
			score=Integer.parseInt(sc);
			age=Integer.parseInt(ag);
			User us=new User(1,nom,prenom,email,password,age,score);
			us.ajout();
			request.setAttribute("message","succés d'ajout");
rd.forward(request, response);
		}
		catch(Exception ex)
		{
			response.sendRedirect("erreur.jsp");

			
		}
	}

}
