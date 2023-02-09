<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList</title>
</head>
<body>
	<hr>
	
	<div class="col-6">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>id</th>
				<th>pw</th>
				<th>phone</th>
				<th>email</th>
			</tr>
		</thead>
		
		<tbody>
		
			<c:forEach items="${list}" var="mls"> <!-- dto는 page영역에 담김 -->
				<tr>
					<td>${mls.id}></td>
					<td>${mls.pw}</td>
					<td>${mls.phone}</td>
					<td>${mls.email}</td>
					
				</tr>
			</c:forEach>
	
		</tbody>
	</table>
	
		<a class="btn btn-danger" href="./memberList">MemberList</a>
	</div>
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>