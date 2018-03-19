<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<%@ include file="header.jsp"%>



	<spring:form action="getProduct" method="POST" modelAttribute="product">
		<table align="center">
			<tr>

				<td><spring:label path="id">ProductId:</spring:label> <spring:input
						path="id" /><br></td>
			</tr>
			<tr>
				<td><spring:label path="pname">ProductName:</spring:label> <spring:input
						path="pname" /><br></td>
			</tr>
			<tr>

				<td><spring:label path="pdesc">ProductDescription:</spring:label>
					<spring:input path="pdesc" /><br></td>
			</tr>
			<tr>

				<td><input type="submit" value="Submit"></td>


			</tr>
		</table>
	</spring:form>

	<pre>
<table align="center">

<tr>
<td>${product.id }</td>
			</tr>
<tr>
				<td>${product.pname}</td>
			</tr>
<tr>
				<td>${product.pdesc}</td>
			</tr>

</table>
</pre>





</body>
</html>
