<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
<title>Login</title>
</head>
<body>
<spring-form:form method="POST" action="loged-user" commandName="user" class="box login">

<spring-form:label path="login">Login</spring-form:label>
<spring-form:input path="login"/>

<spring-form:label path="password">Password</spring-form:label>
<spring-form:input path="password"/>

<input type="submit" value="login" class="btnLogin">

</spring-form:form>

<a href="<c:url value='/view-instr' />">Show instruction</a>
<br>
<a href="<c:url value='/view-company' />">Show companies</a>
<br>
<a href="<c:url value='/view-shop' />">Show shops</a>
<br>
<a href="<c:url value='/view-user-profile' />">Show user profiles</a>
<br>
<a href="<c:url value='/view-instr-type' />">Show instruction's types</a>
<br>
<a href="<c:url value='/view-setings' />">Show settings</a>
</body>
</html>
