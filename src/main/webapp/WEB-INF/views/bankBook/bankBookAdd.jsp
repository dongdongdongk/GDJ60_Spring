<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품 등록 Page</h3>
	<form action="./add" method="post">
	
		상품명
		<input type="text" name="bookName" value="" placeholder="상품명 입력"><br>
		삼품설명
		<textarea name="bookDetail" value=""></textarea><br>
		이자율
		<input type="number" name="bookRate" value=""><br>
		판매여부
		<input type="number" name="bookSale" value="">
		
		<input type="submit" value="등록">
		
		<!--  <button>등록</button>-->
		
	
	
	</form>
</body>
</html>