/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.auth;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.UserMainFrame;
import cse.foodtruck.order.system.pattern.singleton.Singleton;
import cse.foodtruck.order.system.pattern.state.NotifyStateIcon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 *
 * @author lee
 */
public class MyPageFrame extends javax.swing.JFrame {

    private UserDto user = Singleton.getInstance().getUserDto();
    UserController userController = UserController.getInstance();
    NotifyStateIcon notifyStateIcon = new NotifyStateIcon();
    public static final String NOTIFY_AGREE_ICON = "src/main/java/cse/foodtruck/order/system/image/notification.png";
    //public static final String NOTIFY_DISAGREE_ICON = "src/main/java/cse/foodtruck/order/system/image/blockNotification.png";




    public MyPageFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        titleLabel2 = new javax.swing.JLabel();
        titleLabel3 = new javax.swing.JLabel();
        notifyAgreeButton = new javax.swing.JButton();
        passwordChangeButton = new javax.swing.JButton();
        emailField = new javax.swing.JTextField();
        emailChangeButton = new javax.swing.JButton();
        nameChangeButton = new javax.swing.JButton();
        balanceLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        withDrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        notifyDisagreeButton = new javax.swing.JButton();
        NotifyStausLabel = new javax.swing.JLabel();


        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("마이페이지");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        idLabel.setText("아이디");

        emailLabel.setText("이메일");

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("이름");

