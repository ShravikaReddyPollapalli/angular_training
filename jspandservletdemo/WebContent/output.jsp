<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>this is output file</h1>
 <p>Hello,this  is <%=request.getAttribute("name") %></p>
 
 <h2>full name is<%
String fullName= request.getAttribute("name").toString();
 out.println(fullName);
 %>
 
 
 <%= 2 * 2%>
 <%= 6 > 8 %>
 
 <%
 for(int i = 0; i < 10;i++){
 out.println("<p>the value of i = " +i+"</p>");
 }
 %>
 
 <%!
 
 int calLength(String string){
	 return string.length();
 }
 
 %>
 
 <p>the length of the string is <%= calLength("shra") %></p>
</body>
</html>