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


@WebServlet("/sortDscServlet")
public class SortByDsc extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List list=new ArrayList();
		try 
		{
			 

			Class.forName("com.mysql.jdbc.Driver");
	
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "Asmita10");
			
			PreparedStatement ps = conn.prepareStatement("select * from record ORDER BY email DESC ");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next())
			{
				int id = rs.getInt(1);
				String username = rs.getString(2);
				String password = rs.getString(3);
				String fullname = rs.getString(4);
				String email = rs.getString(5);
				
				UserDto userdto = new UserDto(id,username,password,fullname,email);
				
				
				list.add(userdto);

			}
			
			request.setAttribute("list",list);
			
			request.getRequestDispatcher("recordinfo.jsp").forward(request, response);
			
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
