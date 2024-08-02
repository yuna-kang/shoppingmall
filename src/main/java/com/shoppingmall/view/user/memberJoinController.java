<<<<<<< HEAD
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
=======
/*
 * package com.shoppingmall.view.user;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.ServletException; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.springbook.biz.user.UserDAO; import
 * com.springbook.biz.user.UserVO;
 * 
 * @WebServlet("/memberJoin.do") public class memberJoinController extends
 * HttpServlet { protected void doGet(HttpServletRequest req,
 * HttpServletResponse resp) throws ServletException, IOException {
 * 
 * req.getRequestDispatcher("/memberJoin.jsp").forward(req, resp); }
 * 
 * protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 * throws ServletException, IOException { System.out.println("dopost"); UserVO
 * vo = new UserVO();
 * 
 * vo.setId(req.getParameter("id"));
 * vo.setPassword(req.getParameter("password"));
 * vo.setName(req.getParameter("name"));
 * 
 * 
 * 
 * // 데이터를 받아 DB에 추가 UserDAO dao = new UserDAO(); int result =
 * dao.insertUser(vo);
 * 
 * if (result > 0) { resp.sendRedirect("../login.do"); }else {
 * resp.sendRedirect("../insertBoard.do"); } }
 * 
 * 
 * 
 * }
 */
>>>>>>> branch 'master' of https://github.com/yuna-kang/shoppingmall.git
