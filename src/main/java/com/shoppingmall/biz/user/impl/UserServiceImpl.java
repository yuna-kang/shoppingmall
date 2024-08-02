package com.shoppingmall.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingmall.biz.user.UserService;
import com.shoppingmall.biz.user.UserVO;



@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}

	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

}
