package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.reponsity.UserReponsity;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserReponsity userReponsity;
	
	@Override
	public List<User> getAllUser() {
		List<User> users= new ArrayList<>();
		users=userReponsity.findAll();
		return users;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userReponsity.save(user);
	}

}
