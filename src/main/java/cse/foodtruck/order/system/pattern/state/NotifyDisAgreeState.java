package cse.foodtruck.order.system.pattern.state;

import cse.foodtruck.order.system.frame.seller.SellerMenuUploadFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NotifyDisAgreeState implements NotifyState {
    private static NotifyDisAgreeState notifyDisAgreeState;

    public NotifyDisAgreeState(){

    }

    public static NotifyDisAgreeState getInstance(){
        if(notifyDisAgreeState == null){
            notifyDisAgreeState = new NotifyDisAgreeState();
        }
        return notifyDisAgreeState;
    }
    @Override
    public JLabel clickNotifyAgreeButton(JLabel label) {
        //알림을 수신
        JOptionPane.showMessageDialog(null, "알림을 수신합니다.");
        try {
            BufferedImage bi = ImageIO.read(new File(NOTIFY_AGREE_ICON));
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

    @Override
    public JLabel clickNotifyDisagreeButton(JLabel label) {
        //아무 반응 없음
        JOptionPane.showMessageDialog(null, "이미 알림 수신중입니다.");
        return null;
    }
}
