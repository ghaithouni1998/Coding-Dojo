<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Burger Store</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h1>Burger Store</h1>
        <!-- Display all Burgers -->
       

        <table class="table">
            <thead>
                <tr>
                    <th>Burger Name</th>
                    <th>Restaurant Name</th>
                    <th>Rating</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${allBurgers}" var="oneBurger">
                    <tr>
                        <td>${oneBurger.name}</td>
                        <td>${oneBurger.restaurant}</td>
                        <td>${oneBurger.rating}</td>
                     
                        <td><a href="/burger/edit/${oneBurger.id }">Edit</a>
							<form action="/burger/${oneBurger.id}" method="post">
								
							</form></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <hr>
        <!-- Create a Burger Form -->
        <form:form action="/burger/processBurger" method="post" modelAttribute="burger">
            <form:errors path="*" />
            <p>
                <form:label path="name">Burger Name:</form:label>
                <form:input path="name" />
            </p>
            <p>
                <form:label path="restaurant">Restaurant:</form:label>
                <form:input path="restaurant" />
            </p>
            <p>
                <form:label path="rating">Rating:</form:label>
                <form:input type="number" path="rating" />
            </p>
            <p>
                <form:label path="notes">Notes:</form:label>
                <form:input path="notes" />
            </p>
            <input type="submit" value="Submit" />
        </form:form>
    </div>
</body>
</html>
