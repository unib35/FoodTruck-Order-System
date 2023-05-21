package cse.foodtruck.order.system.frame;

import cse.foodtruck.order.system.frame.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {
    JButton BackButton;
    public MenuFrame(){
        setTitle("MenuFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(false);
        setLayout(null);

        BackButton = new JButton("뒤로가기");
        BackButton.setBounds(10, 10, 100, 50);
        BackButton.addActionListener(new BackButtonActionListener());
        this.add(BackButton);


        setVisible(true);
    }

    class BackButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            new MainFrame();
            dispose();

        }
    }
}
