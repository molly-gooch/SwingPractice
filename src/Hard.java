import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hard implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel controlPanel2;
    private JPanel controlPanel3;
    private JPanel controlPanel4;
    private JPanel controlPanel5;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH = 800;
    private int HEIGHT = 700;


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

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        //end menu at top

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH - 100, HEIGHT - 50);
        mainFrame.add(mb);  //add menu bar
        mainFrame.setJMenuBar(mb); //set menu bar



        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel2 = new JPanel();
        controlPanel3 = new JPanel();
        controlPanel4 = new JPanel();
        controlPanel5 = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3));
        controlPanel2.setLayout(new GridLayout(2,1));
        controlPanel3.setLayout(new GridLayout(1,2));
        controlPanel4.setLayout(new BorderLayout());
        controlPanel5.setLayout(new GridLayout(1,9));

        mainFrame.add(controlPanel3);
        mainFrame.add(controlPanel4);
        controlPanel4.add(ta);//add typing area
        controlPanel4.add(controlPanel5, BorderLayout.SOUTH);
        controlPanel3.add(controlPanel);
        controlPanel3.add(controlPanel2);


        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton top1 = new JButton("Top 1");
        JButton top2 = new JButton("Top 2");
        JButton top3 = new JButton("Top 3");
        JButton top4 = new JButton("Top 4");
        JButton one = new JButton("1");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        JLabel top01 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top02 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top03 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top04 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top05 = new JLabel("Top 0", JLabel.CENTER);
        JLabel topRight = new JLabel("TopRight", JLabel.CENTER);
        JLabel label0 = new JLabel("0", JLabel.CENTER);
        JLabel label01 = new JLabel("0", JLabel.CENTER);
        JLabel label02 = new JLabel("0", JLabel.CENTER);
        JLabel label03 = new JLabel("0", JLabel.CENTER);
        JLabel label04 = new JLabel("0", JLabel.CENTER);

        controlPanel2.add(topRight);
        controlPanel2.add(one);

        controlPanel.add(top01);
        controlPanel.add(top1);
        controlPanel.add(top02);
        controlPanel.add(top2);
        controlPanel.add(top03);
        controlPanel.add(top3);
        controlPanel.add(top04);
        controlPanel.add(top4);
        controlPanel.add(top05);
        controlPanel5.add(label0);
        controlPanel5.add(button1);
        controlPanel5.add(label01);
        controlPanel5.add(button2);
        controlPanel5.add(label02);
        controlPanel5.add(button3);
        controlPanel5.add(label03);
        controlPanel5.add(button4);
        controlPanel5.add(label04);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}
