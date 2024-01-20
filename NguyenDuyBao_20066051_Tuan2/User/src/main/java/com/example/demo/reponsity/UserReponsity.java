package com.example.demo.reponsity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserReponsity extends JpaRepository<User, Integer>{

}
