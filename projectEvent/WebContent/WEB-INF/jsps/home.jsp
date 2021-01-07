<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home!!!</title>
<style type="text/css">
p{
	padding:16px;
}
*{
            
            font-family: 'Handlee', cursive;
        }
        header{
            margin: 0;
          padding: 0;
          padding: 14px 16px;
       width: 100%;
  height: 1rem; 
        }
        .nav-item{
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
        }
        
        .nav-item{
          float: left;
        }
        
        li a {
          display: block;
          color: white;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
          width: 100%;
  height: 1rem; 
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
<h1>Welcome to Classy Events</h1>
<header>
<ul class="nav-items">
			<li class="nav-item"><a href="home">Home</a></li>
			<li class="nav-item"><a href="functionalhall">Function Halls</a></li>
			<li class="nav-item"><a href="help">Help</a></li>
			<c:if test="${sessionScope.user!=null}"><li class="nav-item"><a href="logout">Signout</a></li></c:if>
			<c:if test="${sessionScope.user==null}"><li class="nav-item"><a href="loginsigup">Login</a></li></c:if>
		</ul>
	</header>
<p>We are one of the best event planners.We offers wide range of events</p>
 <ol type="I">
        <li>Marraige</li>
        <ol type="1">
            <li>Bridal Party</li>
            <li>Engagement Parties</li>
            <li>Caterer</li>
            <li>Wedding Cermony</li>
            <li>Wedding Reception</li>
        </ol>
        <li>Corporate</li>
        <ol type="1">
            <li>Seminars and Conferences</li>
            <li>Appreciation Events</li>
            <li>Team Building Events</li>
            <li>Product Launch Events</li>
            <li>Shareholder Meetings</li>
        </ol>
        <li>Exhibition</li>
        <ol type="1">
            <li>Aereophilately</li>
            <li>Astrophilately</li>
            <li>Fight Against forgeries</li>
            <li>Maximaphily</li>
            <li>Philataluc Literature</li>
        </ol>
    </ol>
    <footer>All Rights Reserved to Classy Events</footer> 
</body>
</html>