
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
    <h1>update ${car.model}</h1>
    <form:form action="/updateCar/${car.id}" method="post" modelAttribute="car">
    <input type="hidden" name="_method" value="put">
    <form:label cssClass="form-label" path="model">Model</form:label>
        <form:input class="form-control" path="model"/>
        <form:errors path="model"/>
    <br>
    <form:label cssClass="form-label" path="color">color</form:label>
        <form:input class="form-control" path="color"/>
        <form:errors path="color"/>
    <br>
    <form:label cssClass="form-label" path="price">price</form:label>
        <form:input cssClass="form-control"  type="number" step="0.001" path="price"/>
        <form:errors path="price"/>
    <br>
    <form:label cssClass="form-label" path="releaseDate">realese date</form:label>
        <form:input cssClass="form-control" type="Date" path="releaseDate"/>
        <form:errors path="releaseDate"/>

    <div class="d-flex justify-content-between">
        <a class="btn btn-danger" href="/cars">Cancel</a>
        <input type="submit" value="update" class="btn btn-success">
        </form:form>
</div>
</body>
</html>