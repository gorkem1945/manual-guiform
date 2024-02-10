package com.arslaner.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaFormDeneme extends JFrame implements ActionListener {

    private JLabel adsad = new JLabel("Adınızı Soyadınızı giriniz.");
    private JTextField adsadfield = new JTextField(50);
    private JLabel babaad = new JLabel("Babanızın giriniz.");
    private JTextField babafield = new JTextField(50);
    private JButton tikla = new JButton("TIKLA");
    private JPanel innerwindow = new JPanel();
    private JPanel innerwindow2 = new JPanel();

    //constructor içinde formu elemanlarını innerwindowa ekle..
    //container = JFrame
    //container2 = Jpanel
    //çekmeceler = Layout raflar ve çizgileri oluşturur.
    //malzemeler = Jtextfield , JLabel , JButton.

    public AnaFormDeneme() {
        super("Elle Form Oluşturma İşlemi...");
        this.getContentPane().setLayout(new BorderLayout());

        innerwindow.setLayout(new GridLayout(2, 2, 1, 1));
        innerwindow.add(adsad);
        innerwindow.add(adsadfield);
        innerwindow2.setLayout(new GridLayout(2, 2, 1, 1));
        innerwindow2.add(babaad);
        innerwindow2.add(babafield);
        innerwindow2.add(tikla);

        this.getContentPane().add("West", innerwindow2);
        this.getContentPane().add("North", innerwindow);
        tikla.addActionListener(this);
    }

    public static void main(String[] args) {
        AnaFormDeneme window = new AnaFormDeneme();
        window.setSize(400, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        adsadfield.setText("Adının soyadının yerine bu geldi");
    }

}