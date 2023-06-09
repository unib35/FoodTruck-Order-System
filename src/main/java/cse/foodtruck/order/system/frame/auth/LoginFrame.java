/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.auth;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.user.UserMainFrame;
import cse.foodtruck.order.system.frame.admin.AdminMainFrame;
import cse.foodtruck.order.system.frame.seller.SellerMainFrame;
import cse.foodtruck.order.system.pattern.observer.DataCollection;
import cse.foodtruck.order.system.pattern.observer.Observer;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

import javax.swing.*;

/**
 *
 * @author lee
 */
public class LoginFrame extends javax.swing.JFrame implements Observer {
    private UserController userController = UserController.getInstance();
    private UserDto user;

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        DataCollection.getInstance().getUserData().registerObserver(this);
        System.out.println("로그인 프레임이 옵저버에 등록되었습니다.");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginPanel = new javax.swing.JPanel();
        idField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        pwField = new javax.swing.JPasswordField();
        findIdButton = new javax.swing.JButton();
        findPwButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setLocationRelativeTo(null);

        idField.requestFocus();
        jScrollPane1.setViewportView(jEditorPane1);

        jPasswordField1.setToolTipText("비밀번호");
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setKeymap(null);
        jPasswordField1.getAccessibleContext().setAccessibleName("비밀번호");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idField.setText("아이디");
        idField.setToolTipText("아이디");

        loginButton.setLabel("로그인");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        pwField.setText("aaaa");
        pwField.setToolTipText("");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pwField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        idField.getAccessibleContext().setAccessibleName("");

        findIdButton.setLabel("아이디 찾기");
        findIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findIdButtonActionPerformed(evt);
            }
        });

        findPwButton.setLabel("비밀번호 찾기");
        findPwButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPwButtonActionPerformed(evt);
            }
        });

        signUpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpButton.setText("푸드트럭 주문이 처음이신가요? 회원가입");
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });

        title.setBackground(new java.awt.Color(204, 255, 153));
        title.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("푸드트럭 주문 시스템");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(findIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(findPwButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(findIdButton)
                                        .addComponent(findPwButton))
                                .addGap(18, 18, 18)
                                .addComponent(signUpButton)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        String inputId = idField.getText();
        String inputPw = pwField.getText();



            //공백만 입력된 경우
            if(inputId.replaceAll(" ","").equals("") || inputPw.replaceAll(" ","").equals("")){
                JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력하세요.");
                return;
            }

            this.user = userController.login(inputId, inputPw);
            DataCollection.getInstance().getUserData().setStatus(user);

            if(user == null){
                JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 일치하지 않습니다.");
                return;
            } else{
                System.out.println(user.getForm() + " 로그인 성공!");
                //싱글톤 회원 정보 설정
                Singleton.getInstance().setUserDto(user);
                //회원 유형에 맞는 프레임 생성
                if(user.getForm().equals("판매자")){
                    new SellerMainFrame();
                }
                else if(user.getForm().equals("관리자")){
                    new AdminMainFrame();
                }
                else{
                    new UserMainFrame();
                }

                dispose();
            }


    }

    private void findIdButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new FindIdFrame();
    }

    private void findPwButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new FindPwFrame();
    }

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        dispose();
        new SignUpFrame();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton findIdButton;
    private javax.swing.JButton findPwButton;
    private javax.swing.JTextField idField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JLabel signUpButton;
    private javax.swing.JLabel title;

    @Override
    public void update() {
        this.user = DataCollection.getInstance().getUserData().getUserDto();
    }
    // End of variables declaration
}
