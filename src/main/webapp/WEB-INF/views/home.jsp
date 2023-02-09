<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/main.css">
</head>
<body>
<h1>
	Hello world!  
</h1>

<a class="test" href="/product/list">ProductList </a>
<a class="test" href="/member/memberJoin">MemberJoin</a>
<a class="test" href="/member/memberList">MemberList</a>
<a class="test" href="/bankBook/list">BankBookList</a>
<a class="test" href="./bankBook/list">BankBookList</a>

<img alt="시바" src="/resources/images/test1.jpg">
<img alt="빵시바" src="./resources/images/test2.jpg">
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
