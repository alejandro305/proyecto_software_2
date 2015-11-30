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
        <script src="js/jquery-2.1.4.min.js"></script>
        <script src="js/insertarInsumo.js"></script>
        <link href="css/boostrap3/css/bootstrap.css" type="text/css" rel="stylesheet">
        <title>Insertar insumo</title>
    </head>
    <body>
        <h1>Insertar insumo</h1>
        <!--
        <form action="PruebaControladorInsertarInsumo" method="">
                <p><input type="text" name="nombre" id="nombre"/></p>
                <p><input type="text" name="medida" id="medida"/></p>
                <p><input type="submit" name="ingresar" id="ingresar"/></p>
        </form>
        -->
        
        <p>nombre: <input type="text" name="nombre" id="nombre"/></p>
        <p>medida: <input type="text" name="medida" id="medida"/></p>
        <p><button type="submit" name="ingresar" id="ingresar">Ingresar insumo</button></p>
        
        <div id="contenedor"></div>
    </body>
</html>
