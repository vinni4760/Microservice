package com.nt.connect;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;

@FeignClient(name="employe-service")
public interface EmployeClient {

	@GetMapping("/employe/getBydeptId")
	public List<Employee> getBydeptId(@RequestParam Integer id);
		
}
