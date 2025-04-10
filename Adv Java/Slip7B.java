import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slip7B extends JFrame {
    private JTextField textField;
    private JButton startButton;
    private boolean running = false;

    public Slip7B() {
        textField = new JTextField(10);
        textField.setEditable(false);
        startButton = new JButton("Start");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true;
                    new Thread(new NumberRunnable()).start();
                }
            }
        });

        setLayout(new FlowLayout());
        add(textField);
        add(startButton);

        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class NumberRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                if (!running) {
                    break;
                }
                textField.setText(String.valueOf(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            running = false;
        }
    }

    public static void main(String[] args) {
        new Slip7B();
    }
}
