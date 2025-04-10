import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Slip12A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	Statement st=con.createStatement();
	int c=0;
	ResultSet rs=st.executeQuery("select * from employee");
	while(rs.next())
	{
		c++;
	}
	System.out.println("No. of records=\t"+c);
	con.close();
	}

}