package miu.mpp.lab_12_swing.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtility extends JFrame implements ActionListener {
    private final String counter = "Count Letters";
    private final String reverse = "Reverse Letters";
    private final String remove = "Remove Duplicates";

    private JTextField inputField, outputField;
    private JButton countBtn, reverseBtn, removeBtn;

    public StringUtility() {
        setTitle("String Utility");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the menu
        JMenu myMenu = new JMenu("My Menu");

        // Create three menu items
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        JMenuItem menuItem3 = new JMenuItem("Item 3");

        // Add action listeners to menu items
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);

        // Add menu items to the menu
        myMenu.add(menuItem1);
        myMenu.add(menuItem2);
        myMenu.add(menuItem3);

        // Add the menu to the menu bar
        menuBar.add(myMenu);

        // Set the menu bar
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        JPanel leftPanel = new JPanel(new GridLayout(3, 1));
        countBtn = new JButton(counter);
        reverseBtn = new JButton(reverse);
        removeBtn = new JButton(remove);
        leftPanel.add(countBtn);
        leftPanel.add(reverseBtn);
        leftPanel.add(removeBtn);
        // Set action commands for buttons
        countBtn.setActionCommand(counter);
        reverseBtn.setActionCommand(reverse);
        removeBtn.setActionCommand(remove);

        // Add action listeners to buttons
        countBtn.addActionListener(this);
        reverseBtn.addActionListener(this);
        removeBtn.addActionListener(this);

        JPanel rightPanel = new JPanel(new GridLayout(4, 1));
        JLabel inputLabel = new JLabel("Input");
        inputField = new JTextField();
        //inputField.setBounds(90, 50, 130, 25);
        JLabel outputLabel = new JLabel("Output");
        outputField = new JTextField();
        //outputField.setBounds(90, 50, 130, 25);
        outputField.setEditable(false);
        rightPanel.add(inputLabel);
        rightPanel.add(inputField);
        rightPanel.add(outputLabel);
        rightPanel.add(outputField);

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);
        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        String command = e.getActionCommand();
        if (command.equals(counter)) {
            int l = input.length();
            outputField.setText(Integer.toString(l));
        } else if (command.equals(reverse)) {
            StringBuilder sb = new StringBuilder(input).reverse();
            outputField.setText(sb.toString());
        } else if (command.equals(remove)){
            String s = removeDuplicates(input);
            outputField.setText(s);
        } else {
            // If a menu item was clicked
            JMenuItem menuItem = (JMenuItem) e.getSource();
            String itemName = menuItem.getText();
            outputField.setText(itemName + " clicked");
        }
    }

    private String removeDuplicates(String s) {
        Set<Character> set = new LinkedHashSet<>();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            set.add(c);
        }
        char[] chars = new char[set.size()];
        int index = 0;
        for (Character c : set) {
            chars[index++] = c;
        }
        String res = new String(chars);
        return res;
    }
}
