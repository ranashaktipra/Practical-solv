import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class Slip19B extends JFrame implements ActionListener
{
      // Create GUI cl3;
      JTextField trno, tname, tper;
      JButton fetchButton;
      ResultSet rs;
      Connection con;
     Statement st;
      Slip19B(){
          setVisible(true);
          setSize(500,500);
          setLayout(new FlowLayout());
          l1 = new JLabel("Roll No");
          l2 = new JLabel("Name");
          l3 = new JLabel("Per");
          trno = new JTextField(20);
          tname = new JTextField(20);
          tper = new JTextField(20);
          fetchButton = new JButton("Get Record");
          add(l1);
          add(trno);
          add(l2);
          add(tname);
          add(l3);
          add(tper);
          add(fetchButton);
          fetchButton.addActionListener(this) ;
      // Add action listener to the button
      }
         public void actionPerformed(ActionEvent e) {
            
            try {
               // Register JDBC driver
            	Class.forName("oracle.jdbc.driver.OracleDriver");  
            	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root"); 
            	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 rs = st.executeQuery( "SELECT * FROM student ");
               rs.first();
                  trno.setText(rs.getString("rno"));
                  tname.setText(rs.getString("sname"));
                  tper.setText(rs.getString("per"));
               
            } catch (Exception se) {
               
               se.printStackTrace();
            }
         }
      
      public static void main(String[] args) {
      new  Slip19B();
   }
}

