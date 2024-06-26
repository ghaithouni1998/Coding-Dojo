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
   <div class="h-screen bg-gradient-to-br from-blue-600 to-indigo-600 flex justify-center items-center w-full text-black">
<div class="relative flex w-96 flex-col rounded-xl bg-white bg-clip-border text-gray-700 shadow-md">
  <div class="p-6">
    
    <p class="block font-sans text-base font-light leading-relaxed text-inherit antialiased">
  	<h1> Details</h1>
    <p> Name : ${expense.name }</p>
    <p>Description : ${expense.description }</p>
    <p>Vendor : ${expense.vendor }</p>
    <p>Amount : $${expense.amount }</p>
    
    </p>
  </div>
  <div class="p-6 pt-0">

      <a href="/expenses">Go back</a>
   
  </div>
</div>
</div>

</body>
</html>
