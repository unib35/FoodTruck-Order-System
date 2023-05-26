package cse.foodtruck.order.system.frame.admin;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.dto.user.UserListDto;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author lee
 */
public class AdminManagementFrame extends javax.swing.JFrame {

    private UserController userController = UserController.getInstance();
    ArrayList<UserDto> userList;
    private String columnNames[] = {"id", "name", "email", "signupdate", "form"};
    private Object rowData[][];


    public AdminManagementFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    //테이블에 유저 리스트를 띄워주는 메소드
    private void showUserList() {
        userList = userController.getUserList(); //유저 리스트를 받아옴
        rowData = new Object[userList.size()][5]; //테이블 데이터

        for(int i = 0; i < userList.size(); i++) {
            rowData[i][0] = userList.get(i).getId();
            rowData[i][1] = userList.get(i).getName();
            rowData[i][2] = userList.get(i).getEmail();
            rowData[i][3] = userList.get(i).getSignUpDate();
            rowData[i][4] = userList.get(i).getForm();
        }

        userListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames));
    }

    private void showSearchUserList(ArrayList<UserDto> userList) {
        rowData = new Object[userList.size()][5]; //테이블 데이터

        for(int i = 0; i < userList.size(); i++) {
            rowData[i][0] = userList.get(i).getId();
            rowData[i][1] = userList.get(i).getName();
            rowData[i][2] = userList.get(i).getEmail();
            rowData[i][3] = userList.get(i).getSignUpDate();
            rowData[i][4] = userList.get(i).getForm();
        }

        userListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames));
    }

    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        deleteUserButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        searchTypeComboBox = new javax.swing.JComboBox<>();
        searchTypeLabel = new javax.swing.JLabel();
        allUserFindButton = new javax.swing.JButton();


        setPreferredSize(new java.awt.Dimension(600, 400));

        showUserList(); //테이블에 유저 리스트를 띄워줌

        userListTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames) { //테이블 모델 설정
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) { //셀 수정 불가
                return canEdit [columnIndex];
            }
        });

        userListTable.addMouseListener(new java.awt.event.MouseAdapter() { //테이블에 마우스 리스너 연결
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListTableMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(userListTable);
        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setPreferredSize(new java.awt.Dimension(600, 400));
        titleLabel.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("회원 관리 모드");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        deleteUserButton.setText("회원 삭제");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        searchButton.setText("검색");
        searchButton.setActionCommand("검색");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });





        searchTypeComboBox.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        searchTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(columnNames));
        searchTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeComboBoxActionPerformed(evt);
            }
        });

        searchTypeLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        searchTypeLabel.setText("검색 유형");

        allUserFindButton.setText("모든 회원 조회");
        allUserFindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allUserFindButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(deleteUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(searchField))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchTypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(101, 101, 101)
                                                .addComponent(allUserFindButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchTypeLabel)
                                        .addComponent(allUserFindButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
        );

        pack();
        setVisible(true);
    }// </editor-fold>

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int selectRow = userListTable.getSelectedRow();
        if(selectRow == -1) {
            JOptionPane.showMessageDialog(null, "삭제할 회원을 선택해주세요.");
        }
        else {
            int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "회원 삭제", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String selectRowId = (String) userListTable.getValueAt(selectRow, 0);
                String selectRowForm = (String) userListTable.getValueAt(selectRow, 4); //회원 유형
                //관리자는 삭제 불가
                if(selectRowForm.equals("관리자")){
                    JOptionPane.showMessageDialog(null, "관리자는 삭제할 수 없습니다.");
                    return;
                }

                //회원 삭제 여부 알림창


                if(userController.deleteUser(selectRowId)){
                    JOptionPane.showMessageDialog(null, "회원 삭제가 완료되었습니다.");
                    showUserList(); //회원 삭제 후 테이블 갱신
                } else{
                    JOptionPane.showMessageDialog(null, "회원 삭제에 실패하였습니다.");
                }

            }
        }

    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //검색 버튼 클릭
        String searchType = (String) searchTypeComboBox.getSelectedItem();
        String searchWord = searchField.getText();
        ArrayList<UserDto> searchedUserList = userController.getUserListBySearch(searchType, searchWord);
        if(searchedUserList == null){
            JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
        } else{
            showSearchUserList(searchedUserList);
        }

    }

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void userListTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JTable table = (JTable) evt.getSource();
        int row = table.getSelectedRow();
        int column = table.getSelectedColumn();
    }



    private void allUserFindButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        showUserList();
    }

    private void searchTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //검색 조건 선택
        String searchType = (String) searchTypeComboBox.getSelectedItem();



    }


    // Variables declaration - do not modify
    private javax.swing.JButton allUserFindButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> searchTypeComboBox;
    private javax.swing.JLabel searchTypeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userListTable;
    // End of variables declaration
}
