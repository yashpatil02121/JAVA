package com.company;
// Java program for temperature conversion using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TC{

    // Function to convert
    public static void converter()
    {

        // Creating a new frame using JFrame
        JFrame f = new JFrame("TEMPERATURE CONVERTER");
        f.getContentPane().setBackground(Color.CYAN);

        // Creating four labels
        JLabel l1, l2, l3, l4;

        // Creating four text fields.
        // Three for input and one for the Result
        JTextField t1, t2, t3, t4;

        // Creating seven buttons
        JButton b1, b2, b3, b4, b5, b6, b7;

        // Naming the labels and setting the bounds for the labels
        l1 = new JLabel("CELSIUS:");
        l1.setBounds(20, 40, 100, 30);
        l2 = new JLabel("FAHRENHEIT:");
        l2.setBounds(170, 40, 100, 30);
        l3 = new JLabel("KELVIN:");
        l3.setBounds(350, 40, 100, 30);
        l4 = new JLabel("RESULT:");
        l4.setBounds(30, 300, 100, 30);

        // Initializing the text fields with 0 by default and setting the bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 80, 30);
        t2 = new JTextField("0");
        t2.setBounds(260, 40, 80, 30);
        t3 = new JTextField("0");
        t3.setBounds(400, 40, 80, 30);
        t4 = new JTextField("0");
        t4.setBounds(100, 300, 400, 30);

        // Creating buttons for all conversions and one button to close and setting the bounds
        b1 = new JButton("C->F");
        b1.setBounds(150, 100, 80, 15);
        b2 = new JButton("C->K");
        b2.setBounds(300, 100, 80, 15);
        b4 = new JButton("F->C");
        b4.setBounds(150, 150, 80, 15);
        b5 = new JButton("F->K");
        b5.setBounds(300, 150, 80, 15);
        b6 = new JButton("K->C");
        b6.setBounds(150, 200, 80, 15);
        b7 = new JButton("K->F");
        b7.setBounds(300, 200, 80, 15);

        b3 = new JButton("close");
        b3.setBounds(250, 400, 80, 30);

        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d = Double.parseDouble(t1.getText());

                // Converting cel to fahr
                double d1 = (d * 1.8) + 32;

                // Getting the string value of the calculated value
                String str1 = String.valueOf(d1);

                // Placing it in the text box
                t4.setText(str1);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2 = Double.parseDouble(t1.getText());

                // converting cel to kel
                double d3 = d2 + 273.15 ;

                // Getting the string value of the calculated value
                String str2 = String.valueOf(d3);

                // Placing it in the text box
                t4.setText(str2);
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d4 = Double.parseDouble(t2.getText());

                // converting farh to cel
                double d5 = (d4 - 32) * 5/9;

                // Getting the string value of the calculated value
                String str4 = String.valueOf(d5);

                // Placing it in the text box
                t4.setText(str4);
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d6 = Double.parseDouble(t2.getText());

                // converting farh to kel
                double d7 = ((d6 - 32) * 5/9)+273.15;

                // Getting the string value of the calculated value
                String str5 = String.valueOf(d7);

                 // Placing it in the text box
                t4.setText(str5);
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d8 = Double.parseDouble(t3.getText());

                // converting kel to cel
                double d9 = (d8 -273.15);

                // Getting the string value of the calculated value
                String str6 = String.valueOf(d9);

                // Placing it in the text box
                t4.setText(str6);
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d10 = Double.parseDouble(t3.getText());

                // converting kel to fahr
                double d11 = (d10 - 273.15) * 9/5 + 32;

                // Getting the string value of the calculated value
                String str7 = String.valueOf(d11);

                // Placing it in the text box
                t4.setText(str7);
            }
        });

        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        // Adding the created objects to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);

        f.setLayout(null);
        f.setSize(600, 500);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        converter();

    }
}

