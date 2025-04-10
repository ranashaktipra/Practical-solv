import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Slip8A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *  from  employee where ename like 'A%'");
	while(rs.next())
	{
		System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	}
	
	con.close();
	}

}