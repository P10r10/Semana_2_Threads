import javax.swing.*;

public class RamdomWindow {
    private JFrame frame;

    public RamdomWindow() {
        frame = new JFrame("Random");
        JButton jb = new JButton("Stop");
        frame.add(jb);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
