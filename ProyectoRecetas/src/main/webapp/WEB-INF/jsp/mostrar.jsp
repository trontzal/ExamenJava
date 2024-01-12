<%@ include file="/WEB-INF/jsp/global/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista de recetas</title>

<!-- DataTables -->
<link rel="stylesheet" href="css/dataTables.bootstrap5.min.css">
<script src="js/jquery-3.7.1.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function() {
        $('.table-bordered').DataTable({
            language: {
                url: 'json/es-ES.json',
            }
        });
    });
</script>
</head>
<body>

    <c:if test="${logoutSuccess}">
        <div class="alert alert-success" role="alert">
            <p>${logoutMessage}</p>
        </div>
    </c:if>

    <div class="container">
        <h1>Listado de recetas</h1>

        <table class="table table-hover table-striped table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Dificultad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="receta" items="${recetas}">
                    <tr>
                        <td>${receta.id}</td>
                        <td>${receta.nombre}</td>
                        <td>${receta.dificultad.dificultad}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <%@ include file="/WEB-INF/jsp/global/footer.jsp"%>
</body>
</html>
