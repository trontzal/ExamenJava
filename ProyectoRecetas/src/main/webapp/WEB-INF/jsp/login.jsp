<%@ include file="/WEB-INF/jsp/global/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form action="/login" method="post">
		<label for="username">Usuario:</label> <input type="text"
			id="username" name="username" required><br> <label
			for="password">Contrase�a:</label> <input type="password"
			id="password" name="password" required><br> 
		<button class="btn btn-primary" type="submit">Iniciar sesi�n</button>
	</form>


	<%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>