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
        <title>Insertar plato</title>
    </head>
    <body>
        <h1>Insertar plato</h1>
        <form action="ControladorInsertarPlato" method="">
                <p>descripcion: <input type="text" name="descripcion" id="descripcion"/></p>
                <p>nombre: <input type="text" name="nombre" id="nombre"/></p>
                <p>precio: <input type="number" name="precio" id="precio"/></p>
                <p>ingredientes: <input type="text" name="ingredientes" id="ingredientes"/></p>
                <p><input type="submit" name="ingresar" id="ingresar"/></p>
        </form>
    </body>
</html>
