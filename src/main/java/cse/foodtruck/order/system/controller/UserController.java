package cse.foodtruck.order.system.controller;

import cse.foodtruck.order.system.dto.user.*;
import cse.foodtruck.order.system.service.user.UserService;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Objects;

public class UserController {
    public static UserController userController = new UserController();
    public static UserController getInstance(){ return userController; }

    private static UserService userService;

    private UserController() { this.userService = new UserService(); }

    public UserDto login(String id, String pw) {
        UserLoginDto dto = new UserLoginDto(id, pw);

        UserDto user = userService.login(dto);

        // 로그인 실패 시 null 리턴
        if (Objects.isNull(user)) return null;

        return user;
    }

    public UserDto signUp(String id, String newPw, String checkPw, String name, String email, Timestamp timestamp, String form){
        UserSignUpDto dto = new UserSignUpDto(id, newPw, checkPw, name, email, timestamp, form);
        UserDto user = userService.signUp(dto);
        return user;
    }

    public UserDto idCheck(String id){
        UserDto user = userService.idCheck(id);
        return user;
    }

    public UserDto findIdByEmailAndName(String email, String name){
        UserDto result = userService.findIdByEmailAndName(UserIdFindDto.createDto(email, name));
        return result;
    }

    public UserDto findPwByEmailAndId(String email, String id){
        UserDto result = userService.findPwByEmailAndId(UserPwFindDto.createDto(email, id));
        return result;
    }

}
