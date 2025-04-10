import java.awt.*;
public class Slip1A extends Frame implements Runnable {
	int x, y, z;
	Thread t;
	Slip1A() {
		setVisible(true);
		setSize(500,500);
		x = 50;
		y = 50;
		z = 1;
		t = new Thread(this);
		t.start();
	}
	public void mpostion() {
		x = x + 10 * z;
		if (x > this.getWidth())
			z = -1;
		if (x < 0)
			z = 1;
	}
	public void run() {
		while (true) {
			repaint();
			mpostion();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
	public void paint(Graphics g) {
		g.drawString("SSR College", x, y);
	}
	public static void main(String arg[])
	{
		new Slip1A();
	}
}