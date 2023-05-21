package cse.foodtruck.order.system.entity.user;

import cse.foodtruck.order.system.dto.user.UserIdFindDto;
import cse.foodtruck.order.system.dto.user.UserLoginDto;
import cse.foodtruck.order.system.dto.user.UserPwFindDto;
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

    public static User toEntity(UserLoginDto dto){
        return User.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .build();
    }

    public static User toEntity(UserIdFindDto dto){
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
}
