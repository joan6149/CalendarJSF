/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calendarjsf.controladores;

import com.calendarjsf.daos.UsuarioDAO;
import com.calendarjsf.modelos.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.NoSuchElementException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Joan
 */
public class ControllerIndex extends HttpServlet {

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

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        response.setContentType("text/html;charset=UTF-8");
        try {
            
            /*Tratamiento de datos*/

            if(request.getParameter("user").isEmpty()) {
                request.getSession().invalidate();
                getServletContext().getRequestDispatcher("/Includes/jsp/Error.jsp").forward(request, response);
            } else if(!usuarioDAO.userValidate(request.getParameter("user"), request.getParameter("pass"))) {
                request.getSession().invalidate();
                getServletContext().getRequestDispatcher("/Includes/jsp/Error.jsp").forward(request, response);
            } else {
                Usuarios User = new Usuarios();
                System.out.println(request.getParameter("user"));
                User = (request.getParameter("user").contains("@")) ? usuarioDAO.getUserByEmail(request.getParameter("user")) : usuarioDAO.getUserByUsername(request.getParameter("user"));
                /* TODO output your page here. You may use following sample code. */
                request.getSession().setAttribute("Usuario", User);
                getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } catch(NullPointerException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
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
