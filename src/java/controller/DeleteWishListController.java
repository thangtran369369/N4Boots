/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.WishListDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author tranv
 */
@WebServlet(name = "DeleteWishListController", urlPatterns = {"/deleteWishList"})
public class DeleteWishListController extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteWishListController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteWishListController at " + request.getContextPath() + "</h1>");
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

        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("deleteMyWishList")) {
            doGet_deleteMyWishList(request, response);
        }else if(action.equalsIgnoreCase("deleteWishListById")){
            doGet_deleteWishListById(request, response);
        }
    }

    protected void doGet_deleteWishListById(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int wishList_id = Integer.parseInt(request.getParameter("wishlist_id"));
        int product_id = Integer.parseInt(request.getParameter("product_id"));

        WishListDAO wishListDAO = new WishListDAO();
        wishListDAO.delete(wishList_id);

        request.getRequestDispatcher("details?id=" + product_id).forward(request, response);

    }

    protected void doGet_deleteMyWishList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("acc");
        int id = Integer.parseInt(request.getParameter("id"));
        WishListDAO wishListDAO = new WishListDAO();
        int id_wishlist = wishListDAO.getWishList(user.getId(), id);
        wishListDAO.delete(id_wishlist);

        request.getRequestDispatcher("myWishlist").forward(request, response);

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
