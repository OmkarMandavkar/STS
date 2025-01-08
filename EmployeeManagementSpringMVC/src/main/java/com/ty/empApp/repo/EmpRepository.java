package com.ty.empApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.empApp.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	Optional<Employee> findByEmail(String email);

}
