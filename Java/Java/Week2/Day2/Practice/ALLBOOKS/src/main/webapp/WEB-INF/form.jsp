<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>
	<h1>Create a Book 📚</h1>
	<form:form action="/books/processBook" method="post" modelAttribute="book">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" />
		</p>
		<p>
			<form:label path="language">Language</form:label>
			<form:errors path="language" />
			<form:input path="language" />
		</p>
		<p>
			<form:label path="numberOfPages">Pages</form:label>
			<form:errors path="numberOfPages" />
			<form:input type="number" path="numberOfPages" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
