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


@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try 
		{
			 
			String newid = request.getParameter("id");
			int converted_id = Integer.parseInt(newid);
			String Username = request.getParameter("uname");
			String Password = request.getParameter("pswd");
			String Fullname = request.getParameter("fname");
			String Email = request.getParameter("email");
		
			//System.out.println(converted_id);
			//System.out.println(Username);

			Class.forName("com.mysql.jdbc.Driver");
	
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "Asmita10");
			
			PreparedStatement ps = conn.prepareStatement("UPDATE record SET username = ?, password=?, fullname=?, email=? WHERE id = ? ");
			
			ps.setString(1, Username);
			ps.setString(2, Password);
			ps.setString(3, Fullname);
			ps.setString(4, Email);
			ps.setInt(5, converted_id);
			int rowsDeleted = ps.executeUpdate();
			
			if (rowsDeleted > 0) 
			{
				request.getRequestDispatcher("recordServlet").forward(request, response);
			}
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		doGet(request, response);
	}

}
