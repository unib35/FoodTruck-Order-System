package cse.foodtruck.order.system.controller;

import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.entity.menu.Menu;
import cse.foodtruck.order.system.service.menu.MenuService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MenuController {
    public static MenuController menuController = new MenuController();

    public static MenuController getInstance(){
        return menuController;
    }

    public MenuService menuService;
    public MenuController(){
        this.menuService = new MenuService();
    }

    public ArrayList<MenuDto> getMenuList(){
        ArrayList<MenuDto> result= this.menuService.getMenuList();
        System.out.println(result);
        return result;
    }

    public MenuDto getMenu(String name){
        MenuDto result = menuService.getMenu(name);

        return result;
    }

    public String[] getCategoryNameList(String category){
        String[] result = menuService.getMenuComboList(category);
        return result;
    }


    public ImageIcon getImage(String name){
        ImageIcon result = menuService.getImage(name);
        return result;
    }

    public int getTotalPrice(ArrayList<MenuDto> cartList){
        return menuService.getTotalPrice(cartList);
    }

    public ArrayList<MenuDto> getMenuListByCategory(String category){
        ArrayList<MenuDto> result = menuService.getMenuListByCategory(category);
        return result;
    }

    public boolean deleteMenu(String name){
        boolean result = menuService.deleteMenu(name);
        if(result) return true;
        else return false;

    }

    public MenuDto menuCheck(String menuName){
        MenuDto result = menuService.menuCheck(menuName);
        if(result == null) return null;
        else return result;
    }

    public MenuDto upLoadMenu(MenuDto dto){
        MenuDto result = menuService.upLoadMenu(dto);
        if(result == null) return null;
        else return result;
    }

    public MenuDto updateMenu(String name, String price, String category, String image){
        MenuDto result = menuService.updateMenu(new MenuDto(name, Integer.parseInt(price), category, image));
        if(result == null) return null;
        else return result;
    }



}
