<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Halls</title>
<style type="text/css">
table{
	margin: 50px;
          padding: 16px;
}
*{
            
            font-family: 'Handlee', cursive;
        }
        ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
        }
        
        li {
          float: left;
        }
        
        li a {
          display: block;
          color: white;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
        }
        
        li a:hover:not(.active) {
          background-color: #111;
        }
        
        .active {
          background-color: #904caf;
        }
        h1{
            color:brown;
            text-align: center;
        }
        footer{
        color: white;
            margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
            text-align: center;
          padding: 14px 16px;
            display: block;
            position: absolute;
  bottom: 0;
  width: 100%;
  height: 1rem; 
          
        }
        #img{
            display: block;
    margin-left: auto;
    margin-right: auto
        }
</style>
</head>
<body>
<h1>Welcome to classy Events!!!</h1>
<ul class="nav-items">
			<li class="nav-item"><a href="home">Home</a></li>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="functionalhall">Function Halls</a></li></c:if>
			<li class="nav-item"><a href="help">Help</a></li>
			<c:if test="${sessionScope.userdesi=='manager'}"><li class="nav-tems"><a href="registeredusers">RegisteredUsers</a></li></c:if>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="logout">Signout</a></li></c:if>
			<c:if test="${sessionScope.user==null}"><li class="nav-item"><a href="loginsigup">Login</a></li></c:if>
		</ul>
      <footer>All Rights Reserved to Classy Events</footer>
<table style="border:1px solid black;margin-left:auto;margin-right:auto;">
<tr>
<th>id</th>
<th>image</th>
<th>description</th>
<th>cost</th >
</tr>
<c:forEach items="${hall}" var="h">
<tr>
<td>${h.id }</td>
<td><img alt="image" src="<c:url value="/resources/images/${h.image }"/>" width="50px" height="50px"></td>
<td>${h.description }</td>
<td>${h.cost}</td>
<!-- <td><a href="registerhall">Register</a></td>
<td><a href="edit">Edit</a></td>
<td><a href="delte">Delete</a></td>-->
<c:if test="${sessionScope.userdesi=='customer'}"><td><a href="registerhall">Register</a></td></c:if>
<c:if test="${sessionScope.userdesi=='manager'}"><td><a href="edit">Edit</a></td></c:if>
<c:if test="${sessionScope.userdesi=='manager'}"><td><a href="delte">Delete</a></td></c:if>
</tr>
</c:forEach>
</table>
</body>
</html>