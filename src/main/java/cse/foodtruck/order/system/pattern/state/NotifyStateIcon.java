package cse.foodtruck.order.system.pattern.state;

import javax.swing.*;

public class NotifyStateIcon {
    private NotifyState notifyState;

    public NotifyStateIcon() {
        this.notifyState = NotifyAgreeState.getInstance();
    }

    public void setNotifyState(NotifyState state) {
        this.notifyState = state;
    }

    public JLabel clickNotifyAgreeButton(JLabel label) {
        JLabel result = notifyState.clickNotifyAgreeButton(label);
        this.setNotifyState(NotifyAgreeState.getInstance());
        return result;
    }

    public JLabel clickNotifyDisagreeButton(JLabel label) {
        JLabel result = notifyState.clickNotifyDisagreeButton(label);
        this.setNotifyState(NotifyDisAgreeState.getInstance());
        return result;
    }
}
