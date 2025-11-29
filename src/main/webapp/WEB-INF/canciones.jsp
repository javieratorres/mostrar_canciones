<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">              
        <title>Canciones</title>
        <link rel="stylesheet" href="/css/styles.css">
    </head>
<body>
    <h1> Canciones </h1>
    <table>
        <thead>
            <tr>  
                <th>Título</th>
                <th>Artista</th>
                <th>Álbum</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cancion" items="${listaCanciones}">
                <tr>
                    <td>${cancion.titulo}</td>
                    <td>${cancion.artista}</td>
                    <td>
                    <a href="/canciones/detalle/${cancion.id}">detalle</td>
                </tr>
            </c:forEach>
        </tbody>
</body>
</html>
