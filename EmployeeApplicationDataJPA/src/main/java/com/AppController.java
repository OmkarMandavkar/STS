package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/save")
	public Employee saveRecords(@RequestBody Employee employee) {
		Employee emp = repository.save(employee);
		System.out.println(emp);
		return emp;
	}

	@DeleteMapping("/delete")
	public String deleteRecord(@RequestParam int id) {
		repository.deleteById(id);
		return "Record Deleted";
	}
	
	@GetMapping("/fetchById")
	public Employee fetchById(@RequestParam int id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
	}
	
	@GetMapping("/fetchAllRecord")
	public List<Employee> getAll() {
		List<Employee> employee = repository.findAll();
		System.out.println("\nAll Records:");
		for (Employee emp : employee) {
			System.out.println(emp);
		}
		return employee;
	}

	
	// CUSTOM METHODS
	
	@GetMapping("/name/{name}")
	public List<Employee> getByName(@PathVariable String name) {
		return repository.findByName(name);
	}

	@GetMapping("/phone/{phone}/address/{address}")
	public Employee getByPhoneAndAddress(@PathVariable long phone, @PathVariable String address) {
		return repository.findByPhoneAndAddress(phone, address);
	}
	
	@GetMapping("/name/{name}/phone/{phone}")
	public List<Employee> getByPhoneOrAddress(@PathVariable String name, @PathVariable long phone) {
		return repository.findByNameOrPhone(name, phone);
	}
}
