package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

import java.sql.Timestamp;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserListDto {
    private String id;
    private String name;
    private String email;
    private Timestamp signupDate;
    private String Form;

    public static UserListDto createDto(User entity) {
        return UserListDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .signupDate(entity.getSignUpDate())
                .Form(entity.getForm())
                .build();
    }
}
