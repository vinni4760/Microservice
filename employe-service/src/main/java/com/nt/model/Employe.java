package com.nt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Employe {
	
	private Integer id;
	private Integer deptId;
	private String name;
	private String position;
	private Double salary;
	
	public Employe(Integer id,String name) {
		this.id=id;
		this.name=name;
	}

}
