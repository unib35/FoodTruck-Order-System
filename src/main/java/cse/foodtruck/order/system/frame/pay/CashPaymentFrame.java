/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.pay;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.UserMainFrame;
import cse.foodtruck.order.system.frame.OrderFrame;
import cse.foodtruck.order.system.pattern.singleton.Singleton;
import cse.foodtruck.order.system.repository.user.UserRepository;

import javax.swing.*;

/**
 *
 * @author lee
 */
public class CashPaymentFrame extends javax.swing.JFrame {

    UserDto user = Singleton.getInstance().getUserDto();
    UserController userController = UserController.getInstance();
    private int totalPrice;
    public CashPaymentFrame(int totalPrice) {
        this.totalPrice = totalPrice;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        cardNumberLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        receiptNumberField = new javax.swing.JTextField();
        amountPricePanel = new javax.swing.JPanel();
        amountPriceLabel = new javax.swing.JLabel();
        AmountOrderPriceTextLabel = new javax.swing.JLabel();
        AmountOrderPriceLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        installmentCheckbox = new javax.swing.JCheckBox();
        receiptTypeComboBox = new javax.swing.JComboBox<>();
        receiptTypeLabel = new javax.swing.JLabel();


        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("현금 결제");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cardNumberLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cardNumberLabel.setText("현금 영수증 등록 번호");

        receiptNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(receiptNumberField)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(receiptNumberField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        amountPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        amountPriceLabel.setText("결제 금액");

        AmountOrderPriceTextLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        AmountOrderPriceTextLabel.setText("주문 금액");

        AmountOrderPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        AmountOrderPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AmountOrderPriceLabel.setText(totalPrice + "원");

        javax.swing.GroupLayout amountPricePanelLayout = new javax.swing.GroupLayout(amountPricePanel);
        amountPricePanel.setLayout(amountPricePanelLayout);
        amountPricePanelLayout.setHorizontalGroup(
                amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                                .addComponent(AmountOrderPriceTextLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AmountOrderPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                                .addComponent(amountPriceLabel)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        amountPricePanelLayout.setVerticalGroup(
                amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(amountPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AmountOrderPriceTextLabel)
                                        .addComponent(AmountOrderPriceLabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payButton.setText("결제완료");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("취소");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        installmentCheckbox.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        installmentCheckbox.setText("현금 영수증");
        installmentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installmentCheckboxActionPerformed(evt);
            }
        });

        receiptTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "소득공제용", "지출증빙용" }));
        receiptTypeComboBox.setEnabled(false);
        receiptTypeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        receiptTypeLabel.setText("영수증 등록 구분");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(installmentCheckbox)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(payButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(amountPricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cardNumberLabel)
                                                                        .addComponent(receiptTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(receiptTypeLabel))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(installmentCheckbox)
                                .addGap(10, 10, 10)
                                .addComponent(receiptTypeLabel)
                                .addGap(5, 5, 5)
                                .addComponent(receiptTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardNumberLabel)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amountPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //위에서 입력한 정보
        //영수증 처리 구분, 영수증 번호
        String receiptType = receiptTypeComboBox.getSelectedItem().toString();
        String receiptNumber = receiptNumberField.getText();

        //영수증 번호에 입력값이 없을때 결제 불가능하다는 알림창
        if(receiptNumberField.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "영수증 번호를 입력해주세요.", "결제 불가", JOptionPane.ERROR_MESSAGE);
            receiptNumberField.requestFocus(); //필드에 입력하도록 포커스 맞춤
            return;
        }

        //영수증 번호란에 숫자이외의 값이 입력되었을 때
        if(receiptNumberField.getText().matches("^[0-9]*$") == false){
            JOptionPane.showMessageDialog(null, "영수증번호란에는 숫자만 입력해주세요.", "영수증 등록번호 오류", JOptionPane.ERROR_MESSAGE);
            receiptNumberField.setText(""); //빈칸으로 초기화
            return;
        }

        //영수증 처리 구분, 영수증 번호를 확인하는 알림창. 결제, 닫기 버튼 선택 가능
        String infoMessage = "<html><b>결제정보<br>영수증 처리 구분 : " + receiptType + "<br>영수증 번호 : " + receiptNumber + "<br><br>결제금액 : " + totalPrice +" 원<br>잔액 : "  + user.getBalance() + "원</html>";

        int result = JOptionPane.showConfirmDialog(null, infoMessage, "결제 확인", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            //잔액보다 결제금액이 많을 때 결제 불가능하다는 알림창
            if(user.getBalance() < totalPrice){
                JOptionPane.showMessageDialog(null, "잔액이 부족합니다.", "결제 불가", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                //결제 로딩 알림창
                JOptionPane.showMessageDialog(null, "결제가 진행중입니다.", "결제 진행중", JOptionPane.INFORMATION_MESSAGE);
                //결제 완료 후 잔액에서 결제금액만큼 차감
                UserDto updateUser = userController.updateUserInfo(user.getId(), getName(), user.getEmail(), user.getPw(), user.getBalance()-totalPrice, user.getSignUpDate(), user.getForm());
                user = updateUser;
                Singleton.getInstance().setUserDto(user);
                dispose();
                new PayCompleteFrame(infoMessage);
            }
        } else return;
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //입력값이 있을때 cancelButton을 누르면 입력값이 취소된다는 알림창 결제취소, 닫기 버튼 선택가능
        //입력값이 없을때 cancelButton을 누르면 바로 닫힘
        if(receiptNumberField.getText().length() != 0){
            int result = JOptionPane.showConfirmDialog(null, "결제를 취소하시겠습니까?", "결제 취소", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                dispose();
                new OrderFrame();
            } else{
                return;
            }
        }
        else{
            dispose();
            new OrderFrame();
        }


    }

    private void installmentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //현금 영수증 체크박스 선택시 현금 영수증 등록 구분 콤보박스 활성화
        if(installmentCheckbox.isSelected()){
            receiptTypeComboBox.setEnabled(true);
            receiptNumberField.setEnabled(true);

        }
        else{
            receiptTypeComboBox.setEnabled(false);
            receiptNumberField.setEnabled(false);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AmountOrderPriceLabel;
    private javax.swing.JLabel AmountOrderPriceTextLabel;
    private javax.swing.JLabel amountPriceLabel;
    private javax.swing.JPanel amountPricePanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField receiptNumberField;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JCheckBox installmentCheckbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payButton;
    private javax.swing.JComboBox<String> receiptTypeComboBox;
    private javax.swing.JLabel receiptTypeLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
