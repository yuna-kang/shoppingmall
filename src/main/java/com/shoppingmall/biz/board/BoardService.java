package com.shoppingmall.biz.board;

import java.util.List;

import com.shoppingmall.biz.board.BoardVO;

	public interface BoardService {
	
		// 점수 등록
		void insertBoard(BoardVO vo);
		
		// 점수  조회
		List<BoardVO> getBoardList(BoardVO vo);
}
