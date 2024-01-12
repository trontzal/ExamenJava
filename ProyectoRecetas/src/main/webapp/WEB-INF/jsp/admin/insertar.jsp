<%@ include file="/WEB-INF/jsp/global/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar Recetas</title>
</head>
<body>
	<div id="insertar-container"
		class="container text-center mt-5 mb-5 border rounded shadow d-flex flex-column gap-2">
		<h1>Insertar Recetas</h1>

		<form class="d-flex flex-column gap-2"
			action="${pageContext.request.contextPath}/admin/insertar"
			method="post">
			<label for="nombre">Nombre de la Receta:</label>
			<p>
				<input type="text" id="nombre" name="nombre" required>
			</p>

			<p>
				<label for="difultadId">Elige la dificultad: </label> <select
					name="dificultad.id" required>
					<option value="1">Facil</option>
					<option value="2">Normal</option>
					<option value="3">Dificil</option>

				</select>
			</p>
			<div>
				<button class="btn btn-primary" type="submit">Guardar
					Receta</button>
				<a class="btn btn-danger" href="${pageContext.request.contextPath}/">Cancelar</a>
			</div>
		</form>
	</div>

	<a href="${pageContext.request.contextPath}/">Volver al listado</a>


	<%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>