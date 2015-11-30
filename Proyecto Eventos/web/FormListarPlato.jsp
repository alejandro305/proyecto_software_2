<%-- 
    Document   : index
    Created on : 08-nov-2015, 16:10:01
    Author     : Ambrosio
--%>

<%@page import="pkgControlador.ControladorListarPlato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/boostrap3/css/bootstrap.css" type="text/css" rel="stylesheet">
        <title>Listar plato</title>
    </head>
    <body>
        <%= ControladorListarPlato.listar()%>
    </body>
</html>
