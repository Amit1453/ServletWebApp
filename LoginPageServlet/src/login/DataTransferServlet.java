package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDto;


@WebServlet("/dataTransferServlet")
public class DataTransferServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
			String stringid = request.getParameter("id");
			//int converted_id = Integer.parseInt(stringid);
			String Username = request.getParameter("uname");
			String Password = request.getParameter("pswd");
			String Fullname = request.getParameter("fname");
			String Email = request.getParameter("email");

			
			request.setAttribute("stringid", stringid);
			request.setAttribute("Username", Username);
			request.setAttribute("Password", Password);
			request.setAttribute("Fullname", Fullname);
			request.setAttribute("Email", Email);
			
			

			request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		doGet(request, response);
	}

}
