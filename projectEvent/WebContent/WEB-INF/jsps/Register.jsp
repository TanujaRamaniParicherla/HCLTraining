<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
			<li class="nav-item"><a href="functionalhall">Function Halls</a></li>
			<li class="nav-item"><a href="help">Help</a></li>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="logout">Signout</a></li></c:if>
			<c:if test="${sessionScope.user==null}"><li class="nav-item"><a href="loginsigup">Login</a></li></c:if>
		</ul>
      <footer>All Rights Reserved to Classy Events</footer>

<form action="registerprocess" method="post">
Enter Id:<input type="number" name="id1" id="id1"><br>
Enter Name:<input type="text" id="name" name="name" required="required"><br>
Enter password:<input type="password" id="password" name="password" required="required"><br>
Enter Email:<input type="email" id="email" name="email" required="required"><br>
Enter Designation:<select id="designation" name="designation" required="required">
    <option value="manager">Manager</option>
    <option value="customer">customer</option> 
  </select><br>
Enter Address:<textarea id="address" name="address" rows="4" cols="50"></textarea><br>
<button type="submit" onclick="myFunction()">SUBMIT</button><br>
<a href="index">Go to home</a>
</form>
</body>
</html>