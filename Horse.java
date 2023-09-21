import java.util.Random;

import javax.swing.JTextField;

public class Horse extends Thread {
    private int movements;
    private JTextField tf;

    public Horse(JTextField tf) {
        movements = 30;
        this.tf = tf;
    }

    public void run() {
        int sleep = new Random().nextInt(800) + 200;
        while (movements > 0) {
            movements--;
            tf.setText(Integer.toString(movements));
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(movements);
    }
}
