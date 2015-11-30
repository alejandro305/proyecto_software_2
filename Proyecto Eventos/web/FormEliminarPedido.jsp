<%-- 
    Document   : FormEliminarPedido
    Created on : 29-nov-2015, 23:09:04
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Pedido</title>
    </head>
    <body>
        <h1>Eliminar Pedido</h1>
        <form action="ControladorEliminarPedido" method="">
                <p>id: <input type="text" name="id" id="id"/></p>
                <p><input type="submit" name="eliminar" id="eliminar"/></p>
        </form>
    </body>
</html>
