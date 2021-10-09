package com.ssafy.backend;

public class productVO {
	
	private String productName;
	private String productPrice;
	private String productInfo;
	
	public productVO() {
		super();
	}

	public productVO(String productName, String productPrice, String productInfo) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	@Override
	public String toString() {
		return "productVO [productName=" + productName + ", productPrice=" + productPrice + ", productInfo="
				+ productInfo + "]";
	}
	
	
	
}
