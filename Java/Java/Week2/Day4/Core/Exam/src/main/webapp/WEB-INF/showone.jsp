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
   <div >
   <div>
   <h1>${Celebrity.name }</h1>
   
   </div>
   <div class="d-flex 	flex-column">
  	
  	<a href="/home"  > Home</a>
   </div>
   </div>
   
   <h1>${celebrity.name }</h1>
 <h1>  Page MANAGER : ${ celebrity.manager.userName }</h1>
 <h1>Contact : ${celebrity.manager.email }</h1>
 <h1> Details : ${ celebrity.details }</h1>
    <div>
    
    <h1>Followers</h1>
    <c:forEach items="${assignedCelebritys}" var="oneuser">
    ${oneuser.userName }
    ${oneuser.email}
    </c:forEach>
    </div>
    
   
   
   <hr>
   <c:if test="${celebrity.manager.id ==user_id }">
   <a href="/celebrites/${celebrity.id }/edit" class="btn btn-info"> Edit</a>
    
					
   </c:if>
   </div>
   
</body>
</html>
