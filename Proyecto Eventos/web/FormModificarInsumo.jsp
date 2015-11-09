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
        <title>Modificar insumo</title>
    </head>
    <body>
        <h1>Insertar insumo</h1>
        <form action="ControladorModificarInsumo" method="">
                <p><input type="text" name="id" id="id"/></p>
                <p><input type="text" name="nombre" id="nombre"/></p>
                <p><input type="text" name="medida" id="medida"/></p>
                <p><input type="submit" name="modificar" id="modificar"/></p>
        </form>
    </body>
</html>
