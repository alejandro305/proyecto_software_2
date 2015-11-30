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
        <title>Insertar baja</title>
    </head>
    <body>
        <h1>Insertar baja</h1>
        <form action="ControladorInsertarBaja" method="">
                <p>insumo: <input type="number" name="insumo" id="insumo"/></p>
                <p>cantidad: <input type="number" name="cantidad" id="cantidad"/></p>
                <p><input type="submit" name="ingresar" id="ingresar"/></p>
        </form>
    </body>
</html>
