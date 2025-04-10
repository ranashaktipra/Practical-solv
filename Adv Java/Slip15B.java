import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip15B extends JFrame implements ActionListener
{

        JLabel l1, l2, l3,l4,l5;
        JTextField trno, tname, tper,tclass;
        JRadioButton male,female;
        
        JButton b;
        ResultSet rs;
        Connection con;
        PreparedStatement pst;
        Slip15B(){
            setVisible(true);
            setSize(500,500);
            setLayout(new FlowLayout());
            l1 = new JLabel("Roll No");
            l2 = new JLabel("Name");
            l3 = new JLabel("Per");
            l4 = new JLabel("Select Gender");
            l5 = new JLabel("class");
            trno = new JTextField(20);
            tname = new JTextField(20);
            tper = new JTextField(20);
            tclass = new JTextField(20);
           ButtonGroup bg=new ButtonGroup();
            male=new JRadioButton("Male",true);
            female=new JRadioButton("Female");
                        b = new JButton("Insert Record");
            bg.add(male);
            bg.add(female);
                        add(l1);
            add(trno);
            add(l2);
            add(tname);
            add(l3);
            add(tper);
            add(l4);
            add(male);
            add(female);
            add(l5);
            add(tclass);
            add(b);
            b.addActionListener(this);

            try{
            	Class.forName("oracle.jdbc.driver.OracleDriver");  
            	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
            }
            catch(Exception e){ }

        }

    public void actionPerformed(ActionEvent a){
        try {
            pst = con.prepareStatement("Insert into student values(?,?,?,?,?)");
        pst.setInt(1,Integer.parseInt(trno.getText()));  //id
        pst.setString(2, tname.getText());  //name
        pst.setInt(3,Integer.parseInt(trno.getText()));  //per
        if(male.isSelected())
        pst.setString(4,"Male");
        else if(female.isSelected())
        	pst.setString(4,"Female");
        pst.setString(5, tclass.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Record Inserted");
        } catch (Exception e) { e.printStackTrace();

        }

    }

    public static void main(String[] args)throws Exception {
      new Slip15B();
    }
}