package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDto;

@WebServlet("/loginAcess")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String pass = request.getParameter("pswd");

		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "Asmita10"); 
			PreparedStatement ps = conn.prepareStatement("Select * from record where username=? and password=?");
			//PreparedStatement ps = conn.prepareStatement("Select * from record");
			ps.setString(1, name); 
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) 
			{
				int id = rs.getInt(1);
				String username = rs.getString(2);
				String password = rs.getString(3);
				String fullname = rs.getString(4);
				String email = rs.getString(5);
			/*
				request.setAttribute("id", id);
				request.setAttribute("username", id);
				request.setAttribute("password", id);
				request.setAttribute("fullname", id);
				
			*/	
				
				UserDto userdto = new UserDto(id,username,password,fullname,email);
				
				request.setAttribute("userdto", userdto);
				
				request.getRequestDispatcher("sucess.jsp").forward(request, response);
				//System.out.println(userdto);
				
		
			}

			else 
			{
				request.setAttribute("result", "The username and password does not match");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		
		} 
		
		
		
		catch (Exception e) 
		
		{
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{

		doGet(request, response);
	}

}
