package com.raj.dao;

import java.util.List;

import com.raj.model.Employee;

public interface IEmployeeDAO {

	public int insertNewEmployee(Employee emp) throws Exception;
	
	public List<Employee> viewAllEmployees() throws Exception;
	
	public int updateEmployeeSalary(int id, double newSalary) throws Exception;
	
	public int deleteEmployee(int id) throws Exception;
}
