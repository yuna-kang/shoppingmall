package com.shoppingmall.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("*.do") 라고 쓰는 매핑정보가  web.xml에 들어 있다.
// 프론트 컨트롤러의 역할
public class DispatcherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) {
		// request, response를 받아서 필요한 작업 처리
		// getRequestURI() 포트번호를 제외하고 뒤의 값을 반환
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")); // /login.do <- 이렇게 '/' 뒤의 주소를 가지고 온다

		System.out.println(path);

    // .do 뒤에 뭐가 오냐에 따라 판단
		if (path.equals("/login.do")) {
			System.out.println("로그인 처리");
		} else if (path.equals("/logout.do")) {
			System.out.println("로그아웃 처리");
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("글 등록 처리");
		} else if (path.equals("/updataBoard.do")) {
			System.out.println("글 수정 처리");
		} else if (path.equals("/deleteBoard.do")) {
			System.out.println("글 삭제 처리");
		} else if (path.equals("/getBoard.do")) {
			System.out.println("글 상세 조회 처리");
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("글 목록 검색 처리");
		}

	}
}