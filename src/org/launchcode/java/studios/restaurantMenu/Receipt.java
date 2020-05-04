package org.launchcode.java.studios.restaurantMenu;

import org.launchcode.java.studios.restaurantMenuNew.restaurantMenu.MenuItem;

import java.util.ArrayList;

public class Receipt {
    final int orderNumber;
    private double total;
    private ArrayList<MenuItem> orderItems;


    public Receipt(int orderNumber, ArrayList<MenuItem> orderItems)
    {
        this.orderNumber = orderNumber;

        for (MenuItem orderItem: orderItems)
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
