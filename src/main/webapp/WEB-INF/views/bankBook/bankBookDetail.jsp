<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
			<div class="container-fluid">
				<!--<h1>BankBookDetail</h1>	
	<c:if test="${not empty dto }">
	<h3>Number : ${dto.bookNum}</h3>	
	<h3>Title : ${dto.bookName}</h3>	
	<h3>Detail : ${dto.bookDetail}</h3>
	<h3>Rate : ${dto.bookRate}</h3>
	<h3>Sale : ${dto.bookSale}</h3>
	<a href="./delete?bookNum=${dto.bookNum}">상품삭제</a>
	</c:if>
	<c:if test="${empty dto }">
	<h3>존재하지 않는 상품입니다.</h3>
	</c:if>
	<a href="./update?bookNum=${dto.bookNum}">상품수정</a>
	<a href="./list">목록으로</a>-->

				<h1>BankBookDetail</h1>
				<c:if test="${not empty dto }">
					<ul class="list-group">
						<div class="fs-3">
							<li class="list-group-item">Number : ${dto.bookNum}</li>
							<li class="list-group-item">Title : ${dto.bookName}</li>
							<li class="list-group-item">Detail : ${dto.bookDetail}</li>
							<li class="list-group-item">Rate : ${dto.bookRate}</li>
							<li class="list-group-item">Sale : ${dto.bookSale}</li>
						</div>
					</ul>
					<div class="mt-3 align-middle">
						<a class="btn btn-danger" href="./delete?bookNum=${dto.bookNum}" role="button">샘플삭제</a>
					
				</c:if>
				<c:if test="${empty dto }">
					<h3>존재하지 않는 상품입니다.</h3>
				</c:if>
				<a class="btn btn-warning" href="./update?bookNum=${dto.bookNum}" role="button">상품수정</a>	
				<a class="btn btn-primary" href="./list" role="button">목록으로</a>
				
				
			</div>
			<c:import url="../template/common_js.jsp"></c:import>
		</body>
		</div>

		</html>