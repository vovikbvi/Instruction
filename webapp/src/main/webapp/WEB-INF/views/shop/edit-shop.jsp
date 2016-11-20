<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit shop</title>
</head>
<body>
	<h1>Edit shop</h1>
	<spring:form method="POST" modelAttribute="shop">
		<table>
			<tr>
				<td>id</td>
				<td><spring:input path="id" id="id"></spring:input></td>
			</tr>
			<tr>
				<td>name</td>
				<td><spring:input path="name" id="name" /></td>
			</tr>
			<tr>
				<td>company</td>
				<td><spring:select path="company" id="select_company">
						<spring:options items="${companies}" itemValue="id"	itemLabel="name" />
					</spring:select></td>

			</tr>
		</table>
		<input type="submit" value="save" />

	</spring:form>

</body>
</html>