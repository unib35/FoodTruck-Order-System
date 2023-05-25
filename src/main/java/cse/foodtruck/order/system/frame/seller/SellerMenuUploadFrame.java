/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.foodtruck.order.system.frame.seller;

import cse.foodtruck.order.system.controller.MenuController;
import cse.foodtruck.order.system.dto.menu.MenuDto;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lee
 */
@Slf4j
public class SellerMenuUploadFrame extends javax.swing.JFrame {

    public MenuController menuController = MenuController.getInstance();
    public String localImagePath = "./src/main/java/cse/foodtruck/order/system/image/menu/";
    final String PREVEIW_IMAGE_PATH = "./src/main/java/cse/foodtruck/order/system/image/menu/preview.png";
    public String copyFilePath;
    public String chooserFileExtension;
    public String chooserFilePath;
    public File targetFile;
    public BufferedImage bi;
    public SellerMenuUploadFrame() {
        initComponents();
    }

    public void setMenuImagePreviewLabel(String path) {
        try {
            bi = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(bi);
            Image image = icon.getImage();
            Image resizedImage = image.getScaledInstance(150, 150 , Image.SCALE_SMOOTH);
            menuImagePreviewLabel.setIcon(new ImageIcon(resizedImage));
        } catch (IOException ex) {
            Logger.getLogger(SellerMenuUploadFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        menuImagePreviewLabel = new javax.swing.JLabel();
        menuImageUploadButton = new javax.swing.JButton();
        menuNameField = new javax.swing.JTextField();
        menuNameLabel = new javax.swing.JLabel();
        menuPriceLabel = new javax.swing.JLabel();
        menuCategoryLabel = new javax.swing.JLabel();
        menuPriceField = new javax.swing.JTextField();
        menuCategoryComboBox = new javax.swing.JComboBox<>();
        menuUploadButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setMenuImagePreviewLabel(PREVEIW_IMAGE_PATH);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("메뉴 등록 모드");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menuImagePreviewLabel.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout menuImagePreviewPanelLayout = new javax.swing.GroupLayout(menuImagePreviewLabel);
        menuImagePreviewLabel.setLayout(menuImagePreviewPanelLayout);
        menuImagePreviewPanelLayout.setHorizontalGroup(
                menuImagePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        menuImagePreviewPanelLayout.setVerticalGroup(
                menuImagePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 150, Short.MAX_VALUE)
        );

        menuImageUploadButton.setText("메뉴 사진 선택");
        menuImageUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menuImageUploadButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        menuNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNameFieldActionPerformed(evt);
            }
        });

        menuNameLabel.setText("메뉴 이름");

        menuPriceLabel.setText("메뉴 가격");

        menuCategoryLabel.setText("카테고리");

        menuCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "음식", "음료", "간식" }));

        menuUploadButton.setText("메뉴 등록");
        menuUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menuUploadButtonActionPerformed(evt);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "사진 업로드 실패로 메뉴 등록에 실패하였습니다.");
                    return;
                }
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
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(menuUploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(menuImagePreviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(menuImageUploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(menuNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                                .addComponent(menuNameLabel)
                                                                .addComponent(menuPriceLabel)
                                                                .addComponent(menuCategoryLabel)
                                                                .addComponent(menuPriceField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                                .addComponent(menuCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(menuImagePreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(menuNameLabel)
                                                .addGap(2, 2, 2)
                                                .addComponent(menuNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(menuPriceLabel)
                                                .addGap(2, 2, 2)
                                                .addComponent(menuPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(menuCategoryLabel)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(menuCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(menuImageUploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(menuUploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>
    //menuUploadButtonActionPerformed
    private void menuUploadButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        //메뉴 등록 버튼 클릭 시
        String inputMenuName = menuNameField.getText();
        String inputMenuPrice = menuPriceField.getText();
        String inputMenuCategory = menuCategoryComboBox.getSelectedItem().toString();

        //메뉴 이름, 가격, 카테고리 입력 확인
        if(inputMenuName.equals("") || inputMenuPrice.equals("") || inputMenuCategory.equals("")) {
            JOptionPane.showMessageDialog(null, "메뉴 이름, 가격, 카테고리를 입력해주세요.", "메뉴 등록 오류", JOptionPane.ERROR_MESSAGE);
        }

        //메뉴 이미지 선택 확인
        else if(menuImagePreviewLabel.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "메뉴 이미지를 선택해주세요.", "메뉴 등록 오류", JOptionPane.ERROR_MESSAGE);
        }

        //복사할 폴더의 경로 + 이미지 파일 이름 + 이미지 파일 확장자 세팅
        copyFilePath = localImagePath + inputMenuName + "." + chooserFileExtension;

        //선택한 파일의 경로를 저장
        targetFile = new File(chooserFilePath);
        bi = ImageIO.read(targetFile);
        //복사할 파일 생성
        File newFile = new File(copyFilePath);

        //복사한 파일을 지정한 경로에 저장
        ImageIO.write(bi, chooserFileExtension, newFile);

        MenuDto menu = menuController.menuCheck(inputMenuName);

        if(menu != null){
            JOptionPane.showMessageDialog(null, "이미 등록된 메뉴입니다.", "메뉴 등록 오류", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //메뉴 등록
            MenuDto newMenu = new MenuDto(inputMenuName, Integer.parseInt(inputMenuPrice), inputMenuCategory, copyFilePath);
            menuController.upLoadMenu(newMenu);
            JOptionPane.showMessageDialog(null, "메뉴가 등록되었습니다.", "메뉴 등록 완료", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new SellerManagementFrame();
        }


    }

    private void menuNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    //closeButtonActionPerformed
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //메뉴 등록 창 닫기
        dispose();
        new SellerManagementFrame();
    }

    private void menuImageUploadButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        //JFileChooser 생성
        JFileChooser fileChooser = new JFileChooser();
        //파일 선택 창의 타이틀 설정
        fileChooser.setDialogTitle("이미지 업로드");
        //파일 필터링
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & JPEG & PNG Images", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
        //파일 선택 창 오픈
        int returnVal = fileChooser.showOpenDialog(null);

        //파일을 선택했을 경우
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            log.info("선택한 파일의 경로 : " + fileChooser.getSelectedFile().getPath());
            //선택한 파일의 경로를 저장
            chooserFilePath = fileChooser.getSelectedFile().getPath();

            //선택한 파일의 이름을 저장
            String fileName = fileChooser.getSelectedFile().getName();

            //선택한 파일의 확장자를 저장
            chooserFileExtension = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());


            //선택한 파일의 확장자가 jpg 또는 png일 경우
            if(chooserFileExtension.equals("jpg") || chooserFileExtension.equals("png")) {
                setMenuImagePreviewLabel(chooserFilePath);
            }
            //선택한 파일의 확장자가 jpg 또는 png가 아닐 경우
            else {
                //파일 선택 창 오픈
                JOptionPane.showMessageDialog(null, "jpg, jpeg 또는 png 파일만 선택해주세요.", "이미지 업로드", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> menuCategoryComboBox;
    private javax.swing.JLabel menuCategoryLabel;
    private javax.swing.JLabel menuImagePreviewLabel;
    private javax.swing.JButton menuImageUploadButton;
    private javax.swing.JTextField menuNameField;
    private javax.swing.JLabel menuNameLabel;
    private javax.swing.JTextField menuPriceField;
    private javax.swing.JLabel menuPriceLabel;
    private javax.swing.JButton menuUploadButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
