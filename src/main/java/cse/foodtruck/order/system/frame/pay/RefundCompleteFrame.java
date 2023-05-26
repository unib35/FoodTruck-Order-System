/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.pay;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.UserMainFrame;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

/**
 *
 * @author lee
 */
public class RefundCompleteFrame extends javax.swing.JFrame {
    UserDto user = Singleton.getInstance().getUserDto();
    UserController userController = UserController.getInstance();

    public RefundCompleteFrame(String refundMessage) {
        initComponents(refundMessage);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String refundMessage) {

        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        completeLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        cancelInfoLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();

        //int totalPrice =

        UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(), user.getEmail(), user.getPw(), user.getBalance(), user.getSignUpDate(), user.getForm());
        user = updateUser;
        Singleton.getInstance().setUserDto(user);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("결제 취소");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);



        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        completeLabel.setBackground(new java.awt.Color(204, 255, 153));
        completeLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        completeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completeLabel.setText("회원님 결제가 취소되었습니다.");
        completeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cancelLabel.setBackground(new java.awt.Color(204, 255, 153));
        cancelLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLabel.setText("취소 정보");
        cancelLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cancelInfoLabel.setText(refundMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(completeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addComponent(cancelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(cancelInfoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(completeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelInfoLabel)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        homeButton.setText("홈으로");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new UserMainFrame();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel cancelInfoLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel completeLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
