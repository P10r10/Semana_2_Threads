import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamdomWindow {
    private JFrame frame;

    public RamdomWindow(Thread t1, Thread t2) {
        frame = new JFrame("Random");
        JButton jb = new JButton("Stop");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.interrupt();
                t2.interrupt();
            }
        });
        frame.add(jb);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
