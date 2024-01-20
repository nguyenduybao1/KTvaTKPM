package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.reponsity.ProductReponsity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductReponsity productReponsity;

    @Override
    public List<Product> getAllProduct() {
        List<Product> products= new ArrayList<>();
        products=productReponsity.findAll();
        return products;
    }

    @Override
    public void addProduct(Product product) {
        productReponsity.save(product);
    }
}
