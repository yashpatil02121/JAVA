package com.company;

import javax.swing.*;

public class clg_swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("student info");
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

        JMenu g = new JMenu("Gender");
        JMenuBar m = new JMenuBar();
        JMenuItem m1 = new JMenuItem("male");
        JMenuItem m2 = new JMenuItem("female");
        m.add(g);
        g.add(m1);
        g.add(m2);
        f.setJMenuBar(m);

//        JCheckBox c = new JCheckBox("interested?");
//        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("yes");
//        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("no");
//        c.setBounds(150,20,100,100);
//        f.add(c);
//        c.add(c1);
//        c.add(c2);




        JTextField name = new JTextField("Enter name");
        name.setBounds(150,100,100,20);
        f.add(name);

        JButton but = new JButton("submit");
        but.setBounds(150,150,100,20 );
        f.add(but);


    }
}
