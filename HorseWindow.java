import javax.swing.*;
import java.awt.*;

public class HorseWindow {

    private JFrame frame;
    private JTextField tf1 = new JTextField("30");
    private JTextField tf2 = new JTextField("30");
    private JTextField tf3 = new JTextField("30");

    public HorseWindow() {
        frame = new JFrame("Horse race");
        JPanel jpUp = new JPanel();
        JPanel jpDown = new JPanel();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250, 100);
        frame.setLayout(new GridLayout(2, 1));
        jpUp.add(tf1);
        jpUp.add(tf2);
        jpUp.add(tf3);
        JButton bt = new JButton("Start");
        jpDown.add(bt);
        frame.add(jpUp);
        frame.add(jpDown);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public JTextField getTf1() {
        return tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public JTextField getTf3() {
        return tf3;
    }

}
