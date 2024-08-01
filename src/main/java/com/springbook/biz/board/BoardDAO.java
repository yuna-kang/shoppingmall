package com.springbook.biz.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.util.JDBCUtil;

@Repository("userDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String BOARD_INSERT = " insert into board(ID,score,content,num) values"
			+" (?,?,?,(select nvl(max(seq),0) + 1 from board)) ";
	
	private final String BOARD_LIST = " select id,content,score from (select * from board order by score desc) where rownum <=20 ; ";
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDB로 insertBoard() 기능 처리");
		try {
			
			conn=JDBCUtil.getConnection();
			stmt=conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setInt(2, vo.getScore());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt,conn);
		}
		
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		
		List<BoardVO> boardList = new ArrayList<>();
		
		try {
			
			conn = JDBCUtil.getConnection();
			if(vo.getSearchCondition().equals("TITLE")) {
				stmt = conn.prepareStatement(BOARD_LIST_T);
			}else if(vo.getSearchCondition().equals("CONTENT")) {
				stmt = conn.prepareStatement(BOARD_LIST_C);
			}
			stmt.setString(1, vo.getSearchKeyword());
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
				boardList.add(board);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
		return boardList;

	}

}
