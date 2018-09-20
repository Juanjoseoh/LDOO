<%--
    Document   : index
    Created on : 19/09/2018, 06:38:08 PM
    Author     : Black Horse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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


        <div class="container">

             <div class="row">

                <div class="col">

                    <form action="respuesta.jsp" method="post">
                        <div class="form-group">
                            <label for="InputApellidoM">Apellido Paterno</label>
                            <input type="text" name="apellidom" class="form-control" id="InputApM" aria-describedby="Apellido materno" placeholder="Apellido">
                        </div>

                        <div class="form-group">
                            <label for="InputApellidoM">Apellido Materno</label>
                            <input type="text" name="apellidop" class="form-control" id="InputApM" aria-describedby="Apellido materno" placeholder="Apellido">
                        </div>

                        <div class="form-group">
                            <label for="InputApellidoM">Nombre</label>
                            <input type="text" name="nombre" class="form-control" id="InputApM" aria-describedby="Apellido materno" placeholder="Apellido">
                        </div>

                        <div class="form-group">
                            <label for="InputApellidoM">Fecha de nacimiento</label>
                            <input type="date" name="fecha" class="form-control" id="InputApM" aria-describedby="Fecha de nacimiento" placeholder="Fecha">
                        </div>

                        <div class="form-group">
                            <label for="InputApellidoM">Correo</label>
                            <input type="email" name="correo" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                            <small id="emailHelp" class="form-text text-muted">No compartiremos tu email con nadie</small>

                        </div>

                        <div class="form-group">
                            <label for="InputApellidoM">Password</label>
                            <input type="password" name="password" class="form-control" id="InputApM" aria-describedby="Correo" placeholder="Correo">

                        </div>

                        <button type="submit" value="Enviar valores" class="btn btn-sucess">ENVIAR</button>

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
