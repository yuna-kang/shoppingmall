package com.shoppingmall.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4jAdvice;
import com.springbook.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	//private BoardDAOSpring boardDAO;
	
	public BoardServiceImpl() {
		
	}

	@Override
	public void insertBoard(BoardVO vo) {
		
		boardDAO.insertBoard(vo);
	}



	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		
		return boardDAO.getBoardList(vo);
	}

}




=======
import com.shoppingmall.biz.board.BoardService;
import com.shoppingmall.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	// boardDAO를 의존 주입해야 한다.
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
		// @Autowired를 했기 때문에 사용가능, @Autowired로 객체를 생성한거다.
		boardDAO.insertBoard(vo);

	}

	@Override
	public BoardVO getBoard(BoardVO vo) {

		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {

		return boardDAO.getBoardList(vo);
	}

}
>>>>>>> branch 'master' of https://github.com/yuna-kang/shoppingmall.git
