package org.launchcode.java.studios.restaurantMenu;

import org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.MenuItem;

import java.util.ArrayList;

public class Receipt {
    final int orderNumber;
    private double total;
    private ArrayList<org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.MenuItem> orderItems;


    public Receipt(int orderNumber, ArrayList<org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.MenuItem> orderItems)
    {
        this.orderNumber = orderNumber;

        for (org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.MenuItem orderItem: orderItems)
        {
            total += orderItem.getCost();
        }

        this.orderItems = orderItems;
    }

    public void printReceipt(){

        System.out.println("Order #"+orderNumber);

        for (MenuItem orderItem: orderItems)
        {
            System.out.println(orderItem.getName() + " $"+ orderItem.getCost());
        }

        System.out.println("Grand total:" + total);
    }

    public double getTotal(){
        return total;
    }

}
