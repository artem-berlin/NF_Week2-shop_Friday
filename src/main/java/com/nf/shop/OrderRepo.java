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

    public Order getOrder(String orderId) {
        Order result = new Order();
        for (Order order : listOfOrders) {
            if (order.itemProductsInOrder().equals(orderId)) {
                result = order;
            }
        }
        return result;

    }

    public void add(Order order){
        listOfOrders.add(order);
    }


//    public Map<String,Order> orders = new HashMap<>();
//
//    public OrderRepo(List<Order> orders) {
//
//    }
//
//
//    public Collection<Order> list() {
//        return Collections.unmodifiableCollection(orders.values());
//    }
//
//    public Optional<Order> get(String id) {
//        return Optional.ofNullable(orders.get(id));
//    }
//
//    public void add(Order order) {
//        orders.put(order.getOrderId(), order);
//    }
}














