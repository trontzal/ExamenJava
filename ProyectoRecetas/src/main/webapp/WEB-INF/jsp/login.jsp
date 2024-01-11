<%@ include file="/WEB-INF/jsp/global/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form action="/login" method="post">
		<label for="username">Usuario:</label> <input type="text"
			id="username" name="username" required><br> <label
			for="password">Contraseña:</label> <input type="password"
			id="password" name="password" required><br> <input
			type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button class="btn btn-primary" type="submit">Iniciar sesión</button>
	</form>

</body>
</html>