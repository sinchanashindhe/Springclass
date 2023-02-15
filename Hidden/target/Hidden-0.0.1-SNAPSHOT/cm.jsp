<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>com.Xworkz</title>
</head>
<body>
  </a> <a href="index.jsp">Home</a>
<div>
  </nav>
<h1>Welcome to CM Info</h1>
<form action ="cm" method="post">
<pre>
CM Name <input type="text" name="name"/>
party <select name="party">
<option>Select</option>
<option>BJP</option>
<option>Congress</option>
<option>JDS</option>
<option>AAp</option>
<option>KJP</option>
</select>
State<select name="State">
<option>KA</option>
<option>KL</option>
<option>UP</option>
<option>TN</option>
<option>AP</option>
<option>TS</option>
</select>
Tenure<select name="tenure">
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>6</option>
</select>
proFolia<textarea rows="3" cols="50" name="profolia"></textarea>
<input type="submit" value="save" class="btn btn-primary"/>
</pre>
</form>
</div>
</body>
</html>