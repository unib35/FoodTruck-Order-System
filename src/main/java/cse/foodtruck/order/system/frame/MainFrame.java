package cse.foodtruck.order.system.frame;

import cse.foodtruck.order.system.frame.auth.MyPageFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("MainFrame");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(false);

        //이슈 -> 뒤로가기 시에도 로그인 성공 메시지가 뜸
        JOptionPane.showMessageDialog(null,"로그인 성공!");

        JButton MenuButton = new JButton("메뉴");
        JButton OrderButton = new JButton("주문");
        JButton PayButton = new JButton("결제");
        JButton MyPageButton = new JButton("마이페이지");

        MenuButton.addActionListener(new MenuButtonActionListener());
        OrderButton.addActionListener(new OrderButtonActionListener());
        PayButton.addActionListener(new PayButtonActionListener());
        MyPageButton.addActionListener(new MyPageButtonActionListener());

        this.setLayout(new FlowLayout());
        this.add(MenuButton);
        this.add(OrderButton);
        this.add(PayButton);
        this.add(MyPageButton);
        MenuButton.setPreferredSize(new Dimension(200, 50));
        OrderButton.setPreferredSize(new Dimension(200, 50));
        PayButton.setPreferredSize(new Dimension(200, 50));
        MyPageButton.setPreferredSize(new Dimension(200, 50));




        setVisible(true);
    }

    class MenuButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new MenuFrame();
            dispose();
        }
    }

    class OrderButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new OrderFrame();
            dispose();
        }
    }

    class PayButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new PayFrame();
            dispose();
        }
    }

    class MyPageButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new MyPageFrame();
            dispose();
        }
    }

}
