package cse.foodtruck.order.system.dto.menu;

import cse.foodtruck.order.system.entity.menu.Menu;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {
    private String name;
    private int price;
    private String image;
    private String category; //음식 또는 음료

    public static MenuDto createDto(Menu entity) {
        return new MenuDto(
                entity.getName(),
                entity.getPrice(),
                entity.getImage(),
                entity.getCategory()
        );
    }
}
