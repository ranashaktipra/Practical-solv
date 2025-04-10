
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Slip20A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	Statement st=con.createStatement();
	st.executeUpdate("delete from student where sname like 's%'");	
	System.out.println("Record Deleted");
	con.close();
	}

}
