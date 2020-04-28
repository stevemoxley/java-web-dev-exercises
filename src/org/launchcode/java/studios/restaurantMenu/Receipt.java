package org.launchcode.java.studios.restaurantMenu;

import java.util.ArrayList;

public class Receipt {
    final int _orderNumber;
    private double _total;
    private ArrayList<MenuItem> _orderItems;


    public Receipt(int orderNumber, ArrayList<MenuItem> orderItems)
    {
        _orderNumber = orderNumber;

        for (MenuItem orderItem: orderItems)
        {
            _total += orderItem.getCost();
        }

        _orderItems = orderItems;
    }

    public void printReceipt(){

        System.out.println(_orderNumber);

        for (MenuItem orderItem: _orderItems)
        {
            System.out.println(orderItem.getDescription());
        }

        System.out.println(_total);
    }

    public double getTotal(){
        return _total;
    }

}
