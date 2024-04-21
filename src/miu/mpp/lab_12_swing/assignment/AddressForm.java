package miu.mpp.lab_12_swing.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressForm extends JFrame implements ActionListener {

    private JTextField nameField, streetField, cityField, stateField, zipField;
    private JButton submit;
    public AddressForm() {
        setTitle("Address Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel to hold the form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 5, 5));

        // Panel for the first row of text fields
        JPanel firstRowPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns
        firstRowPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        // Add the panel to the frame
        // Add components to the panel
        firstRowPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        firstRowPanel.add(nameField);

        firstRowPanel.add(new JLabel("Street:"));
        streetField = new JTextField();
        firstRowPanel.add(streetField);

        firstRowPanel.add(new JLabel("City:"));
        cityField = new JTextField();
        firstRowPanel.add(cityField);

        // Panel for the second row of text fields
        JPanel secondRowPanel = new JPanel(new GridLayout(2, 2, 5, 5)); // 2 rows, 2 columns
        secondRowPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        secondRowPanel.add(new JLabel("State:"));
        stateField = new JTextField();
        secondRowPanel.add(stateField);

        secondRowPanel.add(new JLabel("Zip:"));
        zipField = new JTextField();
        secondRowPanel.add(zipField);

        JPanel submitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        submit = new JButton("Submit");
        submit.addActionListener(this);
        submitPanel.add(submit);
        // Add rows panels to the main panel
        panel.add(firstRowPanel);
        panel.add(secondRowPanel);
        // Add panels to the frame
        add(panel, BorderLayout.CENTER); // Add form panel to the center
        add(submitPanel, BorderLayout.SOUTH); // Add submit panel to the bottom
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle submit action here
        String name = nameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String zip = zipField.getText();

        // For now, just print the values to console
        System.out.println("Name: " + name);
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
    }
}
