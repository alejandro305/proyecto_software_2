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
        <title>Insertar insumo</title>
    </head>
    <body>
        <h1>Insertar insumo</h1>
        <form action="ControladorInsertarAlta" method="">
                <p>insumo: <input type="number" name="insumo" id="insumo" required/></p>
                <p>cantidad: <input type="number" name="cantidad" id="cantidad" required/></p>
                <p>precio: <input type="number" name="precio" id="precio" required/></p>
                <p><input type="submit" name="ingresar" id="ingresar"/></p>
        </form>
    </body>
</html>
