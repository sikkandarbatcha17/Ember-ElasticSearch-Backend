package com.sikkandar.EsBackend;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.*;
import jakarta.servlet.http.*;

import com.google.gson.Gson;
import com.sikkandar.EsBackend.model.User;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String pass;
    private String uname;
    private User validated;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		uname = request.getParameter("uname");
		pass = request.getParameter("pass");

        if(uname.equals("admin") && pass.equals("admin"))
        {
 			 validated = new User("admin",true);
        }
        else {
        	validated=new User("",false);
        }
        
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		
        String validatedUserJsonString = new Gson().toJson(validated);
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(validatedUserJsonString);
        out.flush();
	}

}
