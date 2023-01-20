package dev.cooley;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI {

    private JFrame myFrame;
    public static void main(String[] args) {
        GUI myGUI = new GUI();
        myGUI.show();
    }

    public GUI(){
        myFrame = new JFrame("I know you all too well");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a JPanel to hold multiple components
        JPanel myPanel = new JPanel();

        BorderLayout borderLayoutManager = new BorderLayout();
        myPanel.setLayout(borderLayoutManager);

        //Creating a label
        JLabel myLabel = new JLabel("And I can't forget the memories");
        myLabel.setFont(new Font("Serif", Font.BOLD, 36));
        myLabel.setHorizontalAlignment(JLabel.CENTER);
        myLabel.setForeground(Color.RED);
        myPanel.add(myLabel, BorderLayout.NORTH);

        //Creating a button
        //JButton myButton = new JButton("You say that it's not fair");
        //myPanel.add(myButton, BorderLayout.WEST);

        //Creating a left panel to hold mulitple JButtons
        JPanel leftPanel = new JPanel();
        BoxLayout leftBoxLayoutManager = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
        leftPanel.setLayout(leftBoxLayoutManager);

        leftPanel.add(new JButton("JButton One"));
        leftPanel.add(new JButton("JButton Two"));
        leftPanel.add(new JButton("JButton Three"));
        leftPanel.add(new JButton("JButton Four"));
        leftPanel.add(new JButton("JButton Five"));

        myPanel.add(leftPanel, BorderLayout.WEST);

        //Create second button
        //JButton mySecondButton = new JButton("That you're not the person you wanna be");
        //myPanel.add(mySecondButton, BorderLayout.EAST);

        //Adding a right panel to hold many JLabels
        JPanel centerPanel = new JPanel();
        BoxLayout centerBoxLayoutManager = new BoxLayout(centerPanel, BoxLayout.Y_AXIS);
        centerPanel.setLayout(centerBoxLayoutManager);

        centerPanel.add(new JLabel("JLabels: "));
        centerPanel.add(new JLabel("------"));
        centerPanel.add(new JLabel("You say that it's not fair"));
        centerPanel.add(new JLabel("That you're not the person you wanna be"));
        centerPanel.add(new JLabel("------"));

        myPanel.add(centerPanel, BorderLayout.CENTER);

        //Creating a right panel to hold mulitple JButtons
        JPanel rightPanel = new JPanel();
        BoxLayout rightBoxLayoutManager = new BoxLayout(rightPanel, BoxLayout.Y_AXIS);
        rightPanel.setLayout(rightBoxLayoutManager);

        rightPanel.add(new JButton("JButton One"));
        rightPanel.add(new JButton("JButton Two"));
        rightPanel.add(new JButton("JButton Three"));
        rightPanel.add(new JButton("JButton Four"));
        rightPanel.add(new JButton("JButton Five"));

        myPanel.add(rightPanel, BorderLayout.EAST);

        //Creating a text area
        JTextArea myTextArea = new JTextArea("Text Area: And ooohhh you'll be the end of me....");
        Font serifFont18 = new Font("Serif", Font.BOLD, 18);
        myTextArea.setFont(serifFont18);
        myPanel.add(myTextArea, BorderLayout.SOUTH);

        //Add the JPanel to the frame
        myFrame.add(myPanel);

        myFrame.setSize(600,300);
    }

    private void show(){
        myFrame.setVisible(true);
    }
}
