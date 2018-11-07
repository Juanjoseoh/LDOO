<%-- 
    Document   : PRUEBA
    Created on : 10/10/2018, 10:10:13 PM
    Author     : JUAN JOSE ORNELAS HERRERA  1679652
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIAR SESION</title>
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

                    <form action="loginServlet" method="post" >
                        <div class="form-group">
                            <label for="InputApellidoM">Usuario: </label>
                            <input type="text" name="usuario" class="form-control" id="Usuario" aria-describedby="Usuario" placeholder="Usuario">
                        </div>
                        
                        <div class="form-group">
                            <label for="InputApellidoM">Password: </label>
                            <input type="password" name="password" class="form-control" id="Password" aria-describedby="Password" placeholder="Password">
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
