import FlappyBird.FlappyBird;

import javax.swing.*;
import java.awt.*;

public class SplitPane extends JFrame {
    JLabel leftLabel = new JLabel();
    JLabel rightLabel = new JLabel();

    FlappyBird flappyBird = new FlappyBird();

    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
            new JScrollPane(flappyBird), new JScrollPane(rightLabel));

    public SplitPane(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame myFrame = new JFrame("SingSong");
        myFrame.setLocation(100, 100);
        myFrame.setSize(new Dimension(1600, 600));

        GridLayout layout = new GridLayout(1, 2);
        myFrame.setLayout(layout);

        FlappyBird flappyBird = new FlappyBird();

        JPanel jp = new JPanel();
        jp.setBackground(new Color(0x00FF00FF));

        JPanel jp2 = new JPanel(new BorderLayout());
        jp2.setBackground(new Color(0x00000000));

        myFrame.add(flappyBird);
        myFrame.add(jp2);

        myFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new SplitPane();
    }


}
