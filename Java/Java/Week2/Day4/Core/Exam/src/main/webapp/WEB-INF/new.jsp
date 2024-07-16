




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


			
			

				<a href="/home"> Home</a>
				<h1>New celebrity Page</h1>

				<form:form action="/processCelebrites" methode="post"
					modelAttribute="celebrity">

					<form:label path="name" class="form-label">Name</form:label>
					<form:input path="name" class="form-control"></form:input>
					<form:errors path="name" class="text-warning"></form:errors>
					<br>
					<form:label path="details" class="form-label">Details</form:label>
					<form:input path="details" class="form-control"></form:input>
					<form:errors path="details" class="text-warning"></form:errors>
					

					<div>

				<input type="submit" value="submit" class="btn btn-primary mt-3" />
					</div>

				</form:form>
</div>
</body>
</html>
