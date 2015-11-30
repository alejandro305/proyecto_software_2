<%-- 
    Document   : FormModificarPedido
    Created on : 30-nov-2015, 17:11:30
    Author     : Ambrosio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-2.1.4.min.js"></script>
        <script src="js/modificarPedido.js"></script>
        <link href="css/boostrap3/css/bootstrap.css" type="text/css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar pedido</h1>
        <p id="tablaPedidos"></p>
        Id del Pedido
        <p id="idsPedidos"></p>
        <p><input type="number" id="txtNuevoValor" placeholder="Nuevo valor"/></p>
        <p><button type="submit" name="modificarValor" id="modificarValor">Modificar valor del pedido</button></p>
    </body>
</html>
