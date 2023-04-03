package com.example.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
public class UsersDAO {
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";
	
	public Connection open() {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "jwbook", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void addUsers(Users n) throws Exception {
		Connection conn = open();
		
		String sql = "INSERT INTO users(id, pw) VALUES(?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		try(conn; pstmt) {
			pstmt.setString(1,  n.getId());
			pstmt.setString(2,  n.getPw());
			pstmt.executeUpdate();
		}
	}
}
