package cse.foodtruck.order.system.frame;

import javax.swing.*;

public class testFrame extends JFrame {
    testFrame(){
        JLabel label = new JLabel("<html>Hello World<br/>줄바꿈완료</html>");
        add(label);

        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new testFrame();
    }
}
