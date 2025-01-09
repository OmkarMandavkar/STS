package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
