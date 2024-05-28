<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>

<h1>Update a burger</h1>
	<!-- 		Update a Book Form -->
	 <form:form action="/burger/${burger.id }" method="post" modelAttribute="burger">
            <form:errors path="*" />
            <p>
                <form:label path="name">Burger Name:</form:label>
                <input type="hidden" name="_method" value="put">
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
</body>
</html>
