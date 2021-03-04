package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		int updated_id = Integer.parseInt(id);
		String username = request.getParameter("uname");
		String password = request.getParameter("pswd");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");

		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second", "root", "Asmita10");
			PreparedStatement ps = conn.prepareStatement("Insert into record values (?,?,?,?,?)");
			ps.setInt(1,updated_id);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, fullname);
			ps.setString(5, email);
			
			int row = ps.executeUpdate();
			if(row>0)
			{
				request.setAttribute("result", "You are sucessfully registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
			else
			{
				request.setAttribute("wrong_result", "You entered wrong data. Please enter again");
				request.getRequestDispatcher("register.jsp").forward(request, response);
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
