<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Song</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

    <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Start a new Song!</h1>
    <form:form action="/songs/new" method="post" modelAttribute="song">
        <div class="form-group">
            <form:label path="title">Title:</form:label>
            <form:errors path="title" class="text-danger"/>
            <form:input style="width:250px;" path="title" class="form-control"/>
        </div>

        <div class="form-group">
            <form:label path="genre">Genre:</form:label>
            <form:errors path="genre" class="text-danger"/>
            <form:input style="width:250px;" path="genre" class="form-control"/>
        </div>

        <div class="form-group">
            <form:label path="lyrics">Add your lyrics:</form:label>
            <form:errors path="lyrics" class="text-danger"/>
            <form:textarea style="width:250px;" rows="3" path="lyrics" class="form-control"></form:textarea>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
    <a href="/songs" class="btn btn-secondary">Cancel</a>
</div>

</body>
</html>
