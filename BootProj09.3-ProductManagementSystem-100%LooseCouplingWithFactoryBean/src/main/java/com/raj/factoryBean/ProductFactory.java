package com.raj.factoryBean;

import javax.sql.DataSource;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.raj.dao.IProductDAO;
import com.raj.dao.MySQLProductImpl;
import com.raj.dao.OracleProductImpl;

@Component("productFactory")
public class ProductFactory implements FactoryBean<IProductDAO>{

	@Value("${dao.id}")
	private String daoId;
	
	@Autowired
	private DataSource ds;
	
	
	@Override
	public @Nullable IProductDAO getObject() throws Exception {
		
		switch(daoId) {
		
		case "mysqlProductDAO":
			return new MySQLProductImpl(ds);
		case "oracleProductDAO":
			return new OracleProductImpl(ds);
		default:
			throw new IllegalArgumentException("Invalid daoId");
		}
		
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		
		return IProductDAO.class;
	}
	
	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
