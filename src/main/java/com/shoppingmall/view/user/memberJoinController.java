package com.shoppingmall.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoppingmall.biz.user.UserVO;
import com.shoppingmall.biz.user.impl.UserDAO;

@Controller
public class memberJoinController {
	
	@RequestMapping(value="/memberJoin.do")
	public String insertUser(HttpServletRequest req) {
		System.out.println("회원가입 처리");
		
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
//		
		UserDAO userDAO = new UserDAO();
		UserVO vo = new UserVO();
//		
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		
		userDAO.insertUser(vo);
		
		return "/login.do";
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
		//mav.setViewName("getBoardList.do");
		
		
		
		//return "getBoardList.do";
	}
	
	
	
}
