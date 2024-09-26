package com.nt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.model.Department;

@Repository
public class DepartmentRepository {
	
	List<Department> departments = new ArrayList<Department>();
	
	public Department add(Department department) {
		departments.add(department);
		return department;
	}
	
	public Department findById(Integer id) {
		return departments.stream()
		 .filter(dept->dept.getId().equals(id))
		 .findFirst()
		 .orElseThrow();	
	}

	 public List<Department> findAll() {
		 return departments;
	 }
}