        idField.setToolTipText("아이디");
        idField.setText(user.getId());
        idField.setEnabled(false);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        nameField.setToolTipText("아이디");
        nameField.setText(user.getName());
        nameField.setEnabled(false);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFileldActionPerformed(evt);
            }
        });

        titleLabel2.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel2.setText(user.getName() + "님");
        titleLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        titleLabel3.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        titleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel3.setText("안녕하세요!");
        titleLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        notifyAgreeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        notifyAgreeButton.setText("알림수신");
        notifyAgreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyAgreeButtonActionPerformed(evt);
            }
        });

        passwordChangeButton.setText("비밀번호 관리");
        passwordChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordChangeButtonActionPerformed(evt);
            }
        });

        emailField.setToolTipText("아이디");
        emailField.setText(user.getEmail());
        emailField.setEnabled(false);
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailChangeButton.setText("변경");
        emailChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailChangeButtonActionPerformed(evt);
            }
        });

        nameChangeButton.setText("변경");
        nameChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeButtonActionPerformed(evt);
            }
        });

        balanceLabel.setText("잔고");
        balanceField.setText(String.valueOf(user.getBalance()) + "원");
        balanceField.setEnabled(false);
        balanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceFieldActionPerformed(evt);
            }
        });

        withDrawButton.setText("출금");
        withDrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withDrawButtonActionPerformed(evt);
            }
        });

        depositButton.setText("입금");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        notifyDisagreeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        notifyDisagreeButton.setText("알림차단");
        notifyDisagreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyDisagreeButtonActionPerformed(evt);
            }
        });

        NotifyStausLabel.setText("");
        try {
            BufferedImage bi = ImageIO.read(new File(NOTIFY_AGREE_ICON));
            ImageIcon icon = new ImageIcon(bi);
            Image image = icon.getImage();
            Image resizedImage = image.getScaledInstance(80, 63 , Image.SCALE_SMOOTH);
            NotifyStausLabel.setIcon(new ImageIcon(resizedImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nameLabel)
                                                        .addComponent(emailLabel)
                                                        .addComponent(balanceLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(balanceField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nameChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(emailChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(withDrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(passwordChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(idField)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(notifyAgreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(idLabel)
                                                                                        .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(titleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(87, 87, 87)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(notifyDisagreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                                        .addComponent(NotifyStausLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(titleLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(titleLabel3)
                                                .addGap(10, 10, 10)
                                                .addComponent(idLabel)
                                                .addGap(2, 2, 2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NotifyStausLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(notifyAgreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(notifyDisagreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailLabel)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameLabel)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balanceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(withDrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(passwordChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
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

    private void balanceFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void emailChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String result = JOptionPane.showInputDialog("변경할 이메일을 입력하세요.");

        if (!result.contains("@") || !result.contains(".")) {
            JOptionPane.showMessageDialog(null, "올바른 이메일 형식을 입력해주세요");
            return;
        }

        //공백을 포함한 경우
        if(result.contains(" ")) {
            JOptionPane.showMessageDialog(null, "공백을 포함할 수 없습니다.");
            return;
        }

        if(result == null) {
            JOptionPane.showMessageDialog(null, "변경할 이메일을 입력해주세요.");
            return;
        }

        else{
            UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(), result, user.getPw(), user.getBalance(), user.getSignUpDate(), user.getForm());
            if(updateUser != null) {
                JOptionPane.showMessageDialog(null, "이메일이 변경되었습니다.");
                user = updateUser;
                emailField.setText(user.getEmail());
                Singleton.getInstance().setUserDto(user);
            } else {
                JOptionPane.showMessageDialog(null, "이메일 변경에 실패하였습니다.");
            }
        }

    }

    private void nameChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String result = JOptionPane.showInputDialog("변경할 이름을 입력하세요.");
        if(result == null) {
            JOptionPane.showMessageDialog(null, "변경할 이름을 입력해주세요.");
            return;
        } else{
            UserDto updateUser = userController.updateUserInfo(user.getId(), result, user.getEmail(), user.getPw(), user.getBalance(), user.getSignUpDate(), user.getForm());
            if(updateUser != null) {
                JOptionPane.showMessageDialog(null, "이름이 변경되었습니다.");
                user = updateUser;
                System.out.println("updateUser :" + updateUser.getName());
                System.out.println("user :" + user.getName());
                nameField.setText(user.getName());
                titleLabel2.setText(user.getName() + "님");
                Singleton.getInstance().setUserDto(user);
            } else {
                JOptionPane.showMessageDialog(null, "이름 변경에 실패하였습니다.");
            }
        }

    }

    private void withDrawButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String result = JOptionPane.showInputDialog("출금할 금액을 입력하세요.");

        //숫자가 아닌 다른 문자를 입력했을 때
        if(!Pattern.matches("^[0-9]*$", result.trim())) {
            JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
            return;
        }
        //큰 수를 입력했을때
        if(result.length() > 9) {
            JOptionPane.showMessageDialog(null, "출금할 금액이 너무 큽니다.");
            return;
        }

        if(result == null) {
            JOptionPane.showMessageDialog(null, "출금할 금액을 입력해주세요.");
            return;
        } else {
            int withdraw = Integer.parseInt(result);
            if(withdraw > user.getBalance()) {
                JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                return;
            } else {
                UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(), user.getEmail(), user.getPw(), user.getBalance() - withdraw, user.getSignUpDate(), user.getForm());
                if(updateUser != null) {
                    JOptionPane.showMessageDialog(null, "출금이 완료되었습니다.");
                    user = updateUser;
                    balanceField.setText(String.valueOf(updateUser.getBalance() + "원"));
                    Singleton.getInstance().setUserDto(user);
                } else {
                    JOptionPane.showMessageDialog(null, "출금 실패하였습니다.");
                }
            }
        }

    }

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String result = JOptionPane.showInputDialog("입금할 금액을 입력하세요.");

        //숫자가 아닌 다른 문자를 입력했을 때
        if(!Pattern.matches("^[0-9]*$", result.trim())) {
            JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
            return;
        }
        //큰 수를 입력했을때
        if(result.length() > 9) {
            JOptionPane.showMessageDialog(null, "입금할 금액이 너무 큽니다.");
            return;
        }

        if(result == null) {
            JOptionPane.showMessageDialog(null, "입금할 금액을 입력해주세요.");
            return;
        } else {
            int deposit = Integer.parseInt(result);
            UserDto updateUser = userController.updateUserInfo(user.getId(), user.getName(), user.getEmail(), user.getPw(), user.getBalance() + deposit, user.getSignUpDate(), user.getForm());
            if(updateUser != null) {
                JOptionPane.showMessageDialog(null, "입금이 완료되었습니다.");
                System.out.println("입금전 : " + user.getBalance());
                user = updateUser;
                balanceField.setText(String.valueOf(user.getBalance()) + "원");
                System.out.println("입금후 : " + user.getBalance());
                Singleton.getInstance().setUserDto(user);
            } else {
                JOptionPane.showMessageDialog(null, "입금에 실패하였습니다.");
            }
        }

    }

    private void passwordChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new PwUpdateFrame();
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new UserMainFrame();

    }

    private void notifyDisagreeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        notifyStateIcon.clickNotifyDisagreeButton(NotifyStausLabel);
    }

    private void notifyAgreeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        notifyStateIcon.clickNotifyAgreeButton(NotifyStausLabel);
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel NotifyStausLabel;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton emailChangeButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nameChangeButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton notifyAgreeButton;
    private javax.swing.JButton notifyDisagreeButton;
    private javax.swing.JButton passwordChangeButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JButton withDrawButton;
    // End of variables declaration
}
