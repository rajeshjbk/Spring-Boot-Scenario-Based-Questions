package com.raj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.raj.dao.IEmployeeDAO;
import com.raj.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService{

	
	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public String addNewEmployee(Employee emp) throws Exception {
		
		int count = empDAO.insertNewEmployee(emp);
		
		return count==0?"New Employee is not saved.":"New Employee is saved Successfully.";
	}

	@Override
	public List<Employee> showAllEmployee() throws Exception {
		
		List<Employee> list = empDAO.viewAllEmployees();
		
		return list;
	}

	@Override
	public String updateEmployee(int id, double newSalary) throws Exception {
		
		int count = empDAO.updateEmployeeSalary(id, newSalary);
		
		return count==1?"EID: "+id+" is updated with new salary.":"EID: "+id+" is not updated with new salary.";
	}

	@Override
	public String deleteEmployee(int id) throws Exception {
		
		int count = empDAO.deleteEmployee(id);
		
		return count==1?"EID: "+id+", Employee is removed successfully.":"EID: "+id+", Employee is not removed.";
	}
}
