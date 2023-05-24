package cse.foodtruck.order.system.frame;

import cse.foodtruck.order.system.dto.menu.MenuDto;

import java.util.ArrayList;

/**
 *
 * @author lee
 */
public class PayFrame extends javax.swing.JFrame {

    public PayFrame(ArrayList<MenuDto> cartList) {
        initComponents(cartList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(ArrayList<MenuDto> cartList) {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFrame1 = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jTextField1 = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        checkMenuPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkMenuTable = new javax.swing.JTable();
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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 204, 0));
        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("결제 페이지");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        checkMenuTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
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

        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        AmountOrderPriceLabel.setText("100,000원");

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
    }// </editor-fold>

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton payButton;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JLabel requestLabel;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JTextArea requestTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
