
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="">
    <title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
    <div class="d-flex justify-content-between">
     <div class="d-flex 	flex-column">
  	<a href="/logout">logout</a>
  
   </div>
    <h1>All cars:  🛻🚓🚓🚓🚓</h1>

        <a href="/cars/new" class="btn btn-info">Create car</a>
    </div>
    <h1>${user.userName } </h1>
<div class="d-flex justify-content-between">

    <table class="table">
    
        <thead>
        <tr>
            <th>Model</th>
            <th>Color</th>
            <th>Price</th>
            <th>Posted By</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allCars}" var="car" >
            <tr>
                <td><a href="cars/show/${car.id}">${car.model}</a></td>
                <td>${car.color}</td>
                <td>${car.price}</td>
                <td>${car.poster.userName}</td>
                <td>
                    <div class="d-flex">
                        <div>
                            <a href="/cars/edit/${car.id}" class="btn btn-primary">edit</a>
                        </div>
                        <form action="/cars/delete/${car.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input class="btn btn-danger" type="submit" value="delete">
                        </form>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</div>
</body>
</html>