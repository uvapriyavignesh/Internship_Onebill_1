package com.te.learn.calculator1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppDisplay")
public class AppDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AppDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] c=request.getCookies();
		PrintWriter printWriter=response.getWriter();
		for (Cookie cookie : c) {
			if (cookie.getName().equals("res")) {
				printWriter.println("<h1 style='colour:red'>"+cookie.getValue()+"</h1>");
			}
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
