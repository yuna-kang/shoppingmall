package com.shoppingmall.view.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserDAO;
import com.springbook.biz.user.UserVO;
@Controller
public class memberJoinController {
	
	@RequestMapping(value = "/memberJoin.do", method = RequestMethod.GET)
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("../memberJoin.jsp").forward(req, resp);
	}
	 @RequestMapping(value = "/memberJoin.do", method = RequestMethod.POST) 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserVO vo = new UserVO();
		
		vo.setId(req.getParameter("id"));
		vo.setPassword(req.getParameter("password"));
		vo.setName(req.getParameter("name"));
		
		
		
		// 데이터를 받아 DB에 추가
		UserDAO dao = new UserDAO();
		int result = dao.insertUser(vo);
		
		if  (result > 0) {
			resp.sendRedirect("../login.do");
		}else {
			resp.sendRedirect("/memberJoin.do");
		}
	}
	
	
	
}
