<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="instr.edit_instr" /></title>
</head>
<body>
	<h1><spring:message code="instr.edit_instr" /></h1>
	<spring-form:form method="POST" modelAttribute="instr">
		<table>
			<tr>
				<td><spring:message code="name" /></td>
				<td><spring-form:input path="name" id="name" /></td>
			</tr>
			<tr>
				<td><spring:message code="instr.type" /></td>
				<td><spring-form:select path="instrType.id">
						<spring-form:options items="${instrTypes}" itemValue="id" itemLabel="name" />
					</spring-form:select>
				</td>
			</tr>
			<tr>
				<td><spring:message code="instr.owner" /></td>
				<td><spring-form:select path="ovner.id">
						<spring-form:options items="${userProfiles}" itemValue="id" itemLabel="firstName" />
					</spring-form:select>
				</td>
			</tr>
			<tr>
				<td><spring:message code="instr.location" /></td>
				<td><spring-form:select path="location.id">
						<spring-form:options items="${shops}" itemValue="id" itemLabel="name" />
					</spring-form:select>
				</td>
			</tr>
			<tr>
				<td><spring:message code="instr.validity" /></td>
				<td><spring-form:input path="validity" id="validity" /></td>
			</tr>
		</table>
		<input type="submit" value="save" />
	</spring-form:form>
</body>
</html>