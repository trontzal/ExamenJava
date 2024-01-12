<%@ include file="/WEB-INF/jsp/global/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
	<c:if test="${loginError}">
		<div class="alert alert-danger" role="alert">
			<p>${errorMessage}</p>
		</div>
	</c:if>
	<div id="insertar-container"
		class="container text-center mt-5 mb-5 border rounded shadow d-flex flex-column gap-2">

		<h2>Login</h2>
		<form class="d-flex flex-column" action="/login" method="post">
			<label for="username">Usuario:</label> <input type="text"
				id="username" name="username" required><br> <label
				for="password">Contrase�a:</label> <input type="password"
				id="password" name="password" required><br>
			<div>
				<button class="btn btn-primary" type="submit">Iniciar
					sesi�n</button>
				<a class="btn btn-danger" href="/">Cancelar</a>
			</div>
		</form>
	</div>
	<p>usuario:admin</p>
	<p>contrase�a:admin</p>

	<%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>