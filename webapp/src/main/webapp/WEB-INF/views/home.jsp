<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Login</title>
</head>
<body>
<spring-form:form method="POST" action="loged-user" commandName="user">

<spring-form:label path="name">Login</spring-form:label>
<spring-form:input path="name"/>

<spring-form:label path="password">Password</spring-form:label>
<spring-form:input path="password"/>

<input type="submit" value="login">

</spring-form:form>

<a href="<c:url value='/view-instr' />">Show all instruction</a>
<br>
<a href="<c:url value='/view-company' />">Show all company</a>
<br>
<a href="<c:url value='/view-shop' />">Show all shop</a>
</body>
</html>
