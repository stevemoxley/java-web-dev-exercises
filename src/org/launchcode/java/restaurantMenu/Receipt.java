package org.launchcode.java.restaurantMenu;

import java.util.ArrayList;

public class Receipt {
    final int _orderNumber;
    private double _total;
    ArrayList<MenuItem> _orderItems;


    public Receipt(int orderNumber, ArrayList<MenuItem> orderItems)
    {
        _orderNumber = orderNumber;

        for (MenuItem orderItem: orderItems)
        {
            _total += orderItem.cost;
        }

        _orderItems = orderItems;
    }

    public void printReceipt(){

        System.out.println(_orderNumber);

        for (MenuItem orderItem: _orderItems)
        {
            System.out.println(orderItem.description);
        }

        System.out.println(_total);
    }

    public double getTotal(){
        return _total;
    }

}
