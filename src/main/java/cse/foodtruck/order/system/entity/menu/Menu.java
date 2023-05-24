package cse.foodtruck.order.system.entity.menu;

import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.dto.user.UserIdCheckDto;
import cse.foodtruck.order.system.entity.user.User;
import lombok.*;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Menu {
    //테이블명 : menu, 컬럼명 : 대문자
    String name; //메뉴 이름 (varchar 20) - 주키 설정
    int price; //가격 (int) - not null
    String image; //메뉴 이미지 경로 (varchar 100)
    //이미지 없을경우 -> default : "src/main/java/cse/foodtruck/order/system/image/menu/defaultMenuImage.png"
    String category; //음식 또는 음료 (varchar 10) - not null

    public static Menu toEntity(MenuDto dto){
        return Menu.builder()
                .name(dto.getName())
                .name(dto.getName())
                .image(dto.getImage())
                .category(dto.getCategory())
                .build();
    }
}
