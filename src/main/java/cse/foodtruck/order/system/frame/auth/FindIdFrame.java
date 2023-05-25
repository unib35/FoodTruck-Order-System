
package cse.foodtruck.order.system.frame.auth;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 20193174 이종민
 */
public class FindIdFrame extends javax.swing.JFrame {
    private UserController userController = UserController.getInstance();
    String DialogIconPath = "src/main/java/cse/foodtruck/order/system/image/FindIdIcon.png";

    public FindIdFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        titleLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        idFindButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();



        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("아이디 찾기");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subTitleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        subTitleLabel.setText("등록된 이메일로 아이디 찾기");
        subTitleLabel.setToolTipText("");

        textLabel.setText("가입 당시 입력한 이메일과 이름을 입력하세요.");

        emailField.setText("이메일");
        emailField.setToolTipText("아이디");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("이메일");

        nameField.setText("이름");
        nameField.setToolTipText("비밀번호");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("이름");

        idFindButton.setText("아이디 찾기");
        idFindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFindButtonActionPerformed(evt);
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(textLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(subTitleLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(0, 6, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameLabel))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameField)
                                                        .addComponent(emailField)))
                                        .addComponent(idFindButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(closeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLabel))
                                .addGap(18, 18, 18)
                                .addComponent(idFindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void idFindButtonActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
        String inputEmail = emailField.getText();
        String inputName = nameField.getText();
        String[] DialogButton = {"클립보드 복사", "닫기"};

        ImageIcon icon = new ImageIcon(DialogIconPath);
        int choice = 0;


        //입력란이 비어 있는 경우
        if(inputEmail.equals("") || inputName.equals("")){
            JOptionPane.showMessageDialog(null, "입력란을 모두 채워주세요.", "아이디 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //올바르지 않은 이메일 입력을 한 경우
        else if(!inputEmail.contains("@") || !inputEmail.contains(".")){
            JOptionPane.showMessageDialog(null, "올바른 이메일 형식이 아닙니다.", "아이디 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //이메일, 이름에 공백이 포함된 경우
        else if(inputEmail.contains(" ") || inputName.contains(" ")){
            JOptionPane.showMessageDialog(null, "이메일, 이름에 공백이 포함될 수 없습니다.", "아이디 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //올바른 입력을 한 경우
        else{
            //DB에서 입력한 이메일과 이름이 일치하는 아이디를 찾아옴
            UserDto user = userController.findIdByEmailAndName(inputEmail, inputName);

            //일치하는 아이디가 없는 경우
            if(user == null){
                JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.", "아이디 찾기", JOptionPane.WARNING_MESSAGE);
            }
            //일치하는 아이디가 있는 경우
            else{
                String responseId = user.getId();
                choice = JOptionPane.showOptionDialog(null, user.getName() +"님의 " + "아이디는 " + responseId + " 입니다.", "아이디 찾기", 0, 0, icon , DialogButton, DialogButton[0]);
                //클립보드 복사를 선택한 경우
                //클립보드에 아이디 복사
                if(choice == 0){
                    StringSelection copyTarget = new StringSelection(responseId);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(copyTarget, null);
                    JOptionPane.showMessageDialog(null, "클립보드에 복사되었습니다.", "클립보드 복사", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();
                new LoginFrame();
            }

        }

    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new LoginFrame();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton idFindButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
