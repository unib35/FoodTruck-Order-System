package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private String id;
    private String pw;
    private String name;
    private String email;
    private Timestamp signUpDate;
    private String form;



    public static UserDto createDto(User entity) {
        return new UserDto(
                    entity.getId(),
                    entity.getPw(),
                    entity.getName(),
                    entity.getEmail(),
                    entity.getSignUpDate(),
                    entity.getForm()
                );
    }
}
