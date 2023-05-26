package cse.foodtruck.order.system.frame.seller;

import cse.foodtruck.order.system.controller.MenuController;
import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.pattern.singleton.Singleton;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author lee
 */
@Slf4j
public class SellerManagementFrame extends javax.swing.JFrame {

    MenuController menuController = MenuController.getInstance();
    private String columnNames[] = {"메뉴", "가격", "카테고리"};
    private Object rowData[][];
    ArrayList<MenuDto> menuList = menuController.getMenuList();


    public SellerManagementFrame() {
        initComponents();
    }

    private void showMenuList(ArrayList<MenuDto> menuList) {

        rowData = new Object[menuList.size()][3];

        for (int i = 0; i < menuList.size(); i++) {
            rowData[i][0] = menuList.get(i).getName();
            rowData[i][1] = menuList.get(i).getPrice();
            rowData[i][2] = menuList.get(i).getCategory();
        }
        menuListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuListTable = new javax.swing.JTable();
        MenuEditButton = new javax.swing.JButton();
        menuUploadButton = new javax.swing.JButton();
        menuDeleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        menuCategoryLabel = new javax.swing.JLabel();
        menuCategoryComboBox = new javax.swing.JComboBox<>();
        menuFindButton = new javax.swing.JButton();


        showMenuList(menuList);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("메뉴 관리 모드");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menuListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames)
        {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(menuListTable);

        MenuEditButton.setText("메뉴 수정");
        MenuEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEditButtonActionPerformed(evt);
            }
        });

        menuUploadButton.setText("메뉴 등록");
        menuUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUploadButtonActionPerformed(evt);
            }
        });

        menuDeleteButton.setText("메뉴 삭제");
        menuDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteButtonActionPerformed(evt);
            }
        });

        closeButton.setText("종료");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        menuCategoryLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        menuCategoryLabel.setText("카테고리");

        menuCategoryComboBox.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        menuCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체", "음식", "음료" }));
        menuCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoryComboBoxActionPerformed(evt);
            }
        });

        menuFindButton.setText("메뉴 조회");
        menuFindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFindButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(menuCategoryLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(menuCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                                .addComponent(menuFindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(menuDeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(menuUploadButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(MenuEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menuCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(menuCategoryLabel)
                                        .addComponent(menuFindButton))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menuUploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MenuEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menuDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void MenuEditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectedRow = menuListTable.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "수정할 메뉴를 선택해주세요.");
            return;
        }

        String menuId = menuListTable.getValueAt(selectedRow, 0).toString();
        MenuDto target = menuController.getMenu(menuId);
        Singleton.getInstance().setMenuDto(target);
        new SellerMenuUpdateFrame();
        dispose();
    }

    private void menuUploadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new SellerMenuUploadFrame();
    }

    private void menuDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectedRow = menuListTable.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "삭제할 메뉴를 선택해주세요.");
            return;
        }

        int result = JOptionPane.showConfirmDialog(null, "메뉴를 삭제하시겠습니까?", "메뉴 삭제", JOptionPane.YES_NO_OPTION);

        if(result == JOptionPane.YES_OPTION){
            String menuId = menuListTable.getValueAt(selectedRow, 0).toString();
            MenuDto target = menuController.getMenu(menuId);

            //해당 메뉴 이미지 삭제
            String menuImage = target.getImage();
            try {
                Files.deleteIfExists(Paths.get(menuImage));
                log.info("메뉴 이미지 삭제 성공");
            } catch (IOException e) {
                log.info("메뉴 이미지 삭제 실패");
                e.printStackTrace();
            }
            menuController.deleteMenu(menuId);
            JOptionPane.showMessageDialog(null, "메뉴가 삭제되었습니다.");


            //삭제 후 테이블 갱신
            showMenuList(menuController.getMenuList());
        } else{
            return;
        }

    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new SellerMainFrame();
    }

    private void menuCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void menuFindButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectedCategory = menuCategoryComboBox.getSelectedIndex();
        String selectedCategoryName = menuCategoryComboBox.getSelectedItem().toString();
        if(menuController.getMenuList().isEmpty()){
            JOptionPane.showMessageDialog(null, "메뉴가 존재하지 않습니다.");
            return;
        }
        else if(selectedCategoryName.equals("전체")){
            showMenuList(menuController.getMenuList());
            return;
        } else{
            ArrayList<MenuDto> searchMenuListByCategory = menuController.getMenuListByCategory(selectedCategoryName);
            showMenuList(searchMenuListByCategory);
        }

    }

    // Variables declaration - do not modify
    private javax.swing.JButton MenuEditButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> menuCategoryComboBox;
    private javax.swing.JLabel menuCategoryLabel;
    private javax.swing.JButton menuDeleteButton;
    private javax.swing.JButton menuFindButton;
    private javax.swing.JButton menuUploadButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable menuListTable;
    // End of variables declaration
}
