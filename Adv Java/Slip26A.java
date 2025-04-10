import java.sql.*;
public class Slip26A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("select cname from  college");
	while(rs.next())
	{
		System.out.println(""+rs.getString(1));
	}
	
	con.close();
	}

}
