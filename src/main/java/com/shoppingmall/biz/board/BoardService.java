package com.shoppingmall.biz.board;

import java.util.List;

import com.springbook.biz.board.BoardVO;

	public interface BoardService {
	
		// 글등록
		void insertBoard(BoardVO vo);
		
		// 글 목록 조회
		List<BoardVO> getBoardList(BoardVO vo);
}
