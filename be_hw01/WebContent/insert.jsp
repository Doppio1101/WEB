<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>

	<h1>상품을 등록 해 주세요.</h1>
	<form action="/back_end_hw_1_2/backendHW" method="get">
		<div>상  품  명: <input type="text" name="productName"> </div>
		<div>상품 가격: <input type="text" name="productPrice"> </div>
		<div>상품 설명: <input type="text" name="productInfo"> </div>
		<div><input type="submit" value="저장"> 
		<input type="reset" value="취소"> 
		</div>
	</form>

</body>
</html>