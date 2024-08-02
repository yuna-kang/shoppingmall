package com.shoppingmall.view.board;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shoppingmall.biz.board.BoardService;
import com.shoppingmall.biz.board.BoardVO;
import com.shoppingmall.biz.user.UserService;
import com.shoppingmall.biz.user.UserVO;

public class BoardController {
	@Controller
	@SessionAttributes("board")  // session 영역에 저장
	public class BoardController {
		
		@Autowired
		private BoardService boardService;
		private UserService userService;
		// @RequestMapping 메소드가 실행 되기전에 실행된다.
		// @ModelAttribute 메소드의 실행 결과로 리턴되어지는 객체는 자동으로 Model에 저장된다.
		// @ModelAttribute 메소드의 실행를  View페이지에서 사용 할 수 있다.
			
		// 글 삽입
		@RequestMapping(value="/insertBoard.do")
		public String insertBoard(BoardVO vo/* , BoardDAO boardDAO */) throws IllegalStateException, IOException {    // BoardVO vo -> command객체(spring container가 관리)
			//boardDAO.insertBoard(vo);
			
			
			boardService.insertBoard(vo);
			return "redirect:getBoardList.do";
		}

		// 글 목록 검색
		
		@RequestMapping("/getBoardList.do")
		public String getBoardList(BoardVO vo/* , BoardDAO boardDAO */, Model model/*ModelAndView mav*/) {
			
			
			model.addAttribute("boardList", boardService.getBoardList(vo));
			return "getBoardList.jsp"; 
			
		}
		
		@RequestMapping(value="/memberJoin.do")
		public String insertUser(UserVO vo)  throws IllegalStateException, IOException {
			 
			userService.insertUser(vo);
			return "login.jsp"; 
			
		}
		
	}
	
}
