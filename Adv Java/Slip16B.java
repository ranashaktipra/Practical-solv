import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Slip16B {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	PreparedStatement st=con.prepareStatement("select *  from  student where per=(select max(per) from student)");
	
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{
		System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	}
	
	con.close();
	}

}
