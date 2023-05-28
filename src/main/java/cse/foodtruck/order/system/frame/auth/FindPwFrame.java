package cse.foodtruck.order.system.frame.auth;


import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author lee
 */
public class FindPwFrame extends javax.swing.JFrame {
    private UserController userController = UserController.getInstance();
    String DialogIconPath = "src/main/java/cse/foodtruck/order/system/image/FindIdIcon.png";



    public FindPwFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        pwFindButton = new javax.swing.JButton();
        subTitleLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setLocationRelativeTo(null);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("비밀번호 찾기");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subTitleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        subTitleLabel.setToolTipText("");

        textLabel.setText("가입 당시 입력한 아이디와 이메일을 입력하세요.");

        emailField.setText("이메일");
        emailField.setToolTipText("아이디");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("이메일");

        idLabel.setText("아이디");

        idField.setText("아이디");
        idField.setToolTipText("비밀번호");
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        pwFindButton.setText("비밀번호 찾기");
        pwFindButton.setToolTipText("");
        pwFindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwFindButtonActionPerformed(evt);
            }
        });

        subTitleLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        subTitleLabel1.setText("등록된 이메일로 비밀번호 찾기");
        subTitleLabel1.setToolTipText("");

        closeButton.setText("닫기");
        closeButton.setToolTipText("");
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
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idLabel))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailField)
                                                        .addComponent(idField)))
                                        .addComponent(pwFindButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(subTitleLabel)
                                        .addContainerGap(204, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subTitleLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(textLabel)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idLabel))
                                .addGap(18, 18, 18)
                                .addComponent(pwFindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(subTitleLabel)
                                        .addContainerGap(251, Short.MAX_VALUE)))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new LoginFrame();
    }

    private void pwFindButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String inputEmail = emailField.getText();
        String inputId = idField.getText();

        String[] DialogButton = {"클립보드 복사", "닫기"};

        ImageIcon icon = new ImageIcon(DialogIconPath);
        int choice = 0;

        //입력란이 비어 있는 경우
        if(inputEmail.equals("") || inputId.equals("")){
            JOptionPane.showMessageDialog(null, "입력란을 모두 채워주세요.", "비밀번호 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //올바르지 않은 이메일 입력을 한 경우
        else if(!inputEmail.contains("@") || !inputEmail.contains(".")){
            JOptionPane.showMessageDialog(null, "올바른 이메일 형식이 아닙니다.", "비밀번호 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //이메일, 아이디에 공백이 포함된 경우
        else if(inputEmail.contains(" ") || inputId.contains(" ")){
            JOptionPane.showMessageDialog(null, "이메일, 아이디에 공백이 포함될 수 없습니다.", "비밀번호 찾기", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //올바른 입력을 한 경우
        else {
            //DB에서 입력한 이메일과 아이디와 일치하는 비밀번호를 찾아옴
            UserDto user = userController.findPwByEmailAndId(inputEmail, inputId);
            //일치하는 아이디가 없는 경우
            if (user == null) {
                JOptionPane.showMessageDialog(null, "일치하는 비밀번호가 없습니다.", "비밀번호 찾기", JOptionPane.WARNING_MESSAGE);
            }

            //일치하는 비밀번호가 있는 경우
            else {
                String responsePw = user.getPw();
                choice = JOptionPane.showOptionDialog(null, user.getName() + "님의 " + "비밀번호는 " + responsePw + " 입니다.", "비밀번호 찾기", 0, 0, icon, DialogButton, DialogButton[0]);
                //클립보드 복사를 선택한 경우
                //클립보드에 아이디 복사
                if (choice == 0) {
                    StringSelection copyTarget = new StringSelection(responsePw);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(copyTarget, null);
                    JOptionPane.showMessageDialog(null, "클립보드에 복사되었습니다.", "클립보드 복사", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();

            }
            new LoginFrame();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton pwFindButton;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel subTitleLabel1;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
