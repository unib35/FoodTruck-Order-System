package cse.foodtruck.order.system.dto.user;

import lombok.*;

import java.sql.Timestamp;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto {
    public String id;
    public String name;
    public String email;
    public String password;
    public int balance;
    Timestamp signUpDate;
    public String form;
}
