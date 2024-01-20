package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
