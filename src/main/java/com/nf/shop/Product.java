package com.nf.shop;

public class Product {


    private String productId;
    private String name;


    public Product() {
   }
    public Product( String productId,String name) {
        this.name = name;
        this.productId=productId;

    }

    public String getId() {
        return productId;
    }
    public void setId(String id) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
   }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId+
                ", name='" + name + '\'' +
                '}';
    }
}
