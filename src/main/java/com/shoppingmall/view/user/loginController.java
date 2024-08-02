package com.shoppingmall.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member/*")
public class loginController {
// 로그인 컨트롤러
	
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("memberjoin")
	public String mamberJoin() {
		return "member/memberJoin";
	}
}