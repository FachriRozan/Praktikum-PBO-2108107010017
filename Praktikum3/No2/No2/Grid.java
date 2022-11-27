import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * set GridLayout
 */
public class Grid {
    public Grid() {
        JFrame frame = new JFrame("Layout Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        frame.setLayout(new GridLayout(3, 3));

        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }
}