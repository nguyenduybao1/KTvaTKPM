package com.example.demo.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Order;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

	public static final String HASH_KEY = "Order";
	
	private final RedisTemplate template;

    OrderDaoImpl(RedisTemplate template) {
        this.template = template;
    }

	@Override
	public List<Order> findAll() {

		return template.opsForHash().values(HASH_KEY);
	}

	@Override
	public Order save(Order order) {
		template.opsForHash().put(HASH_KEY, order.getId(), order);
		return order;
	}

	@Override
	public Order findOrderById(int id) {
		return (Order) template.opsForHash().get(HASH_KEY, id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		template.opsForHash().delete(HASH_KEY, id);
		return "order removed !!";
	}

}
