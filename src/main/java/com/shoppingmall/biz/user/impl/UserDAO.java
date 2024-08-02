package com.shoppingmall.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.shoppingmall.biz.common.JDBCUtil;
import com.shoppingmall.biz.user.UserVO;



@Repository("userDAO")
public class UserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = " select * from users where id=? and password=? ";
	private final String USER_INSERT = " insert into users id=?,password=?,name=? ";
	
	// 사용자 정보 조회
	public UserVO getUser(UserVO vo) {
		
		System.out.println("===> JDB로 insertBoard() 기능 처리");
		UserVO user = null;
		
		try {
			
			conn=JDBCUtil.getConnection();
			stmt=conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt,conn);
		}
		
		return user;
	}
	
	public void insertUser(UserVO vo) {
		System.out.println("===> JDB로 insertUser() 기능 처리");
		
		try {
			
			conn=JDBCUtil.getConnection();
			stmt=conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt,conn);
		}
			
			
			
		
	}

}
