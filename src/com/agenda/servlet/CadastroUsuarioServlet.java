package com.agenda.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroUsuarioServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("nome");
		request.getParameter("tel");
		request.getParameter("email");
		request.getParameter("endereco");
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("tel"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("end"));
		
	}
}