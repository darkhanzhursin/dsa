package fpp.classworks.lesson9StackQueue.swing;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().show();
            }
        });
    }
}
