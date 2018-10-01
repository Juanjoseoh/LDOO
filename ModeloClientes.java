/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author Juan Jose Ornelas
 */
public class ModeloClientes 
{
    private HashMap clientes;
    
    public ModeloClientes()
    {
        clientes = new HashMap();
        
        clientes.put(01,new Cliente( "Ornelas","Herrera","Juan Jose","16/10/1998","juanjo@gmail.com","1234"));
        
      
    }
      
        /*Validador de datos*/
    
        /*Esta opcion valida si en un input falta un dato, en caso*/
        /* de no faltar nada envia un boleano con valor true*/
        /*el cual se lee en el controladorClientes*/
        public boolean FaltanDatos(String apellidop,String apellidom,String nombre,String fecha,String correo, String password) 
       {
           boolean bueno=true;
         
      
           return bueno;
       }
    
}
