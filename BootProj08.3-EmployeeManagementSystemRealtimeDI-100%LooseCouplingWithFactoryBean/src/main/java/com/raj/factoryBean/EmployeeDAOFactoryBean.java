package com.raj.factoryBean;

import javax.sql.DataSource;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.raj.dao.IEmployeeDAO;
import com.raj.dao.MySQLEmployeeDAOImpl;
import com.raj.dao.OracleEmployeeDAOImpl;

@Component("daoFactory")
public class EmployeeDAOFactoryBean implements FactoryBean<IEmployeeDAO> {

	@Value("${dao.id}")
	private String daoId;
	
	@Autowired
	private DataSource ds;
	
	@Override
	public IEmployeeDAO getObject() throws Exception {

		switch(daoId) {
		
		case "mysqlEmpDAO":
			return new MySQLEmployeeDAOImpl(ds);
			
		case "oracleEmpDAO":
			return new OracleEmployeeDAOImpl(ds);
		
		default:
			throw new IllegalArgumentException("Invalid EID");
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {

		return IEmployeeDAO.class;
	}
	
	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
