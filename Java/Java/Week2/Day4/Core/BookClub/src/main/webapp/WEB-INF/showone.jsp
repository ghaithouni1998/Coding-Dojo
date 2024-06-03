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
   <h1>${book.title }</h1>
   
   </div>
   <div class="d-flex 	flex-column">
  	
  	<a href="/books"> Back to the shelves</a>
   </div>
   </div>
   
 <c:if test="${book.poster.id !=user_id}">
   <h2>  <div > <span class="text-danger">${book.poster.userName }</span></div>   read ${book.title } by <span class="text-danger"> ${book.author }</span> </h2>
   <h4>Here are ${book.poster.userName }'s thoughts: </h4>
   </c:if>
    <c:if test="${book.poster.id ==user_id}">
    <h2>  <div > <span class="text-danger">You</span></div>   read ${book.title } by <span class="text-danger"> ${book.author } </span></h2>
   <h4>Here are your thoughts: </h4>
   </c:if>
   <hr>
   
   <p>${book.thoughts }</p>
   <hr>
   <c:if test="${book.poster.id ==user_id }">
   <a href="/books/${book.id }/edit" class="btn btn-info"> Edit</a>
    <form action="/books/delete/${book.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input class="btn btn-danger" type="submit" value="delete">
                        </form>
					
   </c:if>
   </div>
   
</body>
</html>
