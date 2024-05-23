<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <script src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
</head>
<body>
<h1>Customer Name : ${name}</h1>
<h3>Item name : ${itemName}</h3>
<h3>Price: $${price}</h3>
<h3>Description: ${description}</h3>
<h3>Vendor: ${vendor}</h3>
 
</body>
</html>