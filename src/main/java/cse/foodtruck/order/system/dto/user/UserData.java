package cse.foodtruck.order.system.dto.user;

import cse.foodtruck.order.system.pattern.observer.Observer;
import cse.foodtruck.order.system.pattern.observer.Subject;

import java.util.ArrayList;

public class UserData implements Subject {
    private ArrayList<Observer> observers;
    private UserDto userDto;

    public UserData() {
        observers = new ArrayList<Observer>();
        userDto = null;
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update();
        }
    }

    public UserDto getUserDto(){
        return userDto;
    }

    public void setStatus(UserDto userDto){
        this.userDto = userDto;
        notifyObserver();
    }
}
