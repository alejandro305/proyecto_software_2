<%-- 
    Document   : FormRegistrarPedido
    Created on : 29-nov-2015, 14:37:05
    Author     : Sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-2.1.4.min.js"></script>
        <script src="js/registrarPlato.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar pedido</h1>
        Platos<p id="platosDisponibles"></p>
        <p>cantidad: <input type="number" name="cantidad" id="cantidad"/></p>
        <p><button type="submit" name="adicionar" id="adicionarAlPedido">Adicionar al pedido</button></p>
        <p id="platosSeleccionados"></p>
        <p id="valorPedido"></p>
        <p><button type="submit" name="AceptarPedido" id="AceptarPedido">Aceptar pedido</button></p>
    </body>
</html>
