<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
<c:import url="../template/header.jsp"></c:import>
</head>
<body>
	
	<div>
	<h2>상품 등록 Page</h2>
	</div>
	<form action="./add" method="post">
		
		<!--<fieldset>
			<legend>상품명</legend>
			<input class="" type="text" name="bookName" value="" placeholder="상품명 입력"><br>
		</fieldset>-->

		<div class="mb-3">
			<label for="bookName" class="form-label">상품명</label>
			<input type="text" class="form-control" id="bookName" placeholder="상품명" name="bookName">
		  </div>
		
		<!--<fieldset>
			<legend>이자율</legend>
			<input type="number" name="bookRate" value=""><br>
		</fieldset> -->

		<div class="mb-3">
			<label for="bookRate" class="form-label">이자율</label>
			<input type="number" class="form-control" id="bookRate" placeholder="상품명" name="bookRate">
		  </div>
		
		<!--<fieldset>
			<legend>삼품설명</legend>
			<textarea name="bookDetail" value=""></textarea><br>
		</fieldset> -->

		<div class="mb-3">
			<label for="bookDetail" class="form-label">상품설명</label>
			<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="bookDetail"></textarea>
		  </div>
		
		<!--<fieldset>
			<legend>판매여부 </legend>
			<label for="bs1">판매</label>
			<input id="bs1" type="radio" name="bookSale" value="1">
			
			<label for="bs2">판매중단</label>
			<input id="bs2" type="radio" name="bookSale" value="0">
		</fieldset> -->

		<div class="form-check">
			<input class="form-check-input" type="radio" name="bookSale" id="bookSale">
			<label class="form-check-label" for="bookSale" value="1">
			  판매
			</label>
		  </div>
		  <div class="form-check">
			<input class="form-check-input" type="radio" name="bookSale" id="bookSale" checked>
			<label class="form-check-label" for="bookSale" value="0">
			  판매중단
			</label>
		  </div>
		
		
		
		
		<!-- <fieldset>
		<input type="submit" value="등록">
		</fieldset>
		 <button>등록</button>-->

		<button type="submit" class="btn btn-success">등록</button>
		
	
	
	</form>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>