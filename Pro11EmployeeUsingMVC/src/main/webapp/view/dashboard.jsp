<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<style type="text/css">

</style>
</head>
<body>
	<% String str=(String)request.getAttribute("uname"); %>
	 <h1>Welcome <%= str %></h1>
</body>
</html>

