package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	public List<User> getAllUser(); 
	public void addUser(User user);
}
