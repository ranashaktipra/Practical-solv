import java.sql.*;

public class Slip9A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
	pst.setInt(1, 110);
	pst.setString(2, "suresh");
	pst.setInt(3, 500000);
	pst.executeUpdate();
	System.out.println("Record Inserted");
	
	con.close();
	}

}