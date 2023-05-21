package cse.foodtruck.order.system.dto.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserPwFindDto {
    private String Id;
    private String email;

    public static UserPwFindDto createDto(String email, String Id) {
        return UserPwFindDto.builder()
                .Id(Id)
                .email(email)
                .build();
    }
}
