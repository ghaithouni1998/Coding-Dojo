




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="${encoding}">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
<h1>${book.title }</h1>

			
			

				<a href="/books"> Back to the shelves</a>
				<h1>Add a Book to Your Shelf !!</h1>

				<form:form action="/processBook" methode="post"
					modelAttribute="book">

					<form:label path="title" class="form-label">Title</form:label>
					<form:input path="title" class="form-control"></form:input>
					<form:errors path="title" class="text-warning"></form:errors>
					<br>
					<form:label path="author" class="form-label">Author</form:label>
					<form:input path="author" class="form-control"></form:input>
					<form:errors path="author" class="text-warning"></form:errors>
					<br>
					<form:label path="thoughts" class="form-label">My thoughts</form:label>
					<form:input path="thoughts" class="form-control"></form:input>
					<form:errors path="thoughts" class="text-warning"></form:errors>

					<div>

						<input type="submit" value="Submit" class="btn btn-danger">
					</div>

				</form:form>
</div>
</body>
</html>
