package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserLoginDto {
    private String id;
    private String pw;

    public static UserLoginDto createDto(User entity) {
        return new UserLoginDto(
                entity.getId(),
                entity.getPw()
        );
    }
}
