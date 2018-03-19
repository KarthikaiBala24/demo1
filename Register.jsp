<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<table align="center">

		<spring:form action="getData" method="POST"
			modelAttribute="userdetails">
			<table align="center">
				<tr>
					<td><spring:label path="username">Username:</spring:label> <spring:input
							path="username" /> <br></td>
				</tr>
				<tr>
					<td><spring:label path="addr">address:</spring:label> <spring:input
							path="addr" /> <br></td>
				</tr>
				<tr>
					<td><spring:label path="emailid">emailid:</spring:label> <spring:input
							path="emailid" /> <br></td>
				</tr>
				<tr>
					<td><spring:label path="id">Userid:</spring:label> <spring:input
							path="id" /> <br></td>
				</tr>
				<tr>
					<td><div class="btn-group-vertical">
    <button type="button" class="btn btn-primary">Register</button>
    </div>
				</tr>

				</spring:form>

			</table>
			<pre>
			
<table align="center">
<tr><td>
 ${userdetails.username}</td></tr>
<tr><td> ${userdetails.addr}</td></tr>
<tr><td>${userdetails.emailid}</td></tr>
<tr><td>${userdetails.id}</td></tr>
</table>
</pre>
</body>
</html>