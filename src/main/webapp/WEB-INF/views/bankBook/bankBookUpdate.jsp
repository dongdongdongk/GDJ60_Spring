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
		
		
		<input type="hidden" name="bookNum" value="${dto.bookNum}"><br>
		<fieldset>
			<legend>상품명</legend>
			<input type="text" name="bookName" value="${dto.bookName}" placeholder="상품명 입력"><br>
		</fieldset>
		<fieldset>
			<legend>삼품설명</legend>
			<textarea name="bookDetail" value="${dto.bookDetail}"></textarea><br>
		</fieldset>
		<fieldset>
			<legend>이자율</legend>
			<input type="number" name="bookRate" value="${dto.bookRate}"><br>
		</fieldset>
		
		<fieldset>
			<legend>판매여부 </legend>
			<label for="bs1">판매</label>
			<input id="bs1" type="radio" ${dto.bookSale eq '1' ? 'checked':''} name="bookSale" value="1">
			
			<label for="bs2">판매중단</label>
			<input id="bs2" type="radio" ${dto.bookSale eq '0' ? 'checked':''} name="bookSale" value="0">
		</fieldset>
		
	<!-- 	<fieldset>
			<legend>판매여부</legend>
			<select>
			
			</select>
		</fieldset> -->
		
		
		<fieldset>
			<input type="submit" value="수정">
		</fieldset>
	</form>
</body>
</html>