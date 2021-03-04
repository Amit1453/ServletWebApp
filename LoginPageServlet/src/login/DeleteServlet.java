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


@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try 
		{
			 
			String stringid = request.getParameter("id");
			int converted_id = Integer.parseInt(stringid);

			Class.forName("com.mysql.jdbc.Driver");
	
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "Asmita10");
			
			PreparedStatement ps = conn.prepareStatement("Delete from record where id = ?");
			
			ps.setInt(1, converted_id);
			
			int rowdeleted = ps.executeUpdate();
			
			if(rowdeleted > 0)
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
