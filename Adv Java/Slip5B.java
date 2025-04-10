import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Slip5B extends Applet implements Runnable {
    private Thread signalThread;
    private boolean running = false;
    private String currentSignal = "RED";

    @Override
    public void init() {
        setSize(200, 400);
        setBackground(Color.WHITE);
    }

    @Override
    public void start() {
        if (signalThread == null) {
            signalThread = new Thread(this);
            running = true;
            signalThread.start();
        }
    }

    @Override
    public void stop() {
        if (signalThread != null) {
            running = false;
            signalThread = null;
        }
    }

    @Override
    public void run() {
        while (running) {
            try {
                switch (currentSignal) {
                    case "RED":
                        Thread.sleep(5000); // Red signal for 5 seconds
                        currentSignal = "GREEN";
                        break;
                    case "GREEN":
                        Thread.sleep(5000); // Green signal for 5 seconds
                        currentSignal = "YELLOW";
                        break;
                    case "YELLOW":
                        Thread.sleep(2000); // Yellow signal for 2 seconds
                        currentSignal = "RED";
                        break;
                }
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw signal light box
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 300);

        // Draw red light
        g.setColor(currentSignal.equals("RED") ? Color.RED : Color.GRAY);
        g.fillOval(75, 70, 50, 50);

        // Draw yellow light
        g.setColor(currentSignal.equals("YELLOW") ? Color.YELLOW : Color.GRAY);
        g.fillOval(75, 170, 50, 50);

        // Draw green light
        g.setColor(currentSignal.equals("GREEN") ? Color.GREEN : Color.GRAY);
        g.fillOval(75, 270, 50, 50);
    }
}
