import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Slip3B extends Applet implements Runnable {
    private Thread animationThread;
    private boolean running = false;
    private int ballX = 50;
    private int ballY = 50;
    private int ballDiameter = 50;
    private int xDirection = 5;
    private int yDirection = 5;
    private Color ballColor = Color.RED;
    private Random random = new Random();

    @Override
    public void init() {
        setSize(800, 600);
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
            ballX += xDirection;
            ballY += yDirection;

            // Bounce off walls and change color
            if (ballX <= 0 || ballX >= getWidth() - ballDiameter) {
                xDirection = -xDirection;
                ballColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            }
            if (ballY <= 0 || ballY >= getHeight() - ballDiameter) {
                yDirection = -yDirection;
                ballColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            }

            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(ballColor);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }
}
