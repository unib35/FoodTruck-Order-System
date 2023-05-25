package cse.foodtruck.order.system.frame.pay;

import cse.foodtruck.order.system.controller.MenuController;
import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.frame.OrderFrame;
import cse.foodtruck.order.system.pattern.bridge.CardPayment;
import cse.foodtruck.order.system.pattern.bridge.CashPayment;
import cse.foodtruck.order.system.pattern.bridge.PaymentMethod;

import javax.swing.*;
import java.util.ArrayList;


/**
 *
 * @author lee
 */
public class PayFrame extends javax.swing.JFrame {


    //브릿지 패턴
    private PaymentMethod paymentMethod;
    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(){
        this.paymentMethod.processPayment();
    }

    MenuController menuController = MenuController.getInstance();
    int totalPrice = 0;

    public PayFrame(ArrayList<MenuDto> cartList, javax.swing.JTable cartTable) {
        initComponents(cartList, cartTable);
    }


    @SuppressWarnings("unchecked")

    private void initComponents(ArrayList<MenuDto> cartList, javax.swing.JTable cartTable){

        titleLabel = new javax.swing.JLabel();
        checkMenuPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkMenuTable = cartTable;
        checkMenuLabel = new javax.swing.JLabel();
        requestPanel = new javax.swing.JPanel();
        requestLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTextArea = new javax.swing.JTextArea();
        PaymentPanel = new javax.swing.JPanel();
        PaymentLabel = new javax.swing.JLabel();
        paymentComboBox = new javax.swing.JComboBox<>();
        amountPricePanel = new javax.swing.JPanel();
        amountPriceLabel = new javax.swing.JLabel();
        AmountOrderPriceTextLabel = new javax.swing.JLabel();
        AmountOrderPriceLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        totalPrice = menuController.getTotalPrice(cartList);


        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("결제 페이지");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);


        jScrollPane2.setViewportView(checkMenuTable);

        checkMenuLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        checkMenuLabel.setText("선택한 메뉴를 확인하세요.");

        javax.swing.GroupLayout checkMenuPanelLayout = new javax.swing.GroupLayout(checkMenuPanel);
        checkMenuPanel.setLayout(checkMenuPanelLayout);
        checkMenuPanelLayout.setHorizontalGroup(
                checkMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(checkMenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkMenuLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkMenuPanelLayout.setVerticalGroup(
                checkMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkMenuPanelLayout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addComponent(checkMenuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );

        requestLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        requestLabel.setText("주문 요청사항");

        requestTextArea.setColumns(20);
        requestTextArea.setRows(5);
        jScrollPane3.setViewportView(requestTextArea);

        javax.swing.GroupLayout requestPanelLayout = new javax.swing.GroupLayout(requestPanel);
        requestPanel.setLayout(requestPanelLayout);
        requestPanelLayout.setHorizontalGroup(
                requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(requestPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(requestPanelLayout.createSequentialGroup()
                                                .addComponent(requestLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3))
                                .addContainerGap())
        );
        requestPanelLayout.setVerticalGroup(
                requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(requestPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(requestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        PaymentLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        PaymentLabel.setText("결제 수단");

        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "카드 결제", "현금 결제", "포인트 결제" }));

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
                PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addComponent(PaymentLabel)
                                .addContainerGap(278, Short.MAX_VALUE))
                        .addComponent(paymentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaymentPanelLayout.setVerticalGroup(
                PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(PaymentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))
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
                                .addGroup(amountPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                                .addComponent(amountPriceLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(amountPricePanelLayout.createSequentialGroup()
                                                .addComponent(AmountOrderPriceTextLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AmountOrderPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
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

        payButton.setText("결제");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
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
                        .addComponent(checkMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(requestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(amountPricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(PaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if(paymentComboBox.getSelectedItem().equals("카드 결제")){

            JOptionPane.showMessageDialog(null, "카드 결제창으로 이동합니다.", "카드 결제", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            this.setPaymentMethod(new CardPayment(totalPrice));
            this.processPayment();

        }else if(paymentComboBox.getSelectedItem().equals("현금 결제")){

            JOptionPane.showMessageDialog(null, "현금 결제창으로 이동합니다.", "카드 결제", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            this.setPaymentMethod(new CashPayment(totalPrice));
            this.processPayment();
        }
        //dispose();
        //new PayCompleteFrame();
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new OrderFrame();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AmountOrderPriceLabel;
    private javax.swing.JLabel AmountOrderPriceTextLabel;
    private javax.swing.JLabel PaymentLabel;
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JLabel amountPriceLabel;
    private javax.swing.JPanel amountPricePanel;
    private javax.swing.JLabel checkMenuLabel;
    private javax.swing.JPanel checkMenuPanel;
    private javax.swing.JTable checkMenuTable;
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton payButton;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JLabel requestLabel;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JTextArea requestTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
