package com.nt.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class Department {
	
	private Integer id;
	private String name;
	private List<Employee> employees = new ArrayList<>();
	
 public 	Department(Integer id,String name){
		this.id=id;
		this.name=name;
	}

}
