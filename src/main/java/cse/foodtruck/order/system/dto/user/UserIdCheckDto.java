package cse.foodtruck.order.system.dto.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserIdCheckDto {
    private String Id = null;
    private String name;
    private String email;


    public static UserIdCheckDto createDto(String email, String name) {
        return UserIdCheckDto.builder()
                .name(name)
                .email(email)
                .build();
    }

}
