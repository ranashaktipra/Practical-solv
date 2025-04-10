import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Slip20B extends Applet implements Runnable {
    private Thread animationThread;
    private boolean running = false;
    private int waveOffset = 0;

    @Override
    public void init() {
        setSize(500, 500);
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
            waveOffset += 5;
            if (waveOffset > 360) {
                waveOffset = 0;
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
        
        // Draw temple base
        g.setColor(Color.GRAY);
        g.fillRect(150, 300, 200, 150);

        // Draw temple pillars
        g.setColor(Color.DARK_GRAY);
        g.fillRect(180, 250, 20, 100);
        g.fillRect(300, 250, 20, 100);

        // Draw temple roof
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {130, 250, 370}, new int[] {300, 200, 300}, 3);

        // Draw flag on top of temple with wave effect
        drawFlag(g, 240, 160);
    }

    private void drawFlag(Graphics g, int x, int y) {
        // Flag dimensions
        int flagWidth = 40;
        int flagHeight = 20;

        // Draw flag pole
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, 5, 40);

        // Draw flag with wave effect
        g.setColor(Color.ORANGE);
        for (int i = 0; i < flagWidth; i++) {
            int waveHeight = (int) (Math.sin((i + waveOffset) * Math.PI / 180) * 5);
            g.drawLine(x + 5 + i, y + waveHeight, x + 5 + i, y + flagHeight + waveHeight);
        }
    }
}
