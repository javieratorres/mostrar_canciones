<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">              
        <title>Detalle cancion</title>
        <link rel="stylesheet" href="/css/styles.css">
<body>
    <h1> ${cancion.titulo} </h1>
    <p>Artista: ${cancion.artista} </p>
    <p>Álbum: ${cancion.album} </p>
    <p>Género: ${cancion.genero} </p>
    <p>Idioma: ${cancion.idioma} </p>
    <a href="/canciones">Volver a la lista de canciones</a>

</body>
</html>