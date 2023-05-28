package cse.foodtruck.order.system.pattern.state;

import javax.swing.*;

public interface NotifyState {
    public static final String NOTIFY_DISAGREE_ICON = "src/main/java/cse/foodtruck/order/system/image/notification.png";

    public static final String NOTIFY_AGREE_ICON = "src/main/java/cse/foodtruck/order/system/image/blockNotification.png";
    public JLabel clickNotifyAgreeButton(JLabel label);
    public JLabel clickNotifyDisagreeButton(JLabel label);
}
