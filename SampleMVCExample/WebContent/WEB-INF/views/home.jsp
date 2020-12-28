<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to home page jsp</h1>
<a href="./display">Display Details</a>
<table border="1">
<c:forEach items="${pro}" var="p">
<tr>
<td><c:out value="${p.id }"/></td>
<td><c:out value="${p.name }"/></td>
<td><c:out value="${p.reason}"/></td>
</c:forEach>
</table>
</body>
</html>