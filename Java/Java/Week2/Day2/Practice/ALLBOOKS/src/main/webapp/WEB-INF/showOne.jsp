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
    <h1> ${book.title }</h1>
    <p> DESCRIPTION :${book.description }</p>
    <p> LANGUAGE : ${book.language }</p>
    <p> NUMBER OF PAGES : ${book.numberOfPages }</p>
</body>
</html>
