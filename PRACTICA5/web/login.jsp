<%-- 
    Document   : login
    Created on : 9/10/2018, 12:20:57 AM
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
     

        <div class="container">

             <div class="row">

                <div class="col">
                    <h2>Iniciar sesion:</h2>
                    
                    <form action="loginServlet">    
                    <h2>Usuario: <input type="text" name="id"><br></h2>
                    <h2>Contraseña: <input type="password" name="pass"><br></h2>
                    <input type="submit" value="Enviar">
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
