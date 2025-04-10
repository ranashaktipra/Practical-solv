import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/slip29Q1b")
public class Slip29B extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get current session
		HttpSession session = request.getSession(true);

		// Get current timeout value
		int currentTimeout = session.getMaxInactiveInterval();

		// Print current timeout value
		PrintWriter out = response.getWriter();
		out.println("Current Session Timeout: " + currentTimeout + " milli-seconds");

		session.setMaxInactiveInterval(2000);
		out.println("Session Inactive time change = "+session.getMaxInactiveInterval());
	}
}