package com.nf.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    String orderId;

    List<Product> itemProductsInOrder = new ArrayList<>();
    public Order() {}

    public Order(String orderId, List<Product> itemProductsInOrder)
    {
        this.itemProductsInOrder = itemProductsInOrder;
        this.orderId = orderId;
    }
   public  Object itemProductsInOrder() {
       return itemProductsInOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +

                ", itemProductsInOrder=" + itemProductsInOrder +
                '}';
    }
}