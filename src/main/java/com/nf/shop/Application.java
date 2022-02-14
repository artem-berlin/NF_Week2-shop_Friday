package com.nf.shop;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//------------------------Step 1
        Product geige = new Product("1", "geige");
        Product cello = new Product("2", "cello");
        Product flute = new Product("3", "flute");
        Product trumpet = new Product("4", "trumpet");
//        System.out.println(geige);
//        System.out.println(trumpet);

//----------------------Step2
        List<Product> stringProduct = new ArrayList<Product>();
        List<Product> brassProduct = new ArrayList<Product>();
        List<Product> mixProduct = new ArrayList<Product>();

        stringProduct.add(geige);
        brassProduct.add(flute);
        stringProduct.add(cello);
        brassProduct.add(trumpet);
        mixProduct.add(geige);
        mixProduct.add(flute);
//        System.out.println(stringProduct);
//        System.out.println(brassProduct);;
//        System.out.println(mixProduct);;

//-----------------------Step3
        List<Order> orderList1 = new ArrayList<>();
        List<Order> orderList2 = new ArrayList<>();
        Order stringItem = new Order("1", stringProduct);
        Order brassItem = new Order("2", brassProduct);
        Order mixItem = new Order("3", mixProduct);
        orderList1.add(stringItem);
        orderList1.add(brassItem);
        orderList2.add(mixItem);
       System.out.println(orderList1);
//        System.out.println(orderList2);
//------------------------Step4
        OrderRepo repo1 = new OrderRepo(orderList1);
        OrderRepo repo2 = new OrderRepo(orderList2);
        repo1.setOrderId("1");
        System.out.println("Order repo is------------------  " + repo1);
        //System.out.println(repo2);


       ProductRepo productRepo1 = new ProductRepo(stringProduct);
       ShopService service1 = new ShopService(productRepo1,repo1);
        service1.setId("11");
       System.out.println("your service is----------------  " + service1);
    }
}
