package org.launchcode.java.studios.restaurantMenuNew.restaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date lastModified;
    private ArrayList<MenuItem> menuItems;

    public Menu(String name, Date lastModified, ArrayList<MenuItem> menuItems){
        this.name = name;
        this.lastModified = lastModified;
        this.menuItems = menuItems;
    }

    public void print(){
        System.out.println(name);
        System.out.println("Last Modified: "+ lastModified.toString());
        for (MenuItem menuItem: menuItems ) {
            System.out.println(menuItem.getName() + ": " + menuItem.getDescription()+ " $"+menuItem.getCost());
        }
    }

    public MenuItem getMenuItem(int index){
        return menuItems.get(index);
    }

    public void deleteMenuItem(int index){
        menuItems.remove(index);
    }

}
