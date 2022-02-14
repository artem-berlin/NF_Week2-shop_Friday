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
    public Optional<Product> getProduct(String id) throws Exception {
        return Optional.ofNullable(productRepo.get(id));
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }


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