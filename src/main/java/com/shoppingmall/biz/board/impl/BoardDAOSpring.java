package com.shoppingmall.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//SQL명령어
	
	private final String BOARD_INSERT = " insert into board(ID,score,content,num) values"
			+" (?,?,?,(select nvl(max(seq),0) + 1 from board)) ";
	
	
	
	private final String BOARD_LIST = " select id,content,score from (select * from board order by score desc) where rownum <=20 ; ";
	
	// 글 등록
	public void insertBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_INSERT,vo.getId(),vo.getScore(),vo.getContent());
	}
	
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		return jdbcTemplate.query(BOARD_LIST,new BoardRowMapper());
	}
}


















