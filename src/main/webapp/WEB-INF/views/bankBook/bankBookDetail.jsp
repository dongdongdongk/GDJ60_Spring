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
				<form action="">
						<button type="submit" class="btn btn-danger" value="./delete?bookNum=${dto.bookNum}">상품삭제</button>
				</c:if>
				<c:if test="${empty dto }">
					<h3>존재하지 않는 상품입니다.</h3>
				</c:if>
				<button type="submit" class="btn btn-warning" value="./update?bookNum=${dto.bookNum}">상품수정</button>
				<button type="submit" class="btn btn-primary" value="./list">목록으로</button>
				</form>
			</div>
			<c:import url="../template/common_js.jsp"></c:import>
		</body>
		</div>

		</html>