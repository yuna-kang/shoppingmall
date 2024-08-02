package com.shoppingmall.view.user;

<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
>>>>>>> branch 'master' of https://github.com/yuna-kang/shoppingmall.git
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
@RequestMapping(value="/memberJoin.do")
public class loginController {
	
}
=======
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
>>>>>>> branch 'master' of https://github.com/yuna-kang/shoppingmall.git
