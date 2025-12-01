package com.raj;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.raj.controller.EmployeeController;
import com.raj.model.Employee;

@SpringBootApplication
@ImportResource("com/raj/cfgs/applicationContext.xml")
public class BootProj08EmployeeManagementSystemUsingPlainJdbcWithDataSourceApplication {
	
	public static void main(String[] args) throws Exception {
	  
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj08EmployeeManagementSystemUsingPlainJdbcWithDataSourceApplication.class, args);
				Scanner sc = new Scanner(System.in);){
			
			EmployeeController controller = ctx.getBean(EmployeeController.class);
			
			while(true) {
				System.out.println("\n***** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM *****");
				System.out.println("Press 1 For Adding New Employee. ");
				System.out.println("Press 2 For Showing All Employees. ");
				System.out.println("Press 3 For Updating Employee Salary. ");
				System.out.println("Press 4 For Deleting Employee. ");
				System.out.println("Press 5 For Exit from Application.");
				
				System.out.print("\nEnter Your Choice: ");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				
				case 1:
					System.out.print("Enter Employee Name: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Employee Department: ");
					String dept = sc.nextLine().toUpperCase();
					
					System.out.print("Enter Employee Salary: ");
					double sal = Double.parseDouble(sc.nextLine());
					
					Employee emp = new Employee(name, dept, sal);
					
					String msg = controller.addEmployee(emp);
					System.out.println(msg);
					break;
					
				case 2:
					System.out.println("\nAll Employee Details: ");
					List<Employee> allEmployees = controller.ViewAllEmployees();
					
					allEmployees.forEach(System.out::println);
					break;
					
				case 3:	
					System.out.print("Enter EID of Employee: ");
					int eId = Integer.parseInt(sc.nextLine());
					
					System.out.print("Enter New Salary: ");
					sal = Double.parseDouble(sc.nextLine());
					
					msg = controller.updateEmployee(eId, sal);
					
					System.out.println(msg);
					break;
					
				case 4:
					System.out.print("Enter EID of Employee: ");
				    eId = Integer.parseInt(sc.nextLine());
				    
				    msg = controller.deleteEmployee(eId);
				    System.out.println(msg);
				    break;
				    
				case 5:
					System.exit(0);
					
				default:
					System.err.println("Invalid Choice...");
				}
				
				System.out.println("\n");
			}
		}
	}

}
