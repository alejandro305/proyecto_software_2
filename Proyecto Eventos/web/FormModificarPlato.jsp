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
        <title>Modificar plato</title>
    </head>
    <body>
        <h1>Modificar plato</h1>
        <form action="ControladorModificarPlato" method="">
                <p>id: <input type="number" name="id" id="id" required/></p>
                <p>descripcion: <input type="text" name="descripcion" id="descripcion" required/></p>
                <p>nombre: <input type="text" name="nombre" id="nombre" required/></p>
                <p><input type="number" name="precio" id="precio" required/></p>
                <p><input type="text" name="ingredientes" id="ingredientes" required/></p>
                <p><input type="submit" name="modificar" id="modificar"/></p>
        </form>
    </body>
</html>
