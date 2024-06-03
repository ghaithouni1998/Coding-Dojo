<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" /> -->

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
<div class="d-flex justify-content-between">
<h1>Create New <span class="text-danger">Car 🚘🚘🚘🚘🚘</span></h1>
<form:form action="/processCar" methode="post" modelAttribute="car">
	
	
	<form:label path="model" class="form-label">Model</form:label>
	<form:input path="model" class="form-control"></form:input>
	<form:errors path="model" class="text-warning"></form:errors>
	<br>
	<form:label path="color" class="form-label">Color</form:label>
	<form:input path="color" class="form-control"></form:input>
	<form:errors path="color" class="text-warning"></form:errors>
	<br>
	<form:label path="price" class="form-label">PRICE</form:label>
	<form:input path="price" type="number" step="0.001" class="form-control"></form:input>
	<form:errors path="price" class="text-warning"></form:errors>
	<br>
	<form:label path="releaseDate" class="form-label">Realease Date</form:label>
	<form:input path="releaseDate" type="date" class="form-control"></form:input>
	<form:errors path="releaseDate" class="text-warning"></form:errors>
	<br>
	<div>
	<a class="d-flex justify-content-between" href="/cars">cancel</a>
	<input type="submit" value="Create" class="btn btn-sucess">
	</div>
	
</form:form>
</div>
</body>
</html>