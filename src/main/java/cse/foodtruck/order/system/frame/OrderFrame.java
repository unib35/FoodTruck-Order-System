
package cse.foodtruck.order.system.frame;

import cse.foodtruck.order.system.controller.MenuController;
import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.frame.pay.PayFrame;
import cse.foodtruck.order.system.frame.seller.SellerMenuUploadFrame;
import cse.foodtruck.order.system.pattern.bridge.PaymentMethod;
import cse.foodtruck.order.system.pattern.singleton.Singleton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author lee
 */
public class OrderFrame extends javax.swing.JFrame {



    public ArrayList<MenuDto> menuList;
    public ArrayList<MenuDto> cartList = new ArrayList<>();
    public String[] foodComboList;
    public String[] beverageComboList;
    final String PREVEIW_IMAGE_PATH = "./src/main/java/cse/foodtruck/order/system/image/menu/preview.png";



    private String columnNames[] = {"메뉴", "가격", "카테고리"};
    private Object rowData[][];
    public MenuController menuController = MenuController.getInstance();
    UserDto user = Singleton.getInstance().getUserDto();
    public OrderFrame() {
        initComponents();
    }


    public void setMenuImagePreviewLabel(String path) {
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(bi);
            Image image = icon.getImage();
            Image resizedImage = image.getScaledInstance(150, 150 , Image.SCALE_SMOOTH);
            menuImageLabel.setIcon(new ImageIcon(resizedImage));
        } catch (IOException ex) {
            Logger.getLogger(SellerMenuUploadFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    private void showCartList(ArrayList<MenuDto> cartList) {
        rowData = new Object[cartList.size()][3];
        for (int i = 0; i < cartList.size(); i++) {
            rowData[i][0] = cartList.get(i).getName();
            rowData[i][1] = cartList.get(i).getPrice();
            rowData[i][2] = cartList.get(i).getCategory();
        }
        cartListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames));
    }


    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cartListTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        menuTabPanel = new javax.swing.JPanel();
        beverageLabel = new javax.swing.JLabel();
        foodLabel = new javax.swing.JLabel();
        foodMenuComboBox = new javax.swing.JComboBox<>();
        beverageMenuComboBox = new javax.swing.JComboBox<>();
        beverageMenuAddButton = new javax.swing.JButton();
        foodMenuAddButton = new javax.swing.JButton();
        menuImageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartMenuDeleteButton = new javax.swing.JButton();
        cartMenuDeleteAllButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        foodComboList = menuController.getCategoryNameList("음식");

        beverageComboList= menuController.getCategoryNameList("음료");


        setMenuImagePreviewLabel(PREVEIW_IMAGE_PATH);

        cartListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames)
        {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        cartListTable.addMouseListener(new java.awt.event.MouseAdapter() { //테이블에 마우스 리스너 연결
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartListTableMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(cartListTable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setJFrameStyle(this);

        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(CENTER);
        titleLabel.setText("주문 시스템");
        titleLabel.setHorizontalTextPosition(CENTER);

        beverageLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        beverageLabel.setHorizontalAlignment(CENTER);
        beverageLabel.setText("음료");
        setJLabelStyle(beverageLabel);




        foodLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        foodLabel.setHorizontalAlignment(CENTER);
        foodLabel.setText("음식");
        setJLabelStyle(foodLabel);

        foodMenuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(foodComboList));
        foodMenuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodMenuComboBoxActionPerformed(evt);
            }
        });

        beverageMenuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(beverageComboList));

        beverageMenuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodMenuComboBoxActionPerformed(evt);
            }
        });

        beverageMenuAddButton.setText("음료 추가");
        beverageMenuAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beverageMenuAddButtonActionPerformed(evt);
            }
        });

        foodMenuAddButton.setText("음식 추가");
        foodMenuAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodMenuAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuTabPanelLayout = new javax.swing.GroupLayout(menuTabPanel);
        menuTabPanel.setLayout(menuTabPanelLayout);
        menuTabPanelLayout.setHorizontalGroup(
                menuTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuTabPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(menuTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuTabPanelLayout.createSequentialGroup()
                                                .addComponent(beverageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(beverageMenuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(beverageMenuAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(menuTabPanelLayout.createSequentialGroup()
                                                .addComponent(foodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(foodMenuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(foodMenuAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(10, Short.MAX_VALUE))
        );


        menuTabPanelLayout.setVerticalGroup(
                menuTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTabPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(menuTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(foodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(foodMenuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(foodMenuAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(menuTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(beverageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(beverageMenuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(beverageMenuAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        setJPanelStyle(menuTabPanel);

        javax.swing.GroupLayout menuImagePanelLayout = new javax.swing.GroupLayout(menuImageLabel);
        menuImageLabel.setLayout(menuImagePanelLayout);
        menuImagePanelLayout.setHorizontalGroup(
                menuImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        menuImagePanelLayout.setVerticalGroup(
                menuImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );




        cartMenuDeleteButton.setText("메뉴 삭제");
        cartMenuDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartMenuDeleteButtonActionPerformed(evt);
            }
        });

        cartMenuDeleteAllButton.setText("장바구니 비우기");
        cartMenuDeleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartMenuDeleteAllButtonActionPerformed(evt);
            }
        });

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cartMenuDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(cartMenuDeleteAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(menuTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(menuImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(menuTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(menuImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cartMenuDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cartMenuDeleteAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton)
                                .addGap(15, 15, 15))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void payButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        if(cartList.size() == 0){
            JOptionPane.showMessageDialog(null, "장바구니가 비어있습니다.");
            return;
        }
        else {
            //메뉴를 변경할수 없다는 확인/취소 창
            int result = JOptionPane.showConfirmDialog(null, "메뉴를 변경할 수 없습니다. 결제하시겠습니까?", "결제", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                dispose();
                new PayFrame(cartList, cartListTable);
            }
            else if(result == JOptionPane.NO_OPTION){
                return;
            }
        }
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        new UserMainFrame();
    }

    //deletebutton actionperformed
    private void cartMenuDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectedRow = cartListTable.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "삭제할 메뉴를 선택해주세요.");
            return;
        }
        else {
            cartList.remove(selectedRow);
            showCartList(cartList);
            JOptionPane.showMessageDialog(null, "메뉴가 삭제되었습니다.");
        }
    }



    private void cartMenuDeleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cartList.clear();
        showCartList(cartList);
        JOptionPane.showMessageDialog(null, "장바구니가 비워졌습니다.");
    }


    private void foodMenuAddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ArrayList<MenuDto> addList = new ArrayList<>();
        String selectedMenu = (String) foodMenuComboBox.getSelectedItem();
        MenuDto menu = menuController.getMenu(selectedMenu);
        if(menu == null){
            JOptionPane.showMessageDialog(null, "메뉴를 선택해주세요.");
            return;
        }
        else {
            cartList.add(menu);
            JOptionPane.showMessageDialog(null, "장바구니에 추가되었습니다.");
            showCartList(cartList);
        }
    }

    private void beverageMenuAddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ArrayList<MenuDto> addList = new ArrayList<>();
        String selectedMenu = (String) beverageMenuComboBox.getSelectedItem();
        MenuDto menu = menuController.getMenu(selectedMenu);
        if(menu == null){
            JOptionPane.showMessageDialog(null, "메뉴를 선택해주세요.");
            return;
        }
        else {
            cartList.add(menu);
            showCartList(cartList);
            JOptionPane.showMessageDialog(null, "장바구니에 추가되었습니다.");
        }
    }

    private void cartListTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JTable table = (JTable) evt.getSource();
        int row = table.getSelectedRow();
        int column = table.getSelectedColumn();
    }

    //해당 메뉴의 이미지를 menuImagePanel에 띄우고, cartList에 추가
    private void foodMenuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String selectedMenu = (String) foodMenuComboBox.getSelectedItem();
        MenuDto menu = menuController.getMenu(selectedMenu);
        if(menu == null){
            JOptionPane.showMessageDialog(null, "다시 선택해주세요.");
            return;
        }
        else {
            setMenuImagePreviewLabel(menu.getImage());
        }

    }

    private void beverageMenuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String selected = (String) beverageMenuComboBox.getSelectedItem();
        MenuDto menu = menuController.getMenu(selected);
        setMenuImagePreviewLabel(menu.getImage());
    }


    public static void main(String[] args) {
        new OrderFrame().setVisible(true);
    }
    public static void setJFrameStyle(JFrame frame) {
        //TODO 부모 프레임 크기 설정 (가로, 세로) 및 배경색 지정
        frame.setBackground(Color.BLACK);
        //TODO 부모 프레임을 화면 가운데에 배치
        frame.setLocationRelativeTo(null);
        //TODO 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //TODO 부모 프레임 창 크기 고정 실시
        frame.setResizable(false);
        //TODO 부모 레이아웃 설정
        frame.getContentPane().setLayout(null);
    }
    public static void setJLabelStyle(JLabel txt) {
        txt.setOpaque(true); //TODO setBackground 적용하기 위한 선행 설정
        txt.setBackground(Color.GRAY); //TODO 백그라운드 색상 정의
        txt.setForeground(Color.BLACK); //TODO 텍스트 색상 정의
    }

    public static void setJPanelStyle(JPanel panel) {
        panel.setOpaque(true); //TODO setBackground 적용하기 위한 선행 설정
        panel.setBackground(Color.LIGHT_GRAY); //TODO 백그라운드 색상 정의
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel beverageLabel;
    private javax.swing.JButton beverageMenuAddButton;
    private javax.swing.JComboBox<String> beverageMenuComboBox;
    private javax.swing.JButton cartMenuDeleteAllButton;
    private javax.swing.JButton cartMenuDeleteButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JButton foodMenuAddButton;
    private javax.swing.JComboBox<String> foodMenuComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable cartListTable;
    private javax.swing.JLabel menuImageLabel;
    private javax.swing.JPanel menuTabPanel;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}
