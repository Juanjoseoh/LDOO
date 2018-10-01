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
public class Cliente
{
    private String ApPaterno;
    private String ApMaterno;
    private String Nombre;
    private String Fecha;
    private String Correo;
    private String Password;
    
    
     /*Constructor*/
    Cliente(String apellidop, String apellidom, String nombre, String fecha, String correo, String password) 
    {
        apellidop="Ornelas";
        apellidom="Herrera";
        nombre="Juan Jose";
        fecha="16/10/1998";
        correo="juanjo@gmail.com";
        password="1234";
    }
    /*Constructor*/

    /**
     * @return the ApPaterno
     */
    public String getApPaterno() {
        return ApPaterno;
    }

    /**
     * @param ApPaterno the ApPaterno to set
     */
    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    /**
     * @return the ApMaterno
     */
    public String getApMaterno() {
        return ApMaterno;
    }

    /**
     * @param ApMaterno the ApMaterno to set
     */
    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }


    
}
