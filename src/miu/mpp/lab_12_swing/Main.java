package miu.mpp.lab_12_swing;

import miu.mpp.lab_12_swing.assignment.AddressForm;
import miu.mpp.lab_12_swing.assignment.StringUtility;
import miu.mpp.lab_12_swing.examples.Ch7JFrameSubclass1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        Ch7JFrameSubclass1 myFrame;
//        myFrame = new Ch7JFrameSubclass1();
//
//        myFrame.setVisible(true);


//        AddressForm addressForm = new AddressForm();
//        addressForm.setVisible(true);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StringUtility();
            }
        });
    }
}
