import javax.swing.*;
import java.awt.*;

public class Medium2 {
    private JFrame mainFrame;
    private JPanel controlPanel;


    private int WIDTH=800;
    private int HEIGHT=700;

    public Medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium2 medium2 = new Medium2();
        medium2.showEventDemo();
    }


    private void prepareGUI() {
        mainFrame = new JFrame("Example with border inside grid layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));

        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());


    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");
        JLabel label1 = new JLabel("label", JLabel.CENTER);




        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        button4.setActionCommand("4");

        controlPanel.add(button9, BorderLayout.EAST);
        controlPanel.add(button10, BorderLayout.SOUTH);
        controlPanel.add(label1, BorderLayout.WEST);


        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(controlPanel);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);


        mainFrame.setVisible(true);
    }
}
