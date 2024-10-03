import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hard {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public Hard() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Hard hard = new Hard();
            hard.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Molly Learning SWING");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new GridLayout(2, 1));


            ta = new JTextArea();
            ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
            mainFrame.add(ta);//add typing area



            controlPanel = new JPanel();
            controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel

            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        private void showEventDemo() {

            JButton okButton = new JButton("OK");
            JButton submitButton = new JButton("Submit");
            JButton cancelButton = new JButton("Cancel");

            okButton.setActionCommand("OK");
            submitButton.setActionCommand("Submit");
            cancelButton.setActionCommand("Cancel");


            controlPanel.add(okButton, BorderLayout.WEST);
            controlPanel.add(submitButton, BorderLayout.EAST);
            controlPanel.add(cancelButton, BorderLayout.CENTER);

            mainFrame.setVisible(true);
        }
}
