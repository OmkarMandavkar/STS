package com;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByName(String name);
	public List<Employee> findByPhone(long phone);
	public List<Employee> findByAddress(String address);

	public Employee findByNameAndPhone(String name, long phone);
	public Employee findByPhoneAndAddress(long phone, String address);
	public Employee findByNameAndAddress(String name, String address);

	public List<Employee> findByNameOrPhone(String name, long phone);
	public List<Employee> findByPhoneOrAddress(long phone, String address);
	public List<Employee> findByNameOrAddress(String name, String address);
	
	public Optional<Employee> findByNameAndPhoneAndAddress(String name, long phone, String address);


	@Query("SELECT e FROM Employee e WHERE e.name=:name")	
	public List<Employee> getByName(String name);

	@Query("SELECT e FROM Employee e WHERE e.phone=:phone")	
	public List<Employee> getByPhone(String phone);

	@Query("SELECT e FROM Employee e WHERE e.address=:address")	
	public List<Employee> getByAddress(String address);

	

}
