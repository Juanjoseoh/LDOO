<%--
    Document   : respuesta
    Created on : 19/09/2018, 06:50:16 PM
    Author     : Black Horse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>REGISTRO</title>
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
        <%--Variables--%>

        <%
         String apellidom = request.getParameter("apellidom");
         String apellidop = request.getParameter("apellidop");
         String nombre = request.getParameter("nombre");
         String fecha = request.getParameter("fecha");
         String correo = request.getParameter("correo");
         String password = request.getParameter("password");

        %>

        <div class="container">

             <div class="row">

                <div class="col">
                    <h2>Tus datos son los siguientes:</h2>

                    <p>Apellido materno: <%=apellidom%></p><br>
                    <p>Apellido paterno:<%=apellidop%> </p><br>
                    <p>Nombre: <%=nombre%> </p><br>
                    <p>Fecha de nacimiento: <%=fecha%> </p><br>
                    <p>Correo: <%=correo%> </p><br>
                    <p>Password: <%=password%> </p><br>

                 </form>

                </div>


               <!--Columna vacia-->
               <div class="col">


                </div>
                <!--Columna vacia-->

             </div>


        </div>
    </body>
</html>
