/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.auth;

import static cse.foodtruck.order.system.controller.UserController.userController;
import cse.foodtruck.order.system.dto.user.UserDto;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author lee
 */
public class SignUpFrame extends javax.swing.JFrame {

    public SignUpFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        idLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        checkPwLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameFileld = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        pwField = new javax.swing.JPasswordField();
        checkPwField = new javax.swing.JPasswordField();
        FormLabel = new javax.swing.JLabel();
        FormComboBox = new javax.swing.JComboBox<>();
        signUpButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        idCheckButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        idField.requestFocus();

        idLabel.setText("아이디");

        pwLabel.setText("비밀번호");

        checkPwLabel.setText("비밀번호 확인");

        nameLabel.setText("이름");

        emailLabel.setText("이메일");

        idField.setToolTipText("아이디");
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        nameFileld.setToolTipText("아이디");
        nameFileld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFileldActionPerformed(evt);
            }
        });

        emailField.setToolTipText("아이디");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        pwField.setText("jPasswordField1");

        checkPwField.setText("jPasswordField1");

        FormLabel.setText("회원 유형");

        FormComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"관리자", "일반회원", "판매회원"}));

        signUpButton.setText("회원가입 완료");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("회원가입");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        idCheckButton.setText("중복확인");
        idCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(FormComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FormLabel)
                                                .addComponent(checkPwField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(pwField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(emailLabel)
                                                .addComponent(nameLabel)
                                                .addComponent(checkPwLabel)
                                                .addComponent(idLabel)
                                                .addComponent(nameFileld)
                                                .addComponent(emailField)
                                                .addComponent(signUpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(pwLabel)
                                                .addComponent(idField)
                                                .addComponent(idCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(idLabel)
                                .addGap(2, 2, 2)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idCheckButton)
                                .addGap(1, 1, 1)
                                .addComponent(pwLabel)
                                .addGap(2, 2, 2)
                                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkPwLabel)
                                .addGap(2, 2, 2)
                                .addComponent(checkPwField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nameLabel)
                                .addGap(2, 2, 2)
                                .addComponent(nameFileld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(emailLabel)
                                .addGap(2, 2, 2)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(FormLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FormComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>                        

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nameFileldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String inputId = idField.getText();
        String inputPw = pwField.getText();
        String checkPw = checkPwField.getText();
        String name = nameFileld.getText();
        String email = emailField.getText();
        Integer balance = 10000;

        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());


        String form = "";

        //id 중복확인을 하지 않은 경우
        if (idCheckButton.isEnabled()) {
            JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요");
            return;
        }

        //회원 유형 라디오 구분
        if (FormComboBox.getSelectedItem().toString().equals("관리자")) {
            form = "관리자";
        } else if (FormComboBox.getSelectedItem().toString().equals("일반회원")) {
            form = "회원";
        } else if (FormComboBox.getSelectedItem().toString().equals("판매회원")) {
            form = "판매자";
        } else {
            //라디오 버튼 선택 안함
            JOptionPane.showMessageDialog(null, "회원 유형을 선택해주세요");
            return;
        }

        //입력란이 비어있는 경우
        if (inputId.replaceAll(" ", "").equals("")
                || inputPw.replaceAll(" ", "").equals("")
                || checkPw.replaceAll(" ", "").equals("")
                || name.replaceAll(" ", "").equals("")) {
            JOptionPane.showMessageDialog(null, "입력란을 모두 채워주세요");
            return;
        }

        //비밀번호와 확인 비밀번호가 일치하지 않는 경우
        if (!inputPw.equals(checkPw)) {
            JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
            return;
        } else if (inputId.contains(" ")) {
            JOptionPane.showMessageDialog(null, "아이디에 공백이 포함될 수 없습니다.");
            return;
        }

        //올바르지 않은 이메일 형식을 입력한 경우
        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(null, "올바른 이메일 형식을 입력해주세요");
            return;
        }

        UserDto user = userController.signUp(inputId, inputPw, checkPw, name, email, timeStamp, form, balance);

        if (user == null) {
            JOptionPane.showMessageDialog(null, "이미 등록된 계정입니다..");
            idField.setEnabled(true);
            idCheckButton.setEnabled(true);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
            dispose();
            new LoginFrame();
        }
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new LoginFrame();
    }

    private void idCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String id = idField.getText();
        UserDto user = userController.idCheck(id);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
            idCheckButton.setEnabled(false);
            idField.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "이미 사용중인 아이디입니다.");
        }

    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> FormComboBox;
    private javax.swing.JLabel FormLabel;
    private javax.swing.JPasswordField checkPwField;
    private javax.swing.JLabel checkPwLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton idCheckButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField nameFileld;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}