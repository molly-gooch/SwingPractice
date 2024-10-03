import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Easy2 {

    private JFrame mainFrame;

    private int WIDTH=800;
    private int HEIGHT=700;

    public Easy2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy2 easy2 = new Easy2();
        easy2.showEventDemo();
    }


    private void prepareGUI() {
        mainFrame = new JFrame("Example with border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());
    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");


        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        button4.setActionCommand("4");

        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button2, BorderLayout.EAST);
        mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.add(button4, BorderLayout.WEST);
        mainFrame.add(button5, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    }
}
