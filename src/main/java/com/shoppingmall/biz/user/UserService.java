package com.shoppingmall.biz.user;

import com.springbook.biz.user.UserVO;

public interface UserService {
	
	UserVO getUser(UserVO vo);
	
	int insertUser(UserVO vo);
	
}
