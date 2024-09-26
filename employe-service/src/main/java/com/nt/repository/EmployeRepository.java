package com.nt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.model.Employe;

@Repository
public class EmployeRepository {
	
	List<Employe> employes = new ArrayList<Employe>();
	
	public Boolean add(Employe employe) {
		return employes.add(employe);
		
	}
	
	public List<Employe> findAll(){
		return employes;
	}
	
	public Employe findById(Integer empId) {
		return employes.stream()
				 .filter(emp->emp.getId().equals(empId))
				 .findFirst()
				 .orElseThrow();
	}
	
	public List<Employe> findByDeptId(Integer deptId) {
		return employes.stream()
				 .filter(emp->emp.getDeptId().equals(deptId))
				 .toList();
	}

}
