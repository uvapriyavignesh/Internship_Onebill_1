package com.te.learn.calculator1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App1
 */
@WebServlet("/result")
public class App1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public App1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		String c= request.getParameter("c");
		String d= request.getParameter("d");
		String e= request.getParameter("e");
		String f= request.getParameter("f");
		String g= request.getParameter("g");
		String h= request.getParameter("h");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter=response.getWriter();
		printWriter.println("<h1> Welcome  to result </h1>");
		RequestDispatcher dispatcher= request.getRequestDispatcher("AppDisplay");
		if (!(a.isEmpty()||b.isEmpty())) {
			int res= Integer.parseInt(a)+Integer.parseInt(b);
			//request.setAttribute("res", res);
			//dispatcher.forward(request,response);
			Cookie cookie=new Cookie("res", res+"");
			response.addCookie(cookie);
			response.sendRedirect("AppDisplay");
			
			
		}
		if (!(c.isEmpty()||d.isEmpty())) {
			int res= Integer.parseInt(c)-Integer.parseInt(d);
			//request.setAttribute("res", res);
			//dispatcher.forward(request,response);
			Cookie cookie=new Cookie("res", res+"");
			response.addCookie(cookie);
			response.sendRedirect("AppDisplay");
			
			
		}
		if (!(e.isEmpty()||f.isEmpty())) {
			int res= Integer.parseInt(e)*Integer.parseInt(f);
			//request.setAttribute("res", res);
			//dispatcher.forward(request,response);
			Cookie cookie=new Cookie("res", res+"");
			response.addCookie(cookie);
			response.sendRedirect("AppDisplay");
			
			
		}
		if (!(g.isEmpty()||h.isEmpty())) {
			int res= Integer.parseInt(g)/Integer.parseInt(h);
			//request.setAttribute("res", res);
			//dispatcher.forward(request,response);
			Cookie cookie=new Cookie("res", res+"");
			response.addCookie(cookie);
			response.sendRedirect("AppDisplay");
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
