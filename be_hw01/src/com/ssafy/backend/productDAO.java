package com.ssafy.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ssafy.util.DBUtil;

public class productDAO {
	private final DBUtil dbUtil = DBUtil.getInstance();
	private static productDAO dao = new productDAO();
	
	private productDAO() {
		
	}
	
	public static productDAO getDAO() {
		return dao;
	}
	
	//DB연결해주는 부분 할거임
	public boolean insert(productVO product) throws SQLException {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			conn = dbUtil.getConnection();
			StringBuilder registerArticle = new StringBuilder();
			registerArticle.append("insert into products (productName, productPrice, productInfo) \n");
			registerArticle.append("values (?, ?, ?)");
			pstmt = conn.prepareStatement(registerArticle.toString());
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getProductPrice());
			pstmt.setString(3, product.getProductInfo());
			cnt = pstmt.executeUpdate();
			if(cnt==1) {
				return true;
			}
		} finally {
			dbUtil.close(pstmt, conn);
		}
		return flag;
	}
	
}
