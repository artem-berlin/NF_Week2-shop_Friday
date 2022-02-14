package com.nf.shop;

public class ShopService {

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
    }



    @Override
    public String toString() {
        return "ShopService{" +
                " productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }
}