package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;
import com.repo.UserRepo;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

	@Autowired
	private UserRepo repo;
	
	/*
	 * @Valid is used to validate the constraints while reading the JSON data from the request
	*/
	
	@PostMapping("/save")
	public UserEntity getMethodName(@Valid @RequestBody UserEntity entity) {
		return entity;
	}
	
}
