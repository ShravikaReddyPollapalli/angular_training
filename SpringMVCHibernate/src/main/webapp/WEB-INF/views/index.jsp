<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<form action="saveCustomer" method="post">
		Id: <input type=text name="id" /> <br />
		Name: <input type=text name="name" /> <br />
		<input type=submit value=click>
	</form>
	<table border=2>
		<tr>
			<th>id</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${c}" var="ct">
		<tr>
			<td>${ct.id}</td>
			<td>${ct.name}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>