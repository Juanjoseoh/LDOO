/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author Juan Jose Ornelas
 */
public class ModeloClientes 
{
    public boolean validacion;
       
        /*Validador de datos*/
    
        /*Esta opcion valida si en un input falta un dato, en caso*/
        /* de no faltar nada envia un boleano con valor true*/
        /*el cual se lee en el controladorClientes*/
        public boolean FaltanDatos(String usuario,String apellidop,String apellidom,String nombre,String fecha,String correo, String password) 
       {
           if(usuario.equals("")&&apellidop.equals("")&&apellidom.equals("")&&nombre.equals("")&&fecha.equals("")&&correo.equals("")&&password.equals(""))
           {
               return validacion=false;
           }
           
           else
           {
               return validacion= true;
           }
           
       }
        
        
    
}
