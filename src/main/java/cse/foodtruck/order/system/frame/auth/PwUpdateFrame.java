/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.auth;

import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

import javax.swing.*;

import static cse.foodtruck.order.system.controller.UserController.userController;

/**
 *
 * @author lee
 */
public class PwUpdateFrame extends javax.swing.JFrame {

    UserDto user = Singleton.getInstance().getUserDto();
    public PwUpdateFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        pwField = new javax.swing.JPasswordField();
        pwLabel = new javax.swing.JLabel();
        newPwField = new javax.swing.JPasswordField();
        newPwLabel = new javax.swing.JLabel();
        newPwCheckLabel = new javax.swing.JLabel();
        newPwCheckField = new javax.swing.JPasswordField();
        pwChangeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setLocationRelativeTo(null);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("비밀번호 수정");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pwField.setToolTipText("아이디");
        pwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwFieldActionPerformed(evt);
            }
        });

        pwLabel.setText("현재 비밀번호");

        newPwField.setToolTipText("아이디");
        newPwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPwFieldActionPerformed(evt);
            }
        });

        newPwLabel.setText("새 비밀번호");

        newPwCheckLabel.setText("새 비밀번호 확인");

        newPwCheckField.setToolTipText("아이디");
        newPwCheckField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPwCheckFieldActionPerformed(evt);
            }
        });

        pwChangeButton.setText("비밀번호 변경");
        pwChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwChangeButtonActionPerformed(evt);
            }
        });

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pwChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newPwCheckField)
                                        .addComponent(newPwCheckLabel)
                                        .addComponent(newPwLabel)
                                        .addComponent(pwField)
                                        .addComponent(pwLabel)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                        .addComponent(newPwField)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pwLabel)
                                .addGap(2, 2, 2)
                                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newPwLabel)
                                .addGap(2, 2, 2)
                                .addComponent(newPwField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newPwCheckLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newPwCheckField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pwChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void pwFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void newPwFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void newPwCheckFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void pwChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String inputPw = pwField.getText();
        String inputNewPw = newPwField.getText();
        String inputNewCheckPw = newPwCheckField.getText();

        //비밀번호 입력 유효성 검증
        if(inputPw.equals("")) {
            JOptionPane.showMessageDialog(null, "현재 비밀번호를 입력해주세요.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            pwField.requestFocus();
            return;
        }
        if(inputNewPw.equals("")) {
            JOptionPane.showMessageDialog(null, "새 비밀번호를 입력해주세요.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            newPwField.requestFocus();
            return;
        }
        if(inputNewCheckPw.equals("")) {
            JOptionPane.showMessageDialog(null, "새 비밀번호 확인을 입력해주세요.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            newPwCheckField.requestFocus();
            return;
        }
        if(!inputNewPw.equals(inputNewCheckPw)) {
            JOptionPane.showMessageDialog(null, "새 비밀번호와 새 비밀번호 확인이 일치하지 않습니다.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            newPwCheckField.requestFocus();
            return;
        }
        //현재 비밀번호 일치 여부 확인
        if(!user.getPw().equals(inputPw)) {
            JOptionPane.showMessageDialog(null, "현재 비밀번호가 일치하지 않습니다.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            pwField.requestFocus();
            return;
        }
        //현재 비밀번호와 새 비밀번호가 일치하는지 확인
        if(user.getPw().equals(inputNewPw)) {
            JOptionPane.showMessageDialog(null, "현재 비밀번호와 새 비밀번호가 일치합니다.", "비밀번호 변경", JOptionPane.WARNING_MESSAGE);
            newPwField.requestFocus();
            return;
        }
        else{
            UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(), user.getEmail(), inputNewPw, user.getBalance(), user.getSignUpDate(), user.getForm());
            if(updateUser != null){
                user = updateUser;
                Singleton.getInstance().setUserDto(user);
                JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다.", "비밀번호 변경", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new MyPageFrame();
            } else{
                JOptionPane.showMessageDialog(null, "비밀번호 변경에 실패하였습니다.", "비밀번호 변경", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new MyPageFrame();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton closeButton;
    private javax.swing.JPasswordField newPwCheckField;
    private javax.swing.JLabel newPwCheckLabel;
    private javax.swing.JPasswordField newPwField;
    private javax.swing.JLabel newPwLabel;
    private javax.swing.JButton pwChangeButton;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
