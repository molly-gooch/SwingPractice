import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Easy1 {

    private JFrame mainFrame;

    private int WIDTH=800;
    private int HEIGHT=700;

    public Easy1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy1 easy1 = new Easy1();
        easy1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Example with grid layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));
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

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);

        mainFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    }

}


