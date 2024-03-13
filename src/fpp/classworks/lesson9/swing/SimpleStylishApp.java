package fpp.classworks.lesson9.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleStylishApp extends JFrame {
    private JButton button;
    private JTextField inputField;
    private JLabel resultLabel;

    public SimpleStylishApp() {
        setTitle("Stylish App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Top panel for input field and button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(Color.WHITE);

        inputField = new JTextField(15);
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));

        button = new JButton("Submit");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLUE);
        button.setFocusPainted(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    int result = calculateResult(number);
                    resultLabel.setText("Result: " + result);
                } else {
                    JOptionPane.showMessageDialog(SimpleStylishApp.this, "Please enter a number!");
                }
            }
        });

        topPanel.add(inputField);
        topPanel.add(button);

        // Center panel for result label
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanel.add(resultLabel);

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);

        add(panel);
    }

    private int calculateResult(int number) {
        // Sample logic: doubling the number
        return number * 2;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleStylishApp app = new SimpleStylishApp();
                app.setVisible(true);
            }
        });
    }
}
