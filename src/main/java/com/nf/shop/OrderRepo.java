package com.nf.shop;
import java.util.*;

public class OrderRepo {

    String orderId;
    static List<Order> listOfOrders;

    public OrderRepo(List<Order> listOfOrders) {
        OrderRepo.listOfOrders = listOfOrders;
    }

    public OrderRepo(String orderId, List<Order> listOfOrders) {
        this.orderId = orderId;
        OrderRepo.listOfOrders = listOfOrders;
    }

    public  List<Order> listOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(List<Order> listOfOrders) {
        OrderRepo.listOfOrders = listOfOrders;
    }
    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orderId='" + orderId + '\'' +
                ", listOfOrders=" + listOfOrders +
                '}';
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void add(Order order){
        listOfOrders.add(order);
    }

}














