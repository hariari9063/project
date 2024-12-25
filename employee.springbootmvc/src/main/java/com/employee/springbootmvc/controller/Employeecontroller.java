package com.employee.springbootmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.springbootmvc.model.Employee;



public class Employeecontroller {
	@GetMapping("/empform")
	public String getempform()
	{
		return"add-employee";
	}
	
    @PostMapping("/saveemployee")
    public String saveemployee(Employee employee)
    {
    	System.out.println(employee);
    	return "success";
    }
}
