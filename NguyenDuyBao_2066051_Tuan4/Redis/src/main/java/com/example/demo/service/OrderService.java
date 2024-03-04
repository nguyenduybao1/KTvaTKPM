package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;

@Service
public interface OrderService {
	public List<Order> findAll();
	public Order save(Order order);
	public Order findOrderById(int id);
	public String delete(int id);
}
