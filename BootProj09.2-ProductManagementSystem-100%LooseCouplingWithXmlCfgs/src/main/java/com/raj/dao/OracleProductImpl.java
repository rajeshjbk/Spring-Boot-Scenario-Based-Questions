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

import com.raj.model.Product;

@Repository("oracleProductDAO")
public class OracleProductImpl implements IProductDAO {

	private static final String INSERT_PRODUCT = "INSERT INTO PRODUCT (PID,PNAME,PRICE,CATEGORY) VALUES (PID_SEQ.NEXTVAL,?,?,?)";
	private static final String SELECT_PRODUCT = "SELECT PID,PNAME,PRICE,CATEGORY FROM PRODUCT";
	private static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET PRICE=? WHERE PID=?";
	private static final String DELETE_PRODUCT = "DELETE PRODUCT WHERE PID=?";

	@Autowired
	private DataSource ds;

	@Override
	public int addProduct(Product prod) throws Exception {

		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(INSERT_PRODUCT);){

			pstmt.setString(1, prod.getPName());
			pstmt.setDouble(2, prod.getPrice());
			pstmt.setString(3, prod.getCategory());

			int count = pstmt.executeUpdate();

			return count;

		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(SELECT_PRODUCT);){

			List<Product> list = null;
			try(ResultSet rs = pstmt.executeQuery();){

				list = new ArrayList<Product>();

				while(rs.next()) {

					Product product = new Product();
					product.setPId(rs.getInt(1));
					product.setPName(rs.getString(2));
					product.setPrice(rs.getDouble(3));
					product.setCategory(rs.getString(4));

					list.add(product);
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
	public int updateProductPrice(int pId, double newPrice) throws Exception {
		
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(UPDATE_PRODUCT);){

			pstmt.setDouble(1, newPrice);
			pstmt.setInt(2, pId);

			int count = pstmt.executeUpdate();

			return count;

		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}
	}

	@Override
	public int deleteProduct(int pId) throws Exception {
		
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(DELETE_PRODUCT);){

			pstmt.setInt(1, pId);

			int count = pstmt.executeUpdate();

			return count;

		}catch (SQLException se) {

			throw se;
			
		}catch (Exception e) {

			throw e;
		}
	}

}
