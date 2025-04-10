import java.awt.*;

public class Slip2B extends Frame implements Runnable
{
	Thread t;
	int x1,x2,x3,y3,x4,y4,x5,ln;
	Slip2B()
	{
		setVisible(true);
		setSize(500,500);
		t=new Thread(this);
		t.start();
		ln=1;
	}
	public void run()
	{
		try{      if(ln==1) {         for(x1=200;x1>100;)
		{
			Thread.sleep(200);
			repaint();
		}
		}
			ln=2;
			if(ln==2) {        for(x2=100;x2<150;)
			{
				Thread.sleep(200);
				repaint();
			}
			}
			ln=3;
			if(ln==3) {       for(x3=150,y3=100;x3>125&&y3<125;)
			{
				Thread.sleep(200);
				repaint();
			}
			}
			ln=4;
			if(ln==4) {     for(x4=125,y4=125;x4<150&&y4<150;)
			{
				Thread.sleep(200);
				repaint();
			}
			}
			ln=5;
			if(ln==5)  {     for(x5=150;x5>100;)
			{
				Thread.sleep(200);
				repaint();
			}
			}
			ln=1;
		}catch(Exception e){
			System.out.println(e);
		}
		run();
	}
	public void paint(Graphics g)
	{
		if(ln==1&&x1>100)
		{
			g.drawLine(100,200,100,x1-=5);
		}
		if(ln==2&&x2<150)
		{
			g.drawLine(100,200,100,100);
			g.drawLine(100,100,x2+=5,100);
		}
		if(ln==3&&x3>125&&y3<125)
		{
			g.drawLine(100,200,100,100);
			g.drawLine(100,100,150,100);
			g.drawLine(150,100,x3-=5,y3+=5);
		}
		if(ln==4&&x4<150&&y4<150)
		{
			g.drawLine(100,200,100,100);
			g.drawLine(100,100,150,100);
			g.drawLine(150,100,125,125);
			g.drawLine(125,125,x4+=5,y4+=5);
		}
		if(ln==5&&x5>100)
		{
			g.drawLine(100,200,100,100);
			g.drawLine(100,100,150,100);
			g.drawLine(150,100,125,125);
			g.drawLine(125,125,150,150);
			g.drawLine(150,150,x5-=5,150);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Slip2B();
	}

}