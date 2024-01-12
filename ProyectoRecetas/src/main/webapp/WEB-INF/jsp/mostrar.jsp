<%@ include file="/WEB-INF/jsp/global/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista de recetas</title>
</head>
<body>

	<c:if test="${logoutSuccess}">
		<div class="alert alert-success" role="alert">
			<p>${logoutMessage}</p>
		</div>
	</c:if>

	<div class="container">
		<h1>Listado de recetas</h1>
		<div class="d-flex flex-wrap justify-content-around mb-5">
			<c:forEach var="receta" items="${recetas}">
				<div class="card m-1" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title">${receta.nombre}</h5>
						<div class="d-flex justify-content-between">
							<p>Dificultad:</p>
							<p>${receta.dificultad.dificultad}</p>
						</div>
						<p class="card-text">Ejemplo de lo que seria una peque�a
							descripcion de la receta.</p>
						<a href="/ver-receta" class="card-link">Ver receta</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>