import java.awt.*;
import javax.swing.*;
class BlinkFrame extends JFrame implements Runnable
{
	JLabel lbl;
	boolean flag=false;
	BlinkFrame()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		lbl=new JLabel(new ImageIcon(".\\workplace.jpg"));
		add(lbl);
	}
	public void run()
	{
		while(true)
		{
			try
			{
				if(flag==true)
				{
					lbl.setVisible(true);
					flag=false;
					Thread.sleep(1000);
				}
				if(flag==false)
				{
					lbl.setVisible(false);
					flag=true;
					Thread.sleep(1000);
				}
			}
			catch(Exception e){e.printStackTrace();}
		}
	}
}
class BlinkDemo
{
	public static void main(String arg[])
	{
		BlinkFrame b= new BlinkFrame();
		Thread t=new Thread(b);
		t.start();
	}
}


BlinkDemo.java
Displaying BlinkDemo.java.