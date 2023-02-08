<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품수정 Page</h1>
	
	<form action= "./update" method="post">
	
		상품명
		<input type="text" name="bookName" value="${dto.bookName}" placeholder="상품명 입력"><br>
		삼품설명
		<textarea name="bookDetail" value="${dto.bookDetail}"></textarea><br>
		이자율
		<input type="number" name="bookRate" value="${dto.bookRate}"><br>
		판매여부
		<input type="number" name="bookSale" value="${dto.bookSale}">
		
		<input type="submit" value="수정">
	
	</form>
</body>
</html>