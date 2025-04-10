import java.sql.*;
public class Slip11B {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("select p.pno,pname,qty,rate,amount,sid from product1 p, "
			+ "sales1 s  where p.pno=s.pno and salesdate between '10-jan-24' and '12-jan-24'") ;
	while(rs.next())
	{
		System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	}
	
	con.close();
	}

}