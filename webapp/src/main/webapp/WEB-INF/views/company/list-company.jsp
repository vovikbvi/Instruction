<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view company</title>
</head>
<body>
	<h1>List of company</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>action</th>
		</tr>
		<c:forEach items="${companies}" var="companies">
		<tr>
		<td>${companies.id}</td>
		<td>${companies.name}</td>
		<td><a href="<c:url value='/edit-company-${companies.id}' />">edit</a></td>
		</tr>	
		</c:forEach>

	</table>

</body>
</html>