<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<form class="p-4 border border-2 rounded shadow-sm bg-white" 
		style="width: 60%; margin: 50px auto;">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">To</label> 
			<input type="email" class="form-control"
				id="exampleFormControlInput1" placeholder="name@example.com">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Subject</label>
			<textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
		</div>
		
		<div class="d-grid">
			<button type="submit" class="btn btn-primary" style="width: 12%">Send</button>
		</div>
		
	</form>
	
</body>
</html>