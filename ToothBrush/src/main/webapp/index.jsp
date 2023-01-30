<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>details of favorite person</h1>
<form action="paste" method="post">
<pre>
FirstName<input type="text" name="firstName">
LastName<input type="text" name="lastName">
Gender Female <input type="radio" name="gender" value="female">
       Male <input type="radio" name="gender" value="male">
      Others <input type="radio" name="gender" value="others">
Reason<input type="text" name="reason">
Address<input type="text" name="address"> 
</pre>
<input type="submit" name="send">
</form>
</body>
</html>