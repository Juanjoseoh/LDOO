/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Black Horse
 */
public class Servlet_practica3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            /*VARIABLES*/
            String nombre = request.getParameter("Apellidom");
            String apellidop = request.getParameter("Apellidop");
            String apellidom = request.getParameter("Nombre");
            String correo = request.getParameter("Email");
            String fecha = request.getParameter("Fecha");
            String password = request.getParameter("Contrasena");
           /*VARIABLES*/
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formulario</title>");   
            
            /*LINK CSS Bootstrap*/
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
            /*LINK CSS Bootstrap*/
            
            /*LINK JS */
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            /*LINK JS*/
            
            /*LINK JS Bootstrap*/
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            /*LINK JS Bootstrap*/
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formulario at " + request.getContextPath() + "</h1>");
            out.println("        <form action=formulario method='post'>");
            
                out.println("          <div class='w3-row-padding' style='margin:0 -16px 8px -16px'>");
                
                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='email' placeholder='Apellido Paterno' required name='Apellidop'>");
                out.println("            </div>");
                out.println("<br>");
                
                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='email' placeholder='Apellido Materno' required name='Apellidom'>");
                out.println("            </div>");
                out.println("<br>");
                
                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='text' placeholder='Nombre' required name='Nombre'>");
                out.println("            </div>");
                out.println("<br>");

                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='date' placeholder='Fecha de nacimiento' required name='Fecha'>");
                out.println("            </div>");
                out.println("<br>");

                
                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='email' placeholder='Correo' required name='Email'>");
                out.println("            </div>");
                out.println("<br>");
                
                
                out.println("            <div class='w3-half'>");
                out.println("              <input class='w3-input w3-border' type='password' placeholder='Contraseña' required name='Password'>");
                out.println("            </div>");
                out.println("<br>");
            
            
            out.println("<button class='w3-button w3-black w3-section w3-right' type='submit'>ENVIAR</button>");
            
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
            
                
            /*Impresion de datos*/
                out.println(" <h2>Tus datos son los siguientes: </h2>");
                out.println("Apellido Paterno: " + apellidop);
                out.println("Apellido Materno: " + apellidom);
                out.println("Nombre: " + nombre);
                out.println("<br> Su fecha de nacimiento es: " + fecha);
                out.println("<br>Correo: " + correo);
                out.println("<br>contraseña: " + password);
            /*Impresion de datos*/    
            
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
        processRequest(request, response);
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
            throws ServletException, IOException {
        processRequest(request, response);
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
