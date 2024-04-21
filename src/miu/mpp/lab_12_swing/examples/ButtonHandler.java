package miu.mpp.lab_12_swing.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        JRootPane rootPane = clickedButton.getRootPane( );
        Frame     frame    = (JFrame) rootPane.getParent();

        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();

        String  buttonText = clickedButton.getText();
        frame.setTitle("You clicked " + buttonText);

    }
}
