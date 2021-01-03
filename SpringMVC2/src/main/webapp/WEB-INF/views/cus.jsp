<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="savecus" method="post">
		Id: <input type=text name="id" /> <br />
		Name: <input type=text	name="name" /> <br />
		Address: <input type=text name="address" /> <br/>
		 <input type=submit value="Add Cus" />
	</form>
	
	<table border=3>
		<tr><th>Id</th><th>Name</th><th>Address</th></tr>
		<c:forEach items="${clist}" var="c">
				<tr>
					<th>${c.id}</th>
					<td>${c.name}</td>
					<td>${c.address}</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>