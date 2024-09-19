package com.spring.jdbc.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.spring.jdbc.bean.ProductDetails;
import com.spring.jdbc.dao.DatabaseDao;
import com.spring.jdbc.dao.DatabaseDaoImpl;

public class InsertionServiceImpl implements InsertionService {
	boolean status;

	@Override
	public boolean insertProduct(ProductDetails proObj) {
		try {
			DatabaseDao dao = new DatabaseDaoImpl();
			Connection con = dao.getDatabaseConnection();
			PreparedStatement ps = con.prepareStatement("insert into product_details values(?,?,?,?,?)");
			ps.setInt(1, proObj.getSerialno());
			ps.setString(2, proObj.getName());
			ps.setString(3, proObj.getCategory());
			ps.setFloat(4, proObj.getPrice());
			ps.setFloat(5, proObj.getDiscount());
			int row = ps.executeUpdate();
			if (row > 0) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
