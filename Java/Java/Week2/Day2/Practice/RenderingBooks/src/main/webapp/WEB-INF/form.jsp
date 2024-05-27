<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
    <h1>Create a Book 📚</h1>
    <form action="/books/processBook" method="POST">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title"><br>

        <label for="language">Language:</label>
        <input type="text" id="language" name="language"><br>

        <label for="description">Description:</label>
        <input type="text" id="description" name="description"><br>

        <label for="numOfPages"># of pages:</label>
        <input type="number" id="numOfPages" name="numOfPages"><br>

        <button type="submit">Create</button>
    </form>
</body>
</html>
