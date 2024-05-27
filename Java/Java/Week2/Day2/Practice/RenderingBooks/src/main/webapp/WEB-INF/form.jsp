<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <h1> Create a Book 📚</h1>
    <form action="/books/processBook" method="POST">
    Title: <input name="title"> <br>
    Language: <input name="language"> <br>
    Description: <input name="description"> <br>
    # of pages: <input name="numOfPages"> <br>
    <button>Create</button>
    </form>
</body>
</html>
