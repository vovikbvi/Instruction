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
	<table>
		<tr>
			<td>ID</td>
			<td>name</td>
			<td>type</td>
			<td>owner</td>
			<td>location</td>
		</tr>
		<c:forEach items="${instructions}" var="instructions">
			<tr>
				<td>${instructions.id}</td>
				<td>${instructions.name}</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>