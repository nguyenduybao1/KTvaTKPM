package com.example.demo.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Order;

@Repository
public interface OrderDao {
	public List<Order> findAll();
	public Order save(Order order);
	public Order findOrderById(int id);
	public String delete(int id);
}
