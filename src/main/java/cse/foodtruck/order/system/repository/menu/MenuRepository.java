package cse.foodtruck.order.system.repository.menu;

import cse.foodtruck.order.system.entity.menu.Menu;
import cse.foodtruck.order.system.repository.base.CrudRepository;

public class MenuRepository extends CrudRepository<Menu, String> {
    public MenuRepository(){
        super.setEntity(new Menu());
    }
}
