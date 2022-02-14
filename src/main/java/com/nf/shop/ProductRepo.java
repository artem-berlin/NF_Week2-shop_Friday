package com.nf.shop;

import java.util.List;
import java.util.Objects;

public class ProductRepo {
    String id;
    private List<Product> products;

    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> products() {
        return products;
    }


    public void addProduct(Product currentProduct){
       products.add(currentProduct);
  }
    public Product get(String id) throws Exception {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) {
                return product;
            }
        }
        throw new Exception("Element is not in List!");
    }
}




