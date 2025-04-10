<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8" %>
 
<html>
<body>

    <%! int hno; 
        String hname,address; 
    %>
    <% try
    { 
    	 Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from college"); %>
        <table border="1" width="40%">
            <tr>
                <td>Hospital No</td>
                <td>Name</td>
                <td>Address</td>
            </tr>
            <% while(rs.next()) { %>
                <tr>
                    <td>
                        <%= rs.getInt("cid") %>
                    </td>
                    <td>
                        <%= rs.getString("cname") %>
                    </td>
                    <td>
                        <%= rs.getString("addr") %>
                    </td>
                </tr>
                <% 
            } 
                con.close(); 
            }
            catch(Exception e){ 
                out.println(e); 
            } 
            %>
</body>

</html>