package com.nf.shop;

import java.util.List;
public class ProductRepo {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    List<Product>products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> products() {
        return products;
    }
    public Product get(String id){
    Product result = new Product();
            for (Product product : products) {
                if (product.getId().equals(id))
                result = product;

            }  return result;
    }

    public void addProduct(Product currentProduct){
       products.add(currentProduct);
  }


    }



