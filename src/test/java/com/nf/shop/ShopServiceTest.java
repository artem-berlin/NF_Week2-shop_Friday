//package com.nf.shop;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ShopServiceTest {
//
//    @Test
//    void shouldReturnOneProduct() throws Exception {
//        Product geige = new Product("1", "geige");
//        List<Product> productList = new ArrayList<>();
//        productList.add(geige);
//        List<Order> orders = new ArrayList<>();
//        ProductRepo productRepo = new ProductRepo(productList);
//        OrderRepo orderRepo = new OrderRepo(orders);
//        ShopService shopService = new ShopService(productRepo, orderRepo);
//        shopService.getProduct("1");
//
//        assertEquals("geige", shopService.getProduct("1"));
//    }
//
//}