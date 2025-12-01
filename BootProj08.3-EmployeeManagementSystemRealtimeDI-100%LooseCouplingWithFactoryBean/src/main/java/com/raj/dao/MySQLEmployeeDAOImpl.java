package com.raj.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raj.model.Employee;

@Repository("mysqlEmpDAO")
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {

	private static final String INSERT_EMP = "INSERT INTO EMPLOYEE (ENAME,DEPT,SAL) VALUES (?,?,?)";
	
	private static final String SELECT_ALL_EMPS = "SELECT EID, ENAME, DEPT, SAL FROM EMPLOYEE";
	
	private static final String UPDATE_EMP = "UPDATE EMPLOYEE SET SAL=? WHERE EID=?";
	
	private static final String DELETE_EMP = "DELETE FROM EMPLOYEE WHERE EID=?";
	
	
	private DataSource ds;
	
	public MySQLEmployeeDAOImpl(DataSource ds) {
		
		this.ds=ds;
	}
	
	@Override
	public int insertNewEmployee(Employee emp) throws Exception {
		
		try(//get pooled connection
			Connection con = ds.getConnection();
			//create PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(INSERT_EMP);	){
			
			//set
			pstmt.setString(1, emp.getEName());
			pstmt.setString(2, emp.getDept());
			pstmt.setDouble(3, emp.getSal());
		
			int count = pstmt.executeUpdate();
			
			return count;
			
		}catch (SQLException se) {
			
			throw se;
			
		}catch (Exception e) {
			
			throw e;
		}
	
	}

	@Override
	public List<Employee> viewAllEmployees() throws Exception {
		
		try(//get pooled connection
				Connection con = ds.getConnection();
				//create PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(SELECT_ALL_EMPS);){
				
			     List<Employee> list = null;
			     
				try(ResultSet rs = pstmt.executeQuery()){
					
					list = new ArrayList<>();
					
					while(rs.next()) {
						
						Employee emp = new Employee();
						
						emp.setEId(rs.getInt(1));
						emp.setEName(rs.getString(2));
						emp.setDept(rs.getString(3));
						emp.setSal(rs.getDouble(4));
						
						list.add(emp);
					}
					return list;
				}
				
			}catch (SQLException se) {
				
				throw se;
				
			}catch (Exception e) {
				
				throw e;
			}
	}

	@Override
	public int updateEmployeeSalary(int id, double newSalary) throws Exception {
		
		try(//get pooled connection
				Connection con = ds.getConnection();
				//create PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(UPDATE_EMP);	){
				
				
			    pstmt.setDouble(1, newSalary);
			    pstmt.setInt(2, id);
			    
				int count = pstmt.executeUpdate();
				
				return count;
				
			}catch (SQLException se) {
				
				throw se;
				
			}catch (Exception e) {
				
				throw e;
			}
	}

	@Override
	public int deleteEmployee(int id) throws Exception {
		try(//get pooled connection
				Connection con = ds.getConnection();
				//create PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(DELETE_EMP);	){
				
			    pstmt.setInt(1, id);
			 			    
				int count = pstmt.executeUpdate();
				
				return count;
				
			}catch (SQLException se) {
				
				throw se;
				
			}catch (Exception e) {
				
				throw e;
			}
	}
}
