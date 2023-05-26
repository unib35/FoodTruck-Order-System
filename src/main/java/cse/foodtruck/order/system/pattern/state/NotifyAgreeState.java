package cse.foodtruck.order.system.pattern.state;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NotifyAgreeState implements NotifyState{

    private static NotifyAgreeState notifyAgreeState;

    private NotifyAgreeState() {

    }

    public static NotifyAgreeState getInstance() {
        if(notifyAgreeState == null) {
            notifyAgreeState = new NotifyAgreeState();
        }
        return notifyAgreeState;
    }

    @Override
    public JLabel clickNotifyAgreeButton(JLabel label) {
        // 이미 알림 수신중이라는 메시지 전달필요
        JOptionPane.showMessageDialog(null, "이미 알림 수신중입니다.");
        return null;
    }

    @Override
    public JLabel clickNotifyDisagreeButton(JLabel label) {
        // 알림 수신 해제
        JOptionPane.showMessageDialog(null, "알림 수신을 해제합니다.");
        try {
            BufferedImage bi = ImageIO.read(new File(NOTIFY_DISAGREE_ICON));
            ImageIcon icon = new ImageIcon(bi);
            Image image = icon.getImage();
            Image resizedImage = image.getScaledInstance(80, 63 , Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(resizedImage));
            return label;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
