package com.nf.shop;

public class ShopService {


    private String id;
    private String name;
    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    public void getProduct(String id) throws Exception {
        productRepo.get(id);
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