import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/slip4Q1b")

public class Slip4B extends HttpServlet implements Servlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();

		pw.println("INFORMATION OF SERVER");

		pw.println("Server Name:" + req.getServerName());

		pw.println("Server Port:" + req.getServerPort());

		pw.println(" Ip Address:" + req.getRemoteAddr());

		pw.println(" CLient Browser:" + req.getHeader("User-Agent"));

		pw.println("Operating System:" +  System.getProperty("os.name"));

		pw.close();
	}

}
