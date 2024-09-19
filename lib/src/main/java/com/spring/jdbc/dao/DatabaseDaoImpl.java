package com.spring.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseDaoImpl implements DatabaseDao {
	Connection con;
	public Connection getDatabaseConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc","root","Shiva@12345");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
