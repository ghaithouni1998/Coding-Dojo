<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>ALL BOOKS</h1>
	<table class="table">
		<thead>
			<tr>
			<th></th> ID </th>
				<th>Title</th>
				<th>Language</th>
				
				<th>Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allBooks }" var="oneBook">
				<tr>
				<td>${oneBook.id } </td>
					<td><a href='/books/${oneBook.id }'> ${oneBook.title}</a></td>
					<td>${oneBook.language}</td>
					
					<td>${oneBook.numberOfPages}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>
</body>
</html>
