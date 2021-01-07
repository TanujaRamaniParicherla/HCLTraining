<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
a{
align-content: center;
text-decoration: none;
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Classy Events!!!</h1>
<ul class="nav-items">
			<li class="nav-item"><a href="home">Home</a></li>
			
			<li class="nav-item"><a href="aboutus">About us</a></li>
			<li class="nav-item"><a href="help">Help</a></li>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="functionalhall">Function Halls</a></li></c:if>
			<c:if test="${sessionScope.user!=null}"><li class="nav-tems"><a href="registeredusers">RegisteredUsers</a></li></c:if>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="logout">Signout</a></li></c:if>
			<c:if test="${sessionScope.user==null}"><li class="nav-item"><a href="loginsigup">Login</a></li></c:if>
		</ul>

      <footer>All Rights Reserved to Classy Events</footer>
<a href="Register">Click Here for Register</a><br>
<a href="login">Login if you are already registered</a>
</body>
</html>