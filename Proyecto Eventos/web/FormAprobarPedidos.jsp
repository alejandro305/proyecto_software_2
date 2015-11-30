<%-- 
    Document   : FormAprobarPedidos
    Created on : 30-nov-2015, 14:16:26
    Author     : Ambrosio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-2.1.4.min.js"></script>
        <script src="js/aprobarPedidos.js"></script>
        <link href="css/boostrap3/css/bootstrap.css" type="text/css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aprobar pedidos</h1>
        <p id="tablaPendientes"></p>
        <p id="pedidosPendientes"></p>
        <p><button type="submit" name="aprobarPedido" id="aprobarPedido">Aprobar pedido</button><button type="submit" name="denegarPedido" id="denegarPedido">Denegar pedido</button></p>
      
    </body>
</html>
