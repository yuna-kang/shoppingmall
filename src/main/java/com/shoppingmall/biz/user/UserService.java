package com.shoppingmall.biz.user;

import com.shoppingmall.biz.user.UserVO;

public interface UserService {
	UserVO getUser(UserVO vo);
	
	void insertUser(UserVO vo);
}

