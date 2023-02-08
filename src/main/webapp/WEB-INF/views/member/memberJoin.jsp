<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemeberJoin</h1>
	<div class="col-6">
		<form action="./memberJoin" method="post">
			id
			<input type="text" name="ID" ><br>
			pw
			<input type="password" name="password" ><br>
			name
			<input type= "text" name="name" ><br>
			phone
			<input type="tel" name="tel" ><br>
			email
			<input type="email" name="email" ><br>
			
			
			<button type="submit">등록</button>
		</form>
		
	</div>
	
</body>
</html>