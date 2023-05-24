package cse.foodtruck.order.system.frame.seller;

import javax.swing.*;

public class SellerMainFrame extends JFrame {
    public SellerMainFrame(){
        setTitle("SellerFrame");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(false);

        JOptionPane.showMessageDialog(null,"판매자 로그인 성공!");

        JButton MenuButton = new JButton("메뉴관리");
        JButton OrderButton = new JButton("주문관리");
        JButton PayButton = new JButton("결제관리");
        JButton MyPageButton = new JButton("마이페이지");

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(MenuButton);
        this.add(OrderButton);
        this.add(PayButton);
        this.add(MyPageButton);
        MenuButton.setPreferredSize(new java.awt.Dimension(200, 50));
        OrderButton.setPreferredSize(new java.awt.Dimension(200, 50));
        PayButton.setPreferredSize(new java.awt.Dimension(200, 50));
        MyPageButton.setPreferredSize(new java.awt.Dimension(200, 50));

        setVisible(true);
    }
}
