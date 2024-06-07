<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
<% String str=(String)(request.getAttribute("msg")); %>
<form action="userLogin" method="post" style="margin: 110px 480px">
<%if(str!=null){ %>
<marquee><%=str %></marquee>
<%} %>
<fieldset>
	<legend>Login</legend>
	<table cellspacing='10px'>
		<tr><th><label for="uname">User Name : </label></th><th><input type="text"  placeholder="your username" name="username" id="uname"></th></tr>
	<tr><th><label for="upswrd">User Password : </label></th><th><input type="password" placeholder="your password" name="userpass" id="upswrd"></th></tr>
	<tr><th><input type="submit" value="Login"></th></tr>
	</table>	
</fieldset>
</form>
</body>
</html>
