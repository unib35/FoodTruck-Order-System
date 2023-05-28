package cse.foodtruck.order.system.pattern.observer;

import cse.foodtruck.order.system.dto.user.UserData;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.dto.user.UserLoginDto;

public class DataCollection {
    private static DataCollection dataCollection;
    private UserData userData;

    private DataCollection() {
        userData = new UserData();
    }

    public static DataCollection getInstance() {
        if (dataCollection == null) {
            dataCollection = new DataCollection();
        }
        return dataCollection;
    }

    public UserData getUserData(){
        return userData;
    }

}


