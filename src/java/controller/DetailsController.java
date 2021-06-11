/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dao.ReviewDAO;
import dao.WishListDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;
import model.Review;
import model.Users;
import model.WishList;

/**
 *
 * @author Admin
 */
@WebServlet(name = "DetailsController", urlPatterns = {"/details"})
public class DetailsController extends HttpServlet {

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
            out.println("<title>Servlet DetailsController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DetailsController at " + request.getContextPath() + "</h1>");
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
        int id = Integer.parseInt(request.getParameter("id"));
        WishListDAO wDAO = new WishListDAO();
        ProductDAO dao = new ProductDAO();
        ReviewDAO reviewDAO = new ReviewDAO();
        
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("acc");
        if(user==null){
            session.invalidate();
        }else{
            WishList exits = wDAO.isExit(user.getId(), id);
            request.setAttribute("exits", exits);

        }
        
      
        
        Product product = dao.getProductById(id);
        request.setAttribute("product", product);   
        
        List<Review> reviewById = reviewDAO.getReviewById(id);
        int count = 0;
        for (Review review : reviewById) {
            count++;
        }
       
      
        request.setAttribute("reviewbyid", reviewById);
        request.setAttribute("count", count);
        
       
        request.getRequestDispatcher("product-details.jsp").forward(request, response);
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
