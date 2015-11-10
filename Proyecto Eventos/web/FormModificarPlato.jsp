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
        <title>Modificar plato</title>
    </head>
    <body>
        <h1>Modificar plato</h1>
        <form action="ControladorModificarPlato" method="">
                <p><input type="text" name="id" id="id"/></p>
                <p><input type="text" name="descripcion" id="descripcion"/></p>
                <p><input type="text" name="nombre" id="nombre"/></p>
                <p><input type="number" name="precio" id="precio"/></p>
                <p><input type="text" name="ingredientes" id="ingredientes"/></p>
                <p><input type="submit" name="modificar" id="modificar"/></p>
        </form>
    </body>
</html>
