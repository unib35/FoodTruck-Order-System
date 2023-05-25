package cse.foodtruck.order.system.dto.user;


import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserSignUpDto {
    private String id;
    private String newPw;
    private String checkPw;
    private String name;
    private String email;
    private Timestamp signUpDate;
    private String form;
    private int balance;
}
