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
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div>
   <h1>send  an omikuji</h1>
   <form action="/omikuji/show" method="POST">
   	
		number form years : <br />
		<input type="number" name="year" /> 
		<br />
		enter the name of any city : <br />
		<input name="city" /> <br />
		<br />
		enter the name of any  real person : <br />
		<input name="person" /> <br />
		<br />
		enter professional endeavor or hobby   : <br />
		<input name="hobby" /> <br />
		<br />
		
		enter any type of living nice to somenone : <br />
		<input name="living" /> <br />
		<br />
		say something nice to someone : <br />
		<input name="nice" /> <br />
		<br />
		
		
		
		<button>send</button>
	</form>
   </div>
</body>
</html>

