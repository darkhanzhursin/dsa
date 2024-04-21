package miu.mpp.lab_12_swing.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch7JFrameSubclass1 extends JFrame implements ActionListener {

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * Default width for buttons
     */
    private static final int BUTTON_WIDTH  = 80;

    /**
     * Default height for buttons
     */
    private static final int BUTTON_HEIGHT = 30;

    /**
     * Constant for empty string
     */
    private static final String EMPTY_STRING = "";

    /**
     * Constant for platform specific newline
     */
    private static final String NEWLINE = System.getProperty("line.separator");


    private JButton clearButton;

    private JButton addButton;



    /**
     * The Swing button for Cancel
     */
//    private JButton cancelButton;
//
//    /**
//     * The Swing button for OK
//     */
//    private JButton okButton;

    /**
     * The JTextField for the user to enter a text
     */
    private JTextField inputLine;

    /**
     * The JTextArea for displaying the entered text
     */
    private JTextArea  textArea;

    /**
     * Text shown in response to the menu selection
     */
    private JLabel   response;

    /**
     * File menu group
     */
    private JMenu    fileMenu;

    /**
     * Edi menu group
     */
    private JMenu    editMenu;


    /**
     * The JLabel for prompting the user
     */
//    private JLabel prompt;
//
//    /**
//     * The JLabel for an image
//     */
//    private JLabel image;

    /**
     * Default constructor
     */
    public Ch7JFrameSubclass1() {
        Container contentPane = getContentPane();
        //set the frame default properties
        setTitle("My First Subclass");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //set the content pane properties
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        //create two menus and their menu items
        createFileMenu();
        createEditMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester." );
        response.setBounds(50, 50, 250, 50);
        contentPane.add(response);

        //create and place two buttons on the frame's content pane
//        addButton = new JButton("ADD");
//        addButton.setBounds(70, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
//        contentPane.add(addButton);
//
//        clearButton = new JButton("CLEAR");
//        clearButton.setBounds(160, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
//        contentPane.add(clearButton);

        //registering a ButtonHandler as an action listener of the two buttons
//        ButtonHandler handler = new ButtonHandler();
//        cancelButton.addActionListener(handler);
//        okButton.addActionListener(handler);
//        okButton.addActionListener(this);
//        cancelButton.addActionListener(this);
//        addButton.addActionListener(this);
//        clearButton.addActionListener(this);
//
//        inputLine = new JTextField();
//        inputLine.setBounds(90, 50, 130, 25);
//        contentPane.add(inputLine);
//
//        inputLine.addActionListener(this);
//
//        textArea = new JTextArea();
//        textArea.setBounds(50, 5, 200, 135);
//        textArea.setBorder(BorderFactory.createLineBorder(Color.red));


//        prompt = new JLabel( );
//        prompt.setText("Please enter your name");
//        //alternative way to create the prompt
//        //  prompt = new JLabel( "Please enter your name");
//        prompt.setBounds(85, 20, 150, 25);
//
//        contentPane.add( prompt );
//
//        image = new JLabel( new ImageIcon( "cat.gif" ) );
//        image.setBounds(10, 20, 50, 50);
//        contentPane.add(image);

        //register 'Exit upon closing' as a default close operation
        //textArea.setEditable(false);
        // contentPane.add(textArea);
//      To add scroll bars to the text area

//        textArea = new JTextArea();
//        JScrollPane scrollText= new JScrollPane(textArea);
//        scrollText.setBounds(50, 5, 200, 135);
//        scrollText.setBorder(BorderFactory.createLineBorder(Color.red));
//        contentPane.add(scrollText);


        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createFileMenu() {
        JMenuItem    item;
        fileMenu = new JMenu("File");

        item = new JMenuItem("New");        //New
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Open...");    //Open...
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Save");       //Save
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Save As..."); //Save As...
        item.addActionListener( this );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    }

    /**
     * Create Edit menu and its menu items
     *
     */
    private void createEditMenu( ) {
        JMenuItem    item;

        editMenu = new JMenu("Edit");

        item = new JMenuItem("Cut");      //Cut
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Copy");    //Copy
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Paste");    //Paste
        item.addActionListener( this );
        editMenu.add( item );
    }


//    public void actionPerformed(ActionEvent event) {
//        if (event.getSource() instanceof JButton) {
//            JButton clickedButton = (JButton) event.getSource();
//
//            if (clickedButton == addButton) {//Same Addresses.Same object
//                addText(inputLine.getText());
//            } else {
//                clearText( );
//            }
//
//        } else { //the event source is inputLine
//            addText(inputLine.getText());
//        }
//    }

    public void actionPerformed(ActionEvent event) {
        String  menuName;

        menuName = event.getActionCommand();

        if (menuName.equals("Quit")) {
            System.exit(0);

        } else {
            response.setText("Menu Item '" + menuName + "' is selected.");
        }
    }


    private void addText(String newline) {
        textArea.append(newline + NEWLINE);
        inputLine.setText("");
    }

    private void clearText( ) {
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    }


}
