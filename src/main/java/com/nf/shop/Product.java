package com.nf.shop;

public class Product {

    private String id;
    public String productId;
    private String name;


    public Product() {
   }
    public Product( String id,String name) {
        this.name = name;
        this.id=id;

    }

    public String getId() {
        return productId;
    }
    public void setId(String id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
