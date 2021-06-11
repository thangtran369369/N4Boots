/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LoginDAO;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author Admin
 */
@WebFilter(filterName = "checkLoginedFilter", urlPatterns = {"/addToCart", "/cart","/addtoWishList"})
public class checkLoginedFilter implements Filter {

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Users users = (Users) session.getAttribute("acc");
        if (users != null) {
            chain.doFilter(request, response);
        } else {
            String username = null;
            String password = null;
            Cookie[] cookies = req.getCookies();
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("userC")) {
                    username = cooky.getValue();
                }
                if (cooky.getName().equals("passC")) {
                    password = cooky.getValue();
                }
                if (username != null && password != null) {
                    break;
                }
            }
            if (username != null && password != null) {
                LoginDAO loginDAO = new LoginDAO();
                Users usersCookie = loginDAO.login(username, password);
                if (usersCookie != null) {
                    session.setAttribute("acc", usersCookie);
                    chain.doFilter(request, response);
                } else {
                    res.sendRedirect("login");

                }
            } else {
                res.sendRedirect("login");
            }

        }
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {

    }

}
