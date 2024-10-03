import javax.swing.*;
import java.awt.*;

public class Medium1 {
    private JFrame mainFrame;
    private JPanel controlPanel;



    private int WIDTH=800;
    private int HEIGHT=700;

    public Medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium1 medium1 = new Medium1();
        medium1.showEventDemo();
    }


    private void prepareGUI() {
        mainFrame = new JFrame("Example with grid inside border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3));


        mainFrame.add(controlPanel, BorderLayout.CENTER);



    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JLabel label1 = new JLabel("label1", JLabel.CENTER);
        JLabel label2 = new JLabel("label2", JLabel.CENTER);



        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        button4.setActionCommand("4");

        mainFrame.add(button1, BorderLayout.NORTH);
        controlPanel.add(button2);
        controlPanel.add(label1);
        mainFrame.add(button3, BorderLayout.SOUTH);
        controlPanel.add(button4);
        controlPanel.add(label2);
        controlPanel.add(button5);

        mainFrame.setVisible(true);
    }
}
