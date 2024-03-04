package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Order;
import com.example.demo.respository.OrderDao;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao dao;

	@Override
	public List<Order> findAll() {
		return dao.findAll();
	}

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return dao.findOrderById(id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
