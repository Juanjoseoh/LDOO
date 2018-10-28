package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Black Horse
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
                
                
            /*Datos del usuario*/
                
                /*Datos de acceso*/
                 String url = "jdbc:derby://localhost:1527/Juanjo";
                 String us = "Juanjo";
                 String pw = "jjoh1234";
            
             /*Conexion con base de datos*/
               
                      /*Datos del usuario*/
                        String Usuario = request.getParameter("usuario");
                        String Apellidop = request.getParameter("apellidop");
                        String Apellidom = request.getParameter("apellidom");
                        String Nombre = request.getParameter("nombre");
                        String Fecha = request.getParameter("fecha");
                        String Correo = request.getParameter("correo");
                        String Password = request.getParameter("password");
                    
                         
                        
                        /*Conexion establecida*/
                        Conection con = (Conection) DriverManager.getConnection(url,us,pw);
                        
                        /*Creacion del Statement*/
                        Statement stmt = con.createStatement();
                        
                        /*Query*/
                        String  query="INSERT INTO USUARIOS VALUES('"+Usuario+"','"+Apellidop+"','"+Apellidom+"','"+Nombre+"','"+Fecha+"','"+Correo+"','"+Password+"')";
                        
                        /*Aqui ejecuta el query OJO ES UN UPFATE */
                        
                        ResultSet rs = stmt.executeQuery(query);
                        

                        /*Conexion cerrada*/
                        stmt.close();
          
                      
                       
                        
                 
                 
              
             
         
            
  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
