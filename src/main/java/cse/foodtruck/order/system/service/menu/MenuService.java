package cse.foodtruck.order.system.service.menu;

import cse.foodtruck.order.system.dto.menu.MenuDto;
import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.dto.user.UserSignUpDto;
import cse.foodtruck.order.system.entity.menu.Menu;
import cse.foodtruck.order.system.entity.user.User;
import cse.foodtruck.order.system.repository.menu.MenuRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MenuService {
    private MenuRepository menuRepository;
    public MenuService(){
        this.menuRepository = new MenuRepository();
    }


    //메뉴 전체 리스트 가져오기
    public ArrayList<MenuDto> getMenuList(){
        ArrayList<Menu> menuList = menuRepository.findAll();
        ArrayList<MenuDto> resultList = new ArrayList<>();
        for(Menu menu : menuList){
            resultList.add(MenuDto.createDto(menu));
        }
        return resultList;
    }

    //메뉴를 Menu테이블에 업로드
    public MenuDto upLoadMenu(MenuDto dto){
        Menu menu = new Menu(dto.getName(), dto.getPrice(), dto.getCategory(), dto.getImage());
        menuRepository.save(menu);
        Menu result = menuRepository.findById(dto.getName());

        if(result == null) return null;
        else return MenuDto.createDto(result);
    }

    public MenuDto getMenu(String name){
        Menu menu = menuRepository.findById(name);
        if(menu == null) return null;
        else return MenuDto.createDto(menu);
    }

    public String[] getMenuComboList(String category){
        ArrayList<Menu> menuList = menuRepository.findAll();
        ArrayList<String> resultList = new ArrayList<>();
        for(Menu menu : menuList){
            if(menu.getCategory().equals(category)){
                resultList.add(menu.getName());
            }
        }
        String[] result = new String[resultList.size()];

        return resultList.toArray(result);

    }

    public ImageIcon getImage(String name){
        Menu menu = menuRepository.findById(name);
        ImageIcon imageIcon = new ImageIcon(menu.getImage());
        Image image = imageIcon.getImage();
        Image resizeImage = image.getScaledInstance(152, 129, Image.SCALE_SMOOTH);
        ImageIcon resizeImageIcon = new ImageIcon(resizeImage);

        if(menu == null) return null;
        else return resizeImageIcon;
    }

    public int getTotalPrice(ArrayList<MenuDto> cartList){
        int totalPrice = 0;
        for(MenuDto menu : cartList){
            totalPrice += menu.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<MenuDto> getMenuListByCategory(String category){
        ArrayList<Menu> menuList = menuRepository.findAll();
        ArrayList<MenuDto> resultList = new ArrayList<>();

        for(Menu menu : menuList){
            if(menu.getCategory().equals(category)){
                resultList.add(MenuDto.createDto(menu));
            }
        }
        if(resultList == null){
            return null;
        } else return resultList;
    }

    public boolean deleteMenu(String name){
        boolean result = menuRepository.deleteById(name);
        if(result) return true;
        else return false;
    }

    public MenuDto menuCheck(String name){
        Menu menu = menuRepository.findById(name);
        if(menu == null) return null;
        else return MenuDto.createDto(menu);
    }

    public MenuDto updateMenu(MenuDto dto){
        Menu menu = Menu.toEntity(dto);
        MenuDto result = MenuDto.createDto(menuRepository.update(menu));
        if(result == null) return null;
        else return result;
    }



}
