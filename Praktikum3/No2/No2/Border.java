import javax.swing.*;
import java.awt.BorderLayout;

/**
 * setBorderLayout
 */
public class Border {
    public Border() {
        JFrame frame = new JFrame("Layout Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Five");
        JButton button3 = new JButton("Three");
        JButton button4 = new JButton("Two");
        JButton button5 = new JButton("Four");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }
}