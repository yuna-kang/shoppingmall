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
