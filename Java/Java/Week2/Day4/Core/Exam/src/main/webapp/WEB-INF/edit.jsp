<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="container">
   <div class="d-flex justify-content-between">
   <div>
   <h1>Edit celebrity page</h1>
   
   </div>
   <div class="d-flex 	flex-column">
  	
  	<a href="/home"> Home</a>
   </div>
   </div>
    <form:form action="/updateCelebrites/${celebrity.id}" method="post" modelAttribute="celebrity">
    <input type="hidden" name="_method" value="put">
  
			<form:label path="name" class="form-label">Name</form:label>
					<form:input path="name" class="form-control"></form:input>
					<form:errors path="name" class="text-warning"></form:errors>
					<br>
					<form:label path="details" class="form-label">Details</form:label>
					<form:input path="details" class="form-control"></form:input>
					<form:errors path="details" class="text-warning"></form:errors>
					
			
				<div class="d-grid gap-2">
  	<input class="btn btn-primary" type="submit" value="submit">
   </div>
				
			</form:form>
			 <form action="/celebrites/delete/${celebrity.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input class="btn btn-primary" type="submit" value="delete">
                        </form>
   
   
   </div>
</body>
</html>