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
		<fieldset>
			<legend>상품명</legend>
			<input type="text" name="bookName" value="" placeholder="상품명 입력"><br>
		</fieldset>
		
		<fieldset>
			<legend>이자율</legend>
			<input type="number" name="bookRate" value=""><br>
		</fieldset>
		
		<fieldset>
			<legend>삼품설명</legend>
			<textarea name="bookDetail" value=""></textarea><br>
		</fieldset>
		
		<fieldset>
			<legend>판매여부 </legend>
			<label for="bs1">판매</label>
			<input id="bs1" type="radio" name="bookSale" value="1">
			
			<label for="bs2">판매중단</label>
			<input id="bs2" type="radio" name="bookSale" value="0">
		</fieldset>
		
		
		
		
		<fieldset>
		<input type="submit" value="등록">
		</fieldset>
		<!--  <button>등록</button>-->
		
	
	
	</form>
</body>
</html>