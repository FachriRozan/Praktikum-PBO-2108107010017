import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * setFlowLayout
 */
public class Flow {
    public Flow() {
        JFrame frame = new JFrame("Layout Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        frame.setLayout(new FlowLayout());
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }
}