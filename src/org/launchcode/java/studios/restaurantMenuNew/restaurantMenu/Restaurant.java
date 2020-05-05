package org.launchcode.java.studios.restaurantMenuNew.restaurantMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args){

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem(0, "Steak", "tasty", 300, new Category("Dinner")));
        menuItems.add(new MenuItem(1, "Tacos", "awesome", 10, new Category("Lunch")));
        menuItems.add(new MenuItem(2, "Pie", "flaky crust", 50, new Category("Dessert")));

        Menu menu = new Menu("Steve's Menu", new Date(), menuItems);

        menu.addMenuItem((new MenuItem(3, "Ice Cream", "vanilla", 2, new Category("Dessert"))));

        System.out.println("Here is the menu:");
        menu.print();

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Which item would you like to remove?");
            int selected = input.nextInt();

            if(selected == -1)
            {
                System.out.println("Exiting");
                break;
            }

            System.out.println("You selected:" + selected);
            menu.deleteMenuItem(selected);
            menu.print();
        }

        ArrayList<MenuItem> orderItems = new ArrayList<>();
        while(true)
        {
            System.out.println("Which item would you like to order?");
            int selected = input.nextInt();

            if(selected == -1)
            {
                System.out.println("Exiting");
                break;
            }

            MenuItem orderedItem = menu.getMenuItem(selected);
            System.out.println("You ordered: " + orderedItem.getName());
            orderItems.add(orderedItem);
        }

        Receipt receipt = new Receipt(1, orderItems);
        receipt.printReceipt();

    }
}
