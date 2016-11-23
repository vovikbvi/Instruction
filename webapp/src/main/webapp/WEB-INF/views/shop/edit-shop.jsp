<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="shop.edit_shop" /></title>
</head>
<body>
	<h1>
		<spring:message code="shop.edit_shop" />
	</h1>
	<spring-form:form method="POST" modelAttribute="shop">
		<table>
			<tr>
				<td><spring:message code="id" /></td>
				<td><spring-form:input path="id" id="id" /></td>
			</tr>
			<tr>
				<td><spring:message code="name" /></td>
				<td><spring-form:input path="name" id="name" /></td>
			</tr>
			<tr>
				<td><spring:message code="shop.company" /></td>
				<td><spring-form:select path="company.id">
					<spring-form:options items="${companies}" itemValue="id" itemLabel="name"/>				
				</spring-form:select>
				
			</tr>
		</table>
		<input type="submit" value="save" />

	</spring-form:form>

</body>
</html>