<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/jsp/global/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insertar jps</h1>

	<form action="${pageContext.request.contextPath}/admin/insertar"
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

		<button class="btn btn-primary" type="submit">Guardar Receta</button>
	</form>

	<a href="${pageContext.request.contextPath}/">Volver al listado</a>


	<%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>