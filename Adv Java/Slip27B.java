import java.sql.*;
class Slip27B{
    public static void main(String[] args)throws Exception{
    	Class.forName("oracle.jdbc.driver.OracleDriver");  
     	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery("Select * from teacher");
        rs.last();
            System.out.println("Result Set : Last ");
            System.out.println(""+rs.getInt(1));
            System.out.println(""+rs.getString(2));
            System.out.println(""+rs.getString(3));
            
        rs.previous();
            System.out.println("\nResult Set : Previous ");
            System.out.println(""+rs.getInt(1));
            System.out.println(""+rs.getString(2));
            System.out.println(""+rs.getString(3));       

        rs.first();
            System.out.println("\nResult Set : First ");
            System.out.println(""+rs.getInt(1));
            System.out.println(""+rs.getString(2));
            System.out.println(""+rs.getString(3));
           
	}
}