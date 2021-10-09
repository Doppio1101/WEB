package com.ssafy.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class backendHW
 */
@WebServlet("/backendHW")
public class backendHW extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private productDAO dao = productDAO.getDAO();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		hw(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		hw(request,response);
	}
	
	
	protected void hw(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("productName");
		String price = request.getParameter("productPrice");
		String Info = request.getParameter("productInfo");
//		System.out.println("name"+name+"price"+price+"Info"+Info);
		
		productVO product = new productVO(name, price, Info);
		
		PrintWriter out = response.getWriter();
		StringBuilder sb = new StringBuilder();
		
		
		
		try {
			if(dao.insert(product)) {
				sb.append("<html> <body>");
				sb.append("<h4>**** 상품 등록 완료 ****</h4>");
				sb.append("<h4>상 품 명 :"+product.getProductName()+"</h4>");
				sb.append("</body> </html>");
			}else {
				sb.append("<html> <body>");
				sb.append("<h2>**** 상품 등록 실패 ****</h2>");
				sb.append("</body> </html>");
			}
			out.print(sb.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
