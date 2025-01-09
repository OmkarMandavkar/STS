<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>User Validation Form</h1>
	<form action="http://localhost:8888/save" method="post">
		<label for="name">Name (3-10 characters):</label><br> 
		<input type="text" id="name" name="name" required><br>
		<br> 
		
		<label for="email">Email:</label><br> 
		<input type="email" id="email" name="email" required><br>
		<br> 
		
		<label for="phone">Phone:</label><br> 
		<input type="number" id="phone" name="phone" required><br>
		<br>

		<button type="submit">Submit</button>
	</form>

</body>
</html>