package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
    private OrderService dao;

    @PostMapping("/save")
    public Order save(@RequestBody Order order) {
        return dao.save(order);
    }

    @GetMapping("/findAll")
    public List<Order> getAllOrders() {
        return dao.findAll();
    }

    @GetMapping("findOrderById/{id}")
    public Order findOrder(@PathVariable int id) {
        return dao.findOrderById(id);
    }
    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.delete(id);
	}
}
