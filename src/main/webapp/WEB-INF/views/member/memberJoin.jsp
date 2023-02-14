<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<h1>MemeberJoin</h1>
	<div class="col-6">
		<form action="./memberJoin" method="post">
			
			<!--<input type="text" name="ID" ><br>-->
            <div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">id</label>
				<input type="text" class="form-control" id="id" placeholder="아이디" name="ID">
			</div>
			
			
			<!--input type="password" name="password" ><br>-->

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">pw</label>
				<input type="password" class="form-control" id="password" placeholder="패스워드" name="password">
			</div>
			
			<!--<input type= "text" name="name" ><br>-->

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">name</label>
				<input type="text" class="form-control" id="name" placeholder="이름" name="name">
			</div>
			
			
			<!--<input type="tel" name="tel" ><br>-->
			
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">phone</label>
				<input type="tel" class="form-control" id="tel" placeholder="번호" name="tel">
			</div>

			
			<!--<input type="email" name="email" ><br>-->
			
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">email</label>
				<input type="email" class="form-control" id="email" placeholder="이메일" name="email">
			</div>
			
			<button type="submit">등록</button>
		</form>
		
	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>