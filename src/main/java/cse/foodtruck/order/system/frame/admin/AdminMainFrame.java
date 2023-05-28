package cse.foodtruck.order.system.frame.admin;

import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.auth.LoginFrame;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

/**
 *
 * @author lee
 */
public class AdminMainFrame extends javax.swing.JFrame {
    UserDto user = Singleton.getInstance().getUserDto();

    public AdminMainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setLocationRelativeTo(null);
        titleLabel = new javax.swing.JLabel();
        AdminNameLabel = new javax.swing.JLabel();
        ManagementButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("관리자 모드");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AdminNameLabel.setText("관리자 :");

        ManagementButton.setText("회원 관리");
        ManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagementButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("로그아웃");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        NameField.setText(user.getName());
        NameField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                        .addComponent(ManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(AdminNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AdminNameLabel)
                                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void ManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AdminManagementFrame();
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new LoginFrame();
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel AdminNameLabel;
    private javax.swing.JButton ManagementButton;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
