import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Slip30B extends Applet implements Runnable {
    private Thread animationThread;
    private boolean running = false;
    private int carX = 0;
    private int carY = 100;

    @Override
    public void init() {
        setSize(800, 200);
        setBackground(Color.WHITE);
    }

    @Override
    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            running = true;
            animationThread.start();
        }
    }

    @Override
    public void stop() {
        if (animationThread != null) {
            running = false;
            animationThread = null;
        }
    }

    @Override
    public void run() {
        while (running) {
            carX += 10;
            if (carX > getWidth()) {
                carX = -100;
            }
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawCar(g, carX, carY);
    }

    private void drawCar(Graphics g, int x, int y) {
        // Draw car body
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 100, 50);
        
        // Draw car roof
        g.setColor(Color.BLUE);
        g.fillRect(x + 20, y - 30, 60, 30);
        
        // Draw car windows
        g.setColor(Color.WHITE);
        g.fillRect(x + 25, y - 25, 25, 25);
        g.fillRect(x + 55, y - 25, 25, 25);
        
        // Draw car wheels
        g.setColor(Color.BLACK);
        g.fillOval(x + 15, y + 40, 20, 20);
        g.fillOval(x + 65, y + 40, 20, 20);
    }
}
