<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvcform" %>
<html>
<head>
<title>Register page</title>
</head>
<body>

	Welcome to Register page

	<mvcform:form method="post" modelAttribute="registerUser">
		UserName <mvcform:input type="text" path="uname"/><br>
		Password <mvcform:password path="pwd"/><br>
		Email <mvcform:input path="email"/><br>
		City <mvcform:input path="city"/><br>
		<button>Register</button>
	</mvcform:form>
</body>
</html>