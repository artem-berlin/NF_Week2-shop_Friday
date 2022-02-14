package com.nf.shop;

import java.util.List;
import java.util.Optional;

public class ShopService {


    String id;
    String name;
    ProductRepo productRepo;
    OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    public Optional<Product> getProduct(String id)  {
        return Optional.ofNullable(productRepo.get(id));
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    //    public List<Product> products() {
//        return productRepo.products();
//    }
//    public Optional<Order> getOrder(String id){
//        return Optional.ofNullable(orderRepo.getOrder(id));
//    }
//    public String getName() {
//        return name;
//    }
//    public List<Order> listOrders(){
//        return OrderRepo.listOfOrders();
//    }
//

//
//    public ProductRepo getProductRepo() {
//        return productRepo;
//    }
//
//    public OrderRepo getOrderRepo() {
//        return orderRepo;
//    }
//    public void addOrder(Order order){
//        orderRepo.add(order);
//    }


    @Override
    public String toString() {
        return "ShopService{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }
}