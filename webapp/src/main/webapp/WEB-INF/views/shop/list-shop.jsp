<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/tables.css" />" rel="stylesheet">
<title>view shop</title>
</head>
<body>
	<h1>List of shop</h1>
	<table class="table-list-record">
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>company</th>
			<th>action</th>
		</tr>
		<c:forEach items="${shops}" var="shops">
			<tr>
               <td>${shops.id}</td>
               <td>${shops.name}</td>
                <td>${shops.company.name}</td> 
               <td><a href="<c:url value='/edit-shop-${shops.id}'/>">edit</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>