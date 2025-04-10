import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/slip23Q1b")
public class Slip23B extends HttpServlet {

	public void service(HttpServletRequest request,  HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st = con.createStatement();
			String u=request.getParameter("uname");
			String p=request.getParameter("pwd");
			ResultSet rs = st.executeQuery("Select * from login where uname='"+u+"' and pwd='"+p+"'");
			if(rs.next())
				out.print("Login Success");
			else
				out.print("Login UnSuccess");
		}catch(Exception e){
			out.print(e);
		}
	}
}