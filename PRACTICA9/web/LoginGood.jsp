<%-- 
    Document   : LoginGood
    Created on : 10/10/2018, 08:59:49 PM
    Author     : Juan Jose Ornelas Herrera  1679652
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
         <head>
                <title>Inicio de sesion</title>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

                <!-- Bootstrap CSS -->
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <!--  JS -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
                <!-- Bootstrap JS -->
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         </head>
    <body>
        <% String nombre = (String)session.getAttribute("nombre"); %>
        <h1>Bienvenido Usuario <%= nombre%></h1>
    </body>
</html>
