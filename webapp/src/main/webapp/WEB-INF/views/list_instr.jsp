<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view instructions</title>
</head>
<body>
	<h2>List of instructions</h2>
	<table border="1">
		<tr>
			<th>ID</td>
			<th>name</td>
			<th>type</td>
			<th>owner</td>
			<th>location</td>
			<th>validity</td>
			<th>action</td>
		</tr>
		<c:forEach items="${instructions}" var="instructions">
			<tr>
				<td>${instructions.id}</td>
				<td>${instructions.name}</td>
				<td>${instructions.instrType.name}</td>
				<td>${instructions.ovner.lastName}</td>
				<td>${instructions.location.name}</td>
				<td>${instructions.validity}</td>
				<td><a href="<c:url value='/edit-instr-${instructions.id}' />">${instructions.id}</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>