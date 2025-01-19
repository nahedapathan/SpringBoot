<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Login Here</h2>
	
	
	
	<c:if test="${not empty errorMsg}">
		<h4 style="color:red">${errorMsg}</h4>
	</c:if>
	<form action="loginForm" method="post">
		 
		 Email :<input type="text" name="email"><br/><br>
		 Password :<input type="password" name="password"><br/><br>
		 
		 <input type="submit" value="Login"/>
	 
	 	</form>
		
		<br/><br/>
		If not  registered.......<a href="regPage">Click Here</a>
</body>
</html>