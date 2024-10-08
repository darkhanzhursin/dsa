package miu.mpp.lab7.jdbc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A basic JFC 1.1 based application.
 */

public class StudentFrame extends JFrame {
    private JScrollPane JScrollPane1;

    public StudentFrame() {

        //{{INIT_CONTROLS

        setTitle("JDBC example");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(502, 349);
        setVisible(false);
        Bshowdata.setText("showdata");
        Bshowdata.setActionCommand("showdata");
        getContentPane().add(Bshowdata);
        Bshowdata.setBounds(48, 288, 100, 25);
        Bshowselection.setText("showselection");
        Bshowselection.setActionCommand("showselection");
        getContentPane().add(Bshowselection);
        Bshowselection.setBounds(180, 288, 120, 24);
        BExit.setText("Exit");
        BExit.setActionCommand("Exit");
        getContentPane().add(BExit);
        BExit.setBounds(324, 288, 100, 25);


        //}}

        //{{INIT_MENUS
        //}}

        //{{REGISTER_LISTENERS
        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        Bshowdata.addActionListener(lSymAction);
        Bshowselection.addActionListener(lSymAction);
        BExit.addActionListener(lSymAction);
        //}}
    }


    /**
     * The entry point for this application.
     * Sets the Look and Feel to the System Look and Feel.
     * Creates a new JFrame1 and makes it visible.
     */
    static public void main(String args[]) {
        try {
            // Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }


            //Create a new instance of our application's frame, and make it visible.
            (new StudentFrame()).setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }


    //{{DECLARE_CONTROLS
    JButton Bshowdata = new JButton();
    JButton Bshowselection = new JButton();
    JButton BExit = new JButton();
    //}}

    //{{DECLARE_MENUS
    //}}

    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            Object object = event.getSource();
            if (object == StudentFrame.this)
                StudentFrame_windowClosing(event);
        }
    }

    void StudentFrame_windowClosing(WindowEvent event) {
        // to do: code goes here.

        StudentFrame_windowClosing_Interaction1(event);
    }

    void StudentFrame_windowClosing_Interaction1(WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object object = event.getSource();
            if (object == Bshowdata)
                Bshowdata_actionPerformed(event);
            else if (object == Bshowselection)
                Bshowselection_actionPerformed(event);
            else if (object == BExit)
                BExit_actionPerformed(event);

        }
    }

    void Bshowdata_actionPerformed(ActionEvent event) {
        String id, name;

        // load data from the database!!

        DBConnection dbconnect = new DBConnection();
        dbconnect.connect();
        ResultSet rs;
        rs = dbconnect.doQuery("Select * from StudentInfo");

        try {
            while (rs.next()) {
                id = rs.getString("StudentID");
                name = rs.getString("StudentName");
                System.out.println("Student ID is " + id + "   Student Name is " + name);
            }
        } catch (SQLException ex) {
            System.err.println("error in database connection");
        }
        dbconnect.close();  //close database connection
    }

    void Bshowselection_actionPerformed(ActionEvent event) {
        String id = "";
        JFrame2 frame = new JFrame2();
        frame.setid(id);
        frame.setVisible(true);
    }

    void BExit_actionPerformed(ActionEvent event) {
        exitApplication();
    }
}
