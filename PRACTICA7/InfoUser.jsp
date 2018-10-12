<%-- 
    Document   : InfoUser
    Created on : 11/10/2018, 11:44:40 AM
    Author     : Juan Jose Ornelas Herrera  1679652
--%>

<%@page import="controlador.LoginCookie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATOS DEL USUARIO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!--  JS -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Bootstrap JS -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
        <%--Variables--%>

        <%
            
            String nombre1 = (String)session.getAttribute("nombre");
            String apellidop="Ornelas";
            String apellidom="Herrera";
            String nombre = "Juan Jose";
            String edad ="19";
            String correo="juanjo@gmail.com";
           
   
            
            String usuario = (String) request.getParameter("usuario");
            String password = (String) request.getParameter("password");
            
            // Creacion de cookies
            Cookie cookie = new Cookie("usuario",usuario);
            Cookie cookie2 = new Cookie("password",password);
            
             cookie.setMaxAge(3600);
             cookie2.setMaxAge(3600);

            
            /*Se agrega el tiempo maximo de la cookie*/
            
            response.addCookie(cookie);
            response.addCookie(cookie2);
            
 
        %>

        <div class="container">

             <div class="row">

                <div class="col">
                     
                    
                    <form action="LogOut" method="post">
                        
                     <h3>Bienvenido:<%=nombre1%> </h3>
                     
                     <h3>Tus datos son los siguientes: </h3>
                      <p>Apellido paterno:<%=apellidop%> </p><br>
                      <p>Apellido materno: <%=apellidom%></p><br>
                      <p>Nombre: <%=nombre%> </p><br>        
                      <p>Correo: <%=correo%> </p><br>
                      
                      <button type="submit" name="logout" value="001" id="logout" class="btn btn-danger">Logout</button>
                    
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
