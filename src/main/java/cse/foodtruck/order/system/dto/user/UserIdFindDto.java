package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserIdFindDto {
    private String Id = null;
    private String name;
    private String email;


    public static UserIdFindDto createDto(String email, String name) {
        return UserIdFindDto.builder()
                .name(name)
                .email(email)
                .build();
    }

}
