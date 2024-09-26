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

import com.nt.model.Employe;
import com.nt.repository.EmployeRepository;

import lombok.Getter;

@RestController
@RequestMapping("/employe")
public class EmployeController {
	
	@Autowired
	private EmployeRepository employeRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employe>> getAllEmploye(){
	  List<Employe>  employes =	employeRepository.findAll();
		return new ResponseEntity<List<Employe>>(employes,HttpStatus.OK);
	}
	
	@GetMapping("/getById")
	public ResponseEntity<Employe> getById(@RequestParam Integer id){
	  Employe  employe =	employeRepository.findById(id);
		return new ResponseEntity<Employe>(employe,HttpStatus.OK);
	}
	
	@GetMapping("/getBydeptId")
	public List<Employe> getBydeptId(@RequestParam Integer id){
		  List<Employe>  employes =	employeRepository.findByDeptId(id);
		   return employes;
		}
	
	@PostMapping("/add")
	public ResponseEntity<Boolean> getById(@RequestBody Employe employe){
	  Boolean flage=	employeRepository.add(employe);
		return new ResponseEntity<Boolean>(flage,HttpStatus.OK);
	}

}
