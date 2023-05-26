/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.pay;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.pay.PaymentInfoDto;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.OrderFrame;
import cse.foodtruck.order.system.pattern.memento.PaymentCaretaker;
import cse.foodtruck.order.system.pattern.memento.PaymentMemento;
import cse.foodtruck.order.system.pattern.memento.PaymentOriginator;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author lee
 */
public class CardPaymentFrame extends javax.swing.JFrame {

    UserDto user = Singleton.getInstance().getUserDto();
    UserController userController = UserController.userController;

    PaymentOriginator paymentOriginator = new PaymentOriginator();
    PaymentCaretaker paymentCaretaker = new PaymentCaretaker();

    private int totalPrice;
    public CardPaymentFrame(int totalPrice) {
        this.totalPrice = totalPrice;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        cardNumberLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cardNumberField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cardNumberField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cardNumberField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cardNumberField4 = new javax.swing.JTextField();
        cardValidDateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cardValidDateField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cardValidDateField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cvcField = new javax.swing.JPasswordField();
        cardPwLabel = new javax.swing.JLabel();
        installmentCheckbox = new javax.swing.JCheckBox();
        installmentComboBox = new javax.swing.JComboBox<>();
        amountPricePanel = new javax.swing.JPanel();
        amountPriceLabel = new javax.swing.JLabel();
        amountOrderPriceTextLabel = new javax.swing.JLabel();
        amountOrderPriceLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cvcLabel = new javax.swing.JLabel();
        cardPwField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("카드 결제");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cardNumberLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cardNumberLabel.setText("카드번호");

        cardNumberField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("-");

        cardNumberField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("-");

        cardNumberField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("-");

        cardNumberField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cardNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(cardNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(cardNumberField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(cardNumberField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardValidDateLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cardValidDateLabel.setText("유효기간");

        jLabel6.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cvcField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );



        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cvcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cardValidDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardValidDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardValidDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(cardValidDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        cardPwLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cardPwLabel.setText("비밀번호");

        installmentCheckbox.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        installmentCheckbox.setText("할부개월");
        installmentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installmentCheckboxActionPerformed(evt);
            }
        });

        installmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "일시불", "2개월", "3개월", "4개월", "5개월", "6개월", "7개월", "8개월", "9개월", "10개월", "11개월", "12개월" }));
        installmentComboBox.setEnabled(false);
        amountPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        amountPriceLabel.setText("결제 금액");

        amountOrderPriceTextLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        amountOrderPriceTextLabel.setText("주문 금액");

        amountOrderPriceLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        amountOrderPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amountOrderPriceLabel.setText(totalPrice + "원");

        javax.swing.GroupLayout amountPricePanelLayout = new javax.swing.GroupLayout(amountPricePanel);
        amountPricePanel.setLayout(amountPricePanelLayout);
        amountPricePanelLayout.setHorizontalGroup(
                amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                                .addComponent(amountOrderPriceTextLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(amountOrderPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(amountOrderPriceTextLabel)
                                        .addComponent(amountOrderPriceLabel))
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

        cvcLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cvcLabel.setText("CVC");


        cardNumberField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        cardNumberField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        cardNumberField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        cardNumberField4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        cardPwField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        cardValidDateField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 2) {
                    e.consume();
                }
            }
        });

        cardValidDateField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 2) {
                    e.consume();
                }
            }
        });


        cvcField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextField src = (JTextField) e.getSource();
                if (src.getText().length() >= 3) {
                    e.consume();
                }
            }
        });



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(cardValidDateLabel)
                                                        .addGap(94, 94, 94)
                                                        .addComponent(cvcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(installmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cardNumberLabel)
                                                        .addComponent(cardPwLabel)
                                                        .addComponent(cardPwField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(installmentCheckbox)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(payButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(amountPricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNumberLabel)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardValidDateLabel)
                                        .addComponent(cvcLabel))
                                .addGap(2, 2, 2)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardPwLabel)
                                .addGap(5, 5, 5)
                                .addComponent(cardPwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(installmentCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(installmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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

    private void installmentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // 체크되면 installmentCombox 활성화
        if(installmentCheckbox.isSelected()){
            installmentComboBox.setEnabled(true);
        }
        // 체크 해제되면 installmentCombox 비활성화
        else{
            installmentComboBox.setEnabled(false);
        }
    }

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //위에서 입력한 카드정보를 출력하는 알림창
        String cardNumber = cardNumberField1.getText() + "-" + cardNumberField2.getText() + "-" + cardNumberField3.getText() + "-" + cardNumberField4.getText();
        String cardValidDate = cardValidDateField1.getText() + "/" + cardValidDateField2.getText();
        String cardCvc = cvcField.getText();
        String cardPw = cardPwField.getText();
        String installment = installmentComboBox.getSelectedItem().toString();
        String amountPrice = amountOrderPriceLabel.getText();

        int totalPrice = Integer.parseInt(amountPrice.substring(0, amountPrice.length()-1)); //원을 제거하기 위해 substring 사용


        //카드번호, 유효기간, cvc, 비밀번호, 할부개월, 결제금액을 출력하는 알림창을 결제, 취소 버튼으로 선택가능한 알림창
        int result = JOptionPane.showConfirmDialog(null, "카드번호 : " + cardNumber + "\n유효기간 : " + cardValidDate + "\ncvc : " + cardCvc + "\n비밀번호 : " + cardPw + "\n할부개월 : " + installment + "\n결제금액 : " + amountPrice + "\n\n입력하신 정보가 맞으면 결제를 진행하세요.", "결제", JOptionPane.YES_NO_OPTION);
        //결제를 진행하면 PayCompleteFrame으로 넘어감
        if(result == JOptionPane.YES_OPTION){
            //입력란이 비어있을 때 결제를 진행할 수 없다는 알림창
            if(cardNumberField1.getText().equals("") || cardNumberField2.getText().equals("") || cardNumberField3.getText().equals("") || cardNumberField4.getText().equals("") || cardValidDateField1.getText().equals("") || cardValidDateField2.getText().equals("") || cvcField.getText().equals("") || cardPwField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "입력란을 모두 채워주세요.", "입력란 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //카드번호란에 숫자이외의 값이 입력되었을때
            if(cardNumberField1.getText().matches("^[0-9]*$") == false || cardNumberField2.getText().matches("^[0-9]*$") == false || cardNumberField3.getText().matches("^[0-9]*$") == false || cardNumberField4.getText().matches("^[0-9]*$") == false){
                JOptionPane.showMessageDialog(null, "카드번호란에는 숫자만 입력해주세요.", "카드번호 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //카드번호란에 4자리씩 입력되지 않았을때
            if(cardNumberField1.getText().length() != 4 || cardNumberField2.getText().length() != 4 || cardNumberField3.getText().length() != 4 || cardNumberField4.getText().length() != 4){
                JOptionPane.showMessageDialog(null, "카드번호란에는 4자리씩 입력해주세요.", "카드번호 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //유효기간란에 숫자이외의 값이 입력되었을때
            if(cardValidDateField1.getText().matches("^[0-9]*$") == false || cardValidDateField2.getText().matches("^[0-9]*$") == false){
                JOptionPane.showMessageDialog(null, "유효기간란에는 숫자만 입력해주세요.", "유효기간 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //유효기간란에 2자리씩 입력되지 않았을때
            if(cardValidDateField1.getText().length() != 2 || cardValidDateField2.getText().length() != 2){
                JOptionPane.showMessageDialog(null, "유효기간란에는 2자리씩 입력해주세요.", "유효기간 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //cvc란에 숫자이외의 값이 입력되었을때
            if(cvcField.getText().matches("^[0-9]*$") == false){
                JOptionPane.showMessageDialog(null, "cvc란에는 숫자만 입력해주세요.", "cvc 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //cvc란에 3자리가 입력되지 않았을때
            if(cvcField.getText().length() != 3){
                JOptionPane.showMessageDialog(null, "cvc란에는 3자리를 입력해주세요.", "cvc 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //비밀번호란에 숫자이외의 값이 입력되었을때
            if(cardPwField.getText().matches("^[0-9]*$") == false){
                JOptionPane.showMessageDialog(null, "비밀번호란에는 숫자만 입력해주세요.", "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //비밀번호란에 4자리가 입력되지 않았을때
            if(cardPwField.getText().length() != 4){
                JOptionPane.showMessageDialog(null, "비밀번호란에는 4자리를 입력해주세요.", "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //결제금액이 잔액보다 클때
            if(totalPrice > user.getBalance()){
                JOptionPane.showMessageDialog(null, "잔액이 부족합니다.", "결제 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }

            UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(),user.getEmail(), user.getPw(), user.getBalance()-totalPrice, user.getSignUpDate(), user.getForm());
            user = updateUser;
            Singleton.getInstance().setUserDto(user);

            //결제 로딩창
            JOptionPane.showMessageDialog(null, "결제가 진행중입니다.", "결제", JOptionPane.INFORMATION_MESSAGE);
            //결제가 완료되면 PayCompleteFrame으로 넘어감

            String infoMesseage = "<html><b>결제정보<br>결제가 완료되었습니다.<br><br>결제금액 : " + totalPrice + "원<br>잔액 : " + user.getBalance() + "원</html>";


            dispose();
            new PayCompleteFrame(infoMesseage);
        }
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


        //입력값이 있을때 cancelButton을 누르면 입력값이 취소된다는 알림창 결제취소, 닫기 버튼 선택가능
        if(cardNumberField1.getText().length() != 0 || cardNumberField2.getText().length() != 0 || cardNumberField3.getText().length() != 0 || cardNumberField4.getText().length() != 0 || cardValidDateField1.getText().length() != 0 || cardValidDateField2.getText().length() != 0 || cvcField.getText().length() != 0 || cardPwField.getText().length() != 0){
            int result = JOptionPane.showConfirmDialog(null, "입력하신 정보가 취소됩니다.\n\n결제를 취소하시겠습니까?", "결제취소", JOptionPane.YES_NO_OPTION);
            //결제취소를 진행하면 PayFrame으로 넘어감
            if(result == JOptionPane.YES_OPTION){
                dispose();
                new OrderFrame();
            }
        }
        //입력값이 없을때 cancelButton을 누르면 바로 PayFrame으로 넘어감
        else{
            dispose();
            new OrderFrame();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel amountOrderPriceLabel;
    private javax.swing.JLabel amountOrderPriceTextLabel;
    private javax.swing.JLabel amountPriceLabel;
    private javax.swing.JPanel amountPricePanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cardNumberField1;
    private javax.swing.JTextField cardNumberField2;
    private javax.swing.JTextField cardNumberField3;
    private javax.swing.JTextField cardNumberField4;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JPasswordField cardPwField;
    private javax.swing.JLabel cardPwLabel;
    private javax.swing.JTextField cardValidDateField2;
    private javax.swing.JTextField cardValidDateField1;
    private javax.swing.JLabel cardValidDateLabel;
    private javax.swing.JPasswordField cvcField;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JCheckBox installmentCheckbox;
    private javax.swing.JComboBox<String> installmentComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
