package cse.foodtruck.order.system.pattern.singleton;

import cse.foodtruck.order.system.dto.user.UserDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Singleton instance created");
    }
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    private UserDto userDto;

}
