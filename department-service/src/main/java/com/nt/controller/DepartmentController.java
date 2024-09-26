package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.connect.EmployeClient;
import com.nt.model.Department;
import com.nt.repository.DepartmentRepository;


@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private EmployeClient client;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/add")
	public ResponseEntity<String> addDepartment(@RequestBody Department department){
	 System.out.println(	departmentRepository.add(department));
		return new ResponseEntity<String>("Added Success",HttpStatus.CREATED);
	}
	
	@GetMapping("/getById")
	public ResponseEntity<Department> getById(@RequestParam Integer id){
	 Department department = 	departmentRepository.findById(id);
		return new ResponseEntity<Department>(department,HttpStatus.OK);
	}
	
	
	@GetMapping("/getall")
	public ResponseEntity<List<Department>> getAll(){
	 List<Department> departments = 	departmentRepository.findAll();		
	 departments.forEach(dept->dept.setEmployees(client.getBydeptId(dept.getId())));
		return new ResponseEntity<List<Department>>(departments,HttpStatus.OK);
	}

}
