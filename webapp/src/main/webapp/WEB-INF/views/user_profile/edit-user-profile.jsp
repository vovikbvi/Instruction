<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="userprofile.edit_user-profile" /></title>
</head>
<body>
	<h1><spring:message code="userprofile.edit_user-profile" /></h1>
	<spring-form:form method="POST" modelAttribute="userProfile">
		<table>
			<tr>
				<td><spring:message code="userprofile.login" /></td>
				<td><spring-form:input path="login" id="login" /></td>
			</tr>
			<tr>
				<td><spring:message code="userprofile.password" /></td>
				<td><spring-form:input path="password" id="password" /></td>
			</tr>
			<tr>
				<td><spring:message code="userprofile.first-name" /></td>
				<td><spring-form:input path="firstName" id="first-name" /></td>
			</tr>
			<tr>
				<td><spring:message code="userprofile.last-name" /></td>
				<td><spring-form:input path="lastName" id="last-name" /></td>
			</tr>
			<tr>
				<td><spring:message code="userprofile.email" /></td>
				<td><spring-form:input path="email" id="email" /></td>
			</tr>
			
			
			<tr>
				<td><spring:message code="userprofile.shop" /></td>
				<td><spring-form:select path="shop.id">
						<spring-form:options items="${shops}" itemValue="id" itemLabel="name" />
					</spring-form:select>
				</td>
			</tr>
			<tr>
				<td><spring:message code="userprofile.role" /></td>
				<td><spring-form:select path="role">
						<spring-form:options items="${enumValues}" />
					</spring-form:select>
				</td>
			</tr>
		</table>
		<input type="submit" value="save" />
	</spring-form:form>
</body>
</html>