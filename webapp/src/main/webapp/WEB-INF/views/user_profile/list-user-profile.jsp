<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<c:url value="/resources/css/tables.css" />" rel="stylesheet">
<title><spring:message code="userprofile.list-user-profile" /></title>
</head>
<body>
	<h2><spring:message code="userprofile.list-user-profile" /></h2>
	<table class="table-list-record">
		<tr>
			<th><spring:message code="id" /></th>
			<th><spring:message code="userprofile.login" /></th>
			<th><spring:message code="userprofile.password" /></th>
			<th><spring:message code="userprofile.first-name" /></th>
			<th><spring:message code="userprofile.last-name" /></th>
			<th><spring:message code="userprofile.email" /></th>
			<th><spring:message code="userprofile.shop" /></th>
			<th><spring:message code="userprofile.role" /></th>
			<th><spring:message code="action" /></th>
		</tr>
		<c:forEach items="${userProfiles}" var="userProfiles">
			<tr>
				<td>${userProfiles.id}</td>
				<td>${userProfiles.login}</td>
				<td>${userProfiles.password}</td>
				<td>${userProfiles.firstName}</td>
				<td>${userProfiles.lastName}</td>
				<td>${userProfiles.email}</td>
				<td>${userProfiles.shop.name}</td>
				<td>${userProfiles.role}</td>
				<td><a href="<c:url value='/edit-user-profile-${userProfiles.id}' />"><spring:message code="edit" /></a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>