<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<html>
<body>
	<%@ include file="header.jsp"%>


	<spring:form action="getCategory" method="POST"
		modelAttribute="category">
		<table align="center">
			<tr>
				<td><spring:label path="id">CategoryId:</spring:label> <spring:input
						path="id" /> <br></td>
			</tr>
			<tr>
				<td><spring:label path="cname">CategoryName:</spring:label> <spring:input
						path="cname" /> <br></td>
			</tr>
			<tr>
				<td><spring:label path="cdesc">CategoryDescription:</spring:label>
					<spring:input path="cdesc" /> <br></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
	</spring:form>
	<pre>
<table align="center">
<tr>
				<td>${category.id }</td>
			</tr>
<tr>
				<td>${category.cname}</td>
			</tr>
<tr>
				<td>${category.cdesc}</td>
			</tr>
</table>
</pre>


</body>
</html>
