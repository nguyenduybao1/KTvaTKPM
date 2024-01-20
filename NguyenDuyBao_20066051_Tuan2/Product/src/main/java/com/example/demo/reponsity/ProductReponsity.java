package com.example.demo.reponsity;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
