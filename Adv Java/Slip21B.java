import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/slip21Q1b")
public class Slip21B extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String studno = request.getParameter("studno");
		String name = request.getParameter("studname");
		String c1 = request.getParameter("studclass");
		int totalMarks = Integer.parseInt(request.getParameter("studmarks"));

		float percentage = (float) totalMarks / 5;
		String grade;
		if (percentage >= 80) {
			grade = "A";
		} else if (percentage >= 60) {
			grade = "B";
		} else if (percentage >= 40) {
			grade = "C";
		} else {
			grade = "D";
		}

		// Display student details and grade
		out.println("<html>");
		out.println("<head><title>Student Details</title></head>");
		out.println("<body>");
		out.println("<h1>Student Details</h1>");
		out.println("<p>Seat No: " + studno + "</p>");
		out.println("<p>Name: " + name + "</p>");
		out.println("<p>Class: " +c1 + "</p>");
		out.println("<p>Total Marks: " + totalMarks + "</p>");
		out.println("<p>Percentage: " + percentage + "</p>");
		out.println("<p>Grade: " + grade + "</p>");
		out.println("</body></html>");
	}
}