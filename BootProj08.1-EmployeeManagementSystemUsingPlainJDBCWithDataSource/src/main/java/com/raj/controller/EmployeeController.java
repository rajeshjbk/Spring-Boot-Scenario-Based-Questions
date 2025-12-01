package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.raj.model.Employee;
import com.raj.service.IEmployeeService;

@Controller("empController")
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;
	
	public String addEmployee(Employee emp) throws Exception{
		
		String msg = empService.addNewEmployee(emp);
		
		return msg;
	}
	
	public List<Employee> ViewAllEmployees() throws Exception{
		
		List<Employee> list = empService.showAllEmployee();
		
		return list;
	}
	
	public String updateEmployee(int id, double newsalary) throws Exception {
		
		String msg = empService.updateEmployee(id, newsalary);
		
		return msg;
	}
	
	public String deleteEmployee(int id) throws Exception{
		
		String msg = empService.deleteEmployee(id);
		
		return msg;
	}
}
