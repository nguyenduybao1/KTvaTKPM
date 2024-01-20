package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.reponsity.UserReponsity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	UserReponsity userReponsive;

	// Get List User
	@GetMapping("/user")
	public List<User> getAllUser() {
		List<User> listUser = new ArrayList<>();
		listUser = userService.getAllUser();
		return listUser;
	}

	// Add User
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		userService.addUser(user);
		return user;
	}

	// Tim thong tin theo id
	@GetMapping("/user/{id}")
	public User findByIdUser(@PathVariable Integer id) {
		Optional<User> optional = userReponsive.findById(id);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			new RuntimeException("Khong co user theo id này");
		}

		return user;
	}
}
