import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Slip8B extends Applet implements Runnable {
    private Thread watchThread;
    private boolean running = false;
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void init() {
        setSize(400, 200);
        setBackground(Color.BLACK);
    }

    @Override
    public void start() {
        if (watchThread == null) {
            watchThread = new Thread(this);
            running = true;
            watchThread.start();
        }
    }

    @Override
    public void stop() {
        if (watchThread != null) {
            running = false;
            watchThread = null;
        }
    }

    @Override
    public void run() {
        while (running) {
            repaint();
            try {
                Thread.sleep(1000); // Update the time every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.setFont(new Font("SansSerif", Font.BOLD, 36));
        g.drawString(getCurrentTime(), 100, 100);
    }

    private String getCurrentTime() {
        return timeFormat.format(new Date());
    }
}
