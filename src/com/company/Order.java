package com.company;

import java.util.ArrayList;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;

    //Constructor Method
    public Order(int _orderId) {
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

}

//add an order, add quantity
//setters and getters, pass in menu items add it to menu list
//put whole oder in transaction
//arraylist to store multiple menu items
//change menu to have a price (menu price)
//pass in price when  menu is created
