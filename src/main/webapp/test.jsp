<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result">
	<h1>remove test</h1>
	
	<c:forEach begin="0"  end="4" var="i" varStatus="j">
		<div id="p${j.index}" class="items">
			<h3>${i}</h3>
			<button class="dels" data-div-id="p${j.index}">DELETE</button>
		</div>
	</c:forEach>
	<button id="deletAll">DELETEALL</button>	
</div>
	
	<script>
		const deletAll= document.getElementById("deleteAll")
		const result = document.getElementById("deleteAll");
		const dels = document.getElementsByClassName("dels");

		deleteAll.addEventListener("click",function(){
			let items = document.getElementsByClassName('items')

			for(let i=0;i<items.length;i++) {
				items[i].remove();
			}
		})

		for(let i=0;i<dels.length;i++){
			dels[i].addEventListener('click',function(){
				// document.getElementById("p"+i).remove();
				console.log(this.getAattribute('data-div-id'));
				let id = this.getAattribute('data-div-id')
				document.getElementById(id).remove();
			})
		}
	
	</script>
	
</body>
</html>