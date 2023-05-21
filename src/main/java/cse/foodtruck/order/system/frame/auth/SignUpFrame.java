package cse.foodtruck.order.system.frame.auth;

import cse.foodtruck.order.system.controller.UserController;
import cse.foodtruck.order.system.dto.user.UserDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;

public class SignUpFrame extends JFrame {
    JTextField idField;
    JPasswordField pwField;
    JPasswordField checkPwField;
    JTextField nameField;
    JTextField emailField;
    JButton idCheckButton;
    JRadioButton adminRadioButton;
    JRadioButton userRadioButton;
    JRadioButton sellerRadioButton;
    private UserController userController = UserController.getInstance();

    public SignUpFrame(){
        setTitle("Sign Up");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(false);

        // 아이디 입력 필드
        JPanel idPanel = new JPanel();
        JLabel idLabel = new JLabel("아이디: ");
        idField = new JTextField(10);
        idPanel.add(idLabel);
        idPanel.add(idField);

        // 비밀번호 입력 필드
        JPanel pwPanel = new JPanel();
        JLabel pwLabel = new JLabel("비밀번호: ");
        pwField = new JPasswordField(10);
        pwPanel.add(pwLabel);
        pwPanel.add(pwField);

        // 비밀번호 확인 입력 필드
        JPanel checkPwPanel = new JPanel();
        JLabel checkPwLabel = new JLabel("비밀번호 확인: ");
        checkPwField = new JPasswordField(10);
        checkPwPanel.add(checkPwLabel);
        checkPwPanel.add(checkPwField);

        // 이름 입력 필드
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("이름: ");
        nameField = new JTextField(10);
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        //이메일 입력 필드
        JPanel emailPanel = new JPanel();
        JLabel emailLabel = new JLabel("이메일: ");
        emailField = new JTextField(10);
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);

        //회원 유형 선택 라디오 버튼
        JPanel radioPanel = new JPanel();
        adminRadioButton = new JRadioButton("관리자");
        userRadioButton = new JRadioButton("일반회원");
        sellerRadioButton = new JRadioButton("판매회원");

        ButtonGroup group = new ButtonGroup();
        group.add(adminRadioButton);
        group.add(userRadioButton);
        group.add(sellerRadioButton);
        radioPanel.add(adminRadioButton);
        radioPanel.add(userRadioButton);
        radioPanel.add(sellerRadioButton);


        // Id 중복확인 버튼
        idCheckButton = new JButton("중복확인");
        idCheckButton.addActionListener(new IdCheckButtonListener());
        idPanel.add(idCheckButton);

        // 회원가입 버튼
        JPanel buttonPanel = new JPanel();
        JButton signUpButton = new JButton("회원가입");
        signUpButton.addActionListener(new SignUpButtonListener());
        buttonPanel.add(signUpButton);

        //취소 버튼
        JButton cancelButton = new JButton("취소");
        cancelButton.addActionListener(new CancelButtonListener());


        Container c = getContentPane();
        c.setLayout(new GridLayout(9, 1));
        c.add(idPanel);
        c.add(pwPanel);
        c.add(checkPwPanel);
        c.add(namePanel);
        c.add(emailPanel);
        c.add(radioPanel);
        c.add(buttonPanel);
        c.add(cancelButton);



        setVisible(true);

    }
    class IdCheckButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = idField.getText();
            UserDto user = userController.idCheck(id);
            if(user == null){
                JOptionPane.showMessageDialog(null,"사용 가능한 아이디입니다.");
                idCheckButton.setEnabled(false);
                idField.setEnabled(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"이미 사용중인 아이디입니다.");
            }

        }
    }
    class SignUpButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputId = idField.getText();
            String inputPw = pwField.getText();
            String checkPw = checkPwField.getText();
            String name = nameField.getText();
            String email = emailField.getText();
            Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

            String form = "";

            //id 중복확인을 하지 않은 경우
            if(idCheckButton.isEnabled()){
                JOptionPane.showMessageDialog(null,"아이디 중복확인을 해주세요");
                return;
            }

            //회원 유형 라디오 구분
            if(adminRadioButton.isSelected()) {
                form = "관리자";
            }
            else if(userRadioButton.isSelected()) {
                form = "회원";
            }
            else if(sellerRadioButton.isSelected()) {
                form = "판매자";
            }
            else {
                //라디오 버튼 선택 안함
                JOptionPane.showMessageDialog(null,"회원 유형을 선택해주세요");
                return;
            }

            //입력란이 비어있는 경우
            if(inputId.replaceAll(" ","").equals("") ||
                    inputPw.replaceAll(" ","").equals("") ||
                    checkPw.replaceAll(" ","").equals("") ||
                    name.replaceAll(" ","").equals("")){
                JOptionPane.showMessageDialog(null,"입력란을 모두 채워주세요");
                return;
            }

            //비밀번호와 확인 비밀번호가 일치하지 않는 경우
            if(!inputPw.equals(checkPw)) {
                JOptionPane.showMessageDialog(null,"비밀번호가 일치하지 않습니다.");
                return;
            } else if(inputId.contains(" ")){
                JOptionPane.showMessageDialog(null, "아이디에 공백이 포함될 수 없습니다.");
                return;
            }

            //올바르지 않은 이메일 형식을 입력한 경우
            if(!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null,"올바른 이메일 형식을 입력해주세요");
                return;
            }

            UserDto user = userController.signUp(inputId, inputPw, checkPw, name, email, timeStamp, form);

            if(user == null) {
                JOptionPane.showMessageDialog(null,"이미 등록된 계정입니다..");
                idField.setEnabled(true);
                idCheckButton.setEnabled(true);
                return;
            }
            else {
                JOptionPane.showMessageDialog(null,"회원가입이 완료되었습니다.");
                dispose();
            }

        }
    }
    class CancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }


}
