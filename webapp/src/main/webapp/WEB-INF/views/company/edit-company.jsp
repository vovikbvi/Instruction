<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit company</title>
</head>
<body>
	<h1>Edit company</h1>
	<spring:form method="POST" modelAttribute="company">
		<table>
			<tr>
				<td>id</td>
				<td><spring:label path="id" id="id"></spring:label></td>
			</tr>
			<tr>
				<td>name</td>
				<td><spring:input path="name" id="name"/></td>
			</tr>
		</table>
		<input type="submit" value="save"/>
	</spring:form>


</body>
</html>