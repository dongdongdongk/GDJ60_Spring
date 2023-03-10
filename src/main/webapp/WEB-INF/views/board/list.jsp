<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container-fluid">
	<div class = "row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>NUM</th>
					<th>TITLE</th>
					<th>WRITER</th>
					<th>DATE</th>
					<th>HIT</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto" varStatus="">
					<tr>
						<td>${dto.num}</td>
						<td>${dto.title}</td>
						<td>${dto.writer}</td>
						<td>${dto.date}</td>
						<td>${dto.hit}</td>
								
					
					</tr>
			
				
				</c:forEach>
			
			</tbody>
		
		</table>
	
	</div>
<!-- paging -->
<div class="row">
	<nav aria-label="Page navigation example">
	  <ul class="pagination">
		  <li class="page-item">
		  <a class="page-link" href="./list?page=1&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
			<span aria-hidden="true">&laquo;</span>
		  </a>
		</li>
	  
	  
		<li class="page-item ${pager.before?'disabled':''}">
		  <a class="page-link" href="./list?page=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
			<span aria-hidden="true">&lsaquo;</span>
		  </a>
		</li>
		
		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		<li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
		</c:forEach>
		
		<li class="page-item ${pager.after eq false ? 'disabled':''}"><%-- ${pager.after eq false ? 'disabled':''} --%>

		  <a class="page-link" href="./list?page=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}"  aria-label="Next">
		  
			<span aria-hidden="true">&rsaquo;</span>
		  </a>
		</li>
		
		<li class="page-item"><%-- ${pager.after eq false ? 'disabled':''} --%>

		  <a class="page-link" href="./list?page=${pager.totalPage}&kind=${pager.kind}&search=${pager.search}"  aria-label="Next">
		  
			<span aria-hidden="true">&raquo;</span>
		  </a>
		</li>
		
	  </ul>
	</nav>
</div>


<!-- ????????? -->
<div class="row">
	<form class="row g-3" action="./list" method="get">
		<div class="col-auto">
		  <label for="kind" class="visually-hidden">Kind</label>
		  <select class="form-select" name="kind" id="kind" aria-label="Default select example">
			<option value="title">?????????</option>
			<option value="contents">????????????</option>
		  </select>
		</div>
		<div class="col-auto">
		  <label for="search" class="visually-hidden">Search</label>
		  <input type="text" class="form-control" name="search" id="search" placeholder="???????????? ???????????????">
		</div>
		<div class="col-auto">
		  <button type="submit" class="btn btn-primary mb-3">??????</button>
		</div>
	</form>


</div>

</div>
<div class="row col-md-7 mx-auto">
<a href="./add" class="btn btn-primary col-2" >????????????</a>
</div>

</div>	
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>


</div>

</body>
</html>