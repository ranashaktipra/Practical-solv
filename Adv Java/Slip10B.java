import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/slip10Q1b")
public class Slip10B extends HttpServlet {

	public void service(HttpServletRequest request,  HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student");
			out.print("<table border=1>");
			while(rs.next()){
				out.print("<tr>");

				out.print("<td>");
				out.print(rs.getInt(1));
				out.print("</td>");

				out.print("<td>");
				out.print(rs.getString(2));
				out.print("</td>");

				out.print("<td>");
				out.print(rs.getInt(3));
				out.print("</td>");

				out.print("</tr>");
			}
			out.print("</table>");
		}
		catch(Exception e){
			out.print(e);
		}
	}
}