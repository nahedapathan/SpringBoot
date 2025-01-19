<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
<style type="text/css">

       body{
         background-color:palevioletred;
       }
</style>
</head>
<body>
         <form action="emp" method="post">
			Id : <input type="number" name="id"><br/><br/>
			Name : <input type="text" name="name"><br/><br/>
			Salary : <input type="number" name="salary"><br/><br/>
			Address : <input type="text" name="address"><br/><br/>
			<input type="submit" value="register">
			
		 </form>
		 
		 ${emp}
</body>
</html>