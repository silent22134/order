package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public int total(){
        return amount+shipFeed;
    }

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFeed = delivery.price;
    }
}
