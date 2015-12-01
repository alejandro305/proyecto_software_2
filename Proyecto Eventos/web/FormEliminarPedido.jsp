<%-- 
    Document   : index
    Created on : 30-nov-2015, 30-11-2015
    Author     : Hon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Pedido</title>
    </head>
    <body>
        <h1>Eliminar Pedido</h1>
        <form action="ControladorEliminarPedido" method="">
            <p>id: <input type="number" name="id" id="id" required /></p>
            <p><input type="submit" name="eliminar" id="eliminar"/></p>
        </form>
    </body>
</html>
