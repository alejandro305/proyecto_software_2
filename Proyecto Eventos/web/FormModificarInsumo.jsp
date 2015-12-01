<%-- 
    Document   : index
    Created on : 08-nov-2015, 16:10:01
    Author     : Ambrosio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/boostrap3/css/bootstrap.css" type="text/css" rel="stylesheet">
        <title>Modificar insumo</title>
    </head>
    <body>
        <h1>Modificar insumo</h1>
        <form action="ControladorModificarInsumo" method="">
                <p>identificador: <input type="number" name="id" id="id" required/></p>
                <p>nombre: <input type="text" name="nombre" id="nombre" required/></p>
                <p>medida: <input type="text" name="medida" id="medida" required/></p>
                <p><input type="submit" name="modificar" id="modificar"/></p>
        </form>
    </body>
</html>
