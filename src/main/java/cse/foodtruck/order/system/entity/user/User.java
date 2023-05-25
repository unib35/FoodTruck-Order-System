package cse.foodtruck.order.system.entity.user;

import cse.foodtruck.order.system.dto.user.UserIdCheckDto;
import cse.foodtruck.order.system.dto.user.UserLoginDto;
import cse.foodtruck.order.system.dto.user.UserPwFindDto;
import cse.foodtruck.order.system.dto.user.UserUpdateDto;
import lombok.*;

import java.sql.Timestamp;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {

    private String id;
    private String pw;
    private String name;
    private String email;
    private Timestamp signUpDate;
    private String form;
    private int balance;

    public static User toEntity(UserLoginDto dto){
        return User.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .build();
    }

    public static User toEntity(UserIdCheckDto dto){
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
    }

    public static User toEntity(UserPwFindDto dto){
        return User.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .build();
    }

    public static User toEntity(UserUpdateDto dto){
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .pw(dto.getPassword())
                .balance(dto.getBalance())
                .signUpDate(dto.getSignUpDate())
                .form(dto.getForm())
                .build();
    }

}
