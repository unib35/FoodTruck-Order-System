package cse.foodtruck.order.system.pattern.singleton;

import cse.foodtruck.order.system.database.Database;
import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.dto.user.UserDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Singleton {
    private static Singleton singleton = null;
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    private UserDto userDto;
    private MenuDto menuDto;
}
