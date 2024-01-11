<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Insertar jps</h1>
		
		 <form action="${pageContext.request.contextPath}/admin/insertar" method="post">
        <label for="nombre">Nombre de la Receta:</label>
        <input type="text" id="nombre" name="nombre" required>

        <label for="dificultadId">ID de Dificultad:</label>
        <input type="text" id="dificultadId" name="dificultad.id" required>

        <button type="submit">Guardar Receta</button>
    </form>


    <hr>
	<ul>
		<c:forEach var="receta" items="${recetas}">
		<li>
			${receta.nombre}
		</li>
		</c:forEach>
	</ul>
</body>
</html>