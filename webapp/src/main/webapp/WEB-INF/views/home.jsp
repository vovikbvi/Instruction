<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="login-form"%>
<html>
<head>
	<title>Login</title>
</head>
<body>
<login-form:form method="POST" action="loged-user" commandName="user">

<login-form:label path="name">Login</login-form:label>
<login-form:input path="name"/>

<login-form:label path="password">Password</login-form:label>
<login-form:input path="password"/>

<input type="submit" value="login">

</login-form:form>

</body>
</html>
