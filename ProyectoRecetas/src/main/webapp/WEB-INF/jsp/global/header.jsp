<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="css/bootstrap-icons.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/dataTables.bootstrap5.min.css">
<link rel="stylesheet" href="css/generalRecetas.css">
<link rel="shortcut icon" type="image/svg" href="/imgs/egg-fried.svg">

</head>
<body>
	<header class="bg-dark text-white p-3">
		<div class="container">
			<h1 class="display-4">Cook Book</h1>
			<nav>
				<ul class="nav">
					<li class="nav-item"><a class="nav-link text-white" href="/">Mostrar</a></li>
					<li class="nav-item"><a class="nav-link text-white"
						href="/admin">Insertar</a></li>
					<c:if
						test="${not empty sessionScope.SPRING_SECURITY_CONTEXT.authentication and sessionScope.SPRING_SECURITY_CONTEXT.authentication.authenticated}">
						<li class="nav-item">
							<form class="form-inline"
								action="${pageContext.request.contextPath}/logout" method="post">
								<button class="nav-link text-white" type="submit">Logout</button>
							</form>
						</li>
					</c:if>
				</ul>
			</nav>
		</div>
	</header>