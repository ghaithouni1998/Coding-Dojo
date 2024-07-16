<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login and Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
<style>
body {
	padding: 20px;
}
</style>
</head>
<body>

	<h1>Lyrics Lab</h1>

	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<form:form action="/register" method="post" modelAttribute="newUser"
					class="form-outline">
					<h2>Register</h2>
					<div class="mb-3">
						<form:errors path="username" class="text-danger" />
						<form:input class="form-control" path="username"
							placeholder="Name" />
					</div>
					<div class="mb-3">
						<form:errors path="email" class="text-danger" />
						<form:input class="form-control" path="email" placeholder="Email" />
					</div>
					<div class="mb-3">
						<form:errors path="password" class="text-danger" />
						<form:input class="form-control" path="password"
							placeholder="Password" />
					</div>
					<div class="mb-3">
						<form:errors path="confirm" class="text-danger" />
						<form:input class="form-control" path="confirm"
							placeholder="Confirm Password" />
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
				</form:form>
			</div>
			<div class="col-md-6">
				<form:form action="/login" method="post" modelAttribute="newLogin">
					<h2>Log In</h2>
					<div class="mb-3">
						<form:errors path="email" class="text-danger" />
						<form:input class="form-control" path="email" placeholder="Email" />
					</div>
					<div class="mb-3">
						<form:errors path="password" class="text-danger" />
						<form:input class="form-control" path="password"
							placeholder="Password" />
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>
