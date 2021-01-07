<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
<h1>Welcome to Classy Events!!!</h1>
	<ul class="nav-items">
			<li class="nav-item"><a href="home">Home</a></li>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="functionalhall">Function Halls</a></li></c:if>
			<li class="nav-item"><a href="aboutus">About us</a></li>
			<li class="nav-item"><a href="help">Help</a></li>
			<c:if test="${sessionScope.userdesi=='manager'}"><li class="nav-tems"><a href="registeredusers">RegisteredUsers</a></li></c:if>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="logout">Signout</a></li></c:if>
			<c:if test="${sessionScope.user==null}"><li class="nav-item"><a href="loginsigup">Login</a></li></c:if>
		</ul>
	<c:choose>
		<c:when test="${sessionScope.user !=null }">
	<div class="container">
		<h1>Hii,Welcome<c:out value='${sessionScope.username}'/></h1>
	</div>
	</c:when>
	</c:choose>
	<img id="img" src="https://pcdn.piiojs.com/i/oaa0g2/vw,720,vh,0,r,0,pr,1,wp,1/https%3A%2F%2Fwww.socialtables.com%2Fwp-content%2Fuploads%2F2019%2F06%2FPlanning-1.png" alt="Event Planning">
      <footer>All Rights Reserved to Classy Events</footer>
</body>
</html>