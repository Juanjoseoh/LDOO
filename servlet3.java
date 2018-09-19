/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_practica;

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

            /*Variables*/
            String apellidom = request.getParameter("apellidom");
            String apellidop = request.getParameter("apellidop");
            String nombre = request.getParameter("nombre");
            String fecha = request.getParameter("fecha");
            String email = request.getParameter("email");
            String pass = request.getParameter("password");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            out.println("<title>Registro</title>");
            out.println("</head>");
            out.println("<body>");

             /*INICIO DEL CONTAINER*/
            out.println("<div class=\"container\">");

                /*INICIO DEL ROW*/
                out.println("<div class=\"row\">");

                  /*INICIO DE COL #1*/
                    out.println("<div class=\"col\">");
                        out.println("<h1>Tus datos son los siguientes: </h1>");

                        out.println("<h2>Apellido paterno </h2>");
                        out.println(apellidop);

                        out.println("<h2>Apellido materno </h2>");
                        out.println(apellidom);

                        out.println("<h2>Nombre </h2>");
                        out.println(nombre);

                        out.println("<h2>Fecha de nacimiento </h2>");
                        out.println(fecha);

                        out.println("<h2>Correo </h2>");
                        out.println(email);

                        out.println("<h2>Password </h2>");
                        out.println(pass);

                     out.println("</div>");
                     /*FIN DE COL #1*/

                     /*INICIO DE COL #2*/
                     out.println("<div class=\"col\">");


                     out.println("</div>");
                      /*FIN DE COL #2*/

            out.println("</div>");
            /*FIN DEL ROW*/

            out.println("</div>");
            /*FIN DEL CONTAINER*/

            out.println("</body>");
            out.println("</html>");
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
