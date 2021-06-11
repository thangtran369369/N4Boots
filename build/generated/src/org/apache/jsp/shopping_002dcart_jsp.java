package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shopping_002dcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <!-- Header Area End Here -->\r\n");
      out.write("            <!-- Begin Page Banner Area -->\r\n");
      out.write("            <div class=\"page-banner\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"page-banner-content\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"Home\">Trang chủ</a></li>\r\n");
      out.write("                            <li><a href=\"shop.jsp\">Shop</a></li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"shopping-cart.jsp\">Giỏ hàng</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Page Banner Area End Here -->\r\n");
      out.write("            <!--Shopping Cart Area Strat-->\r\n");
      out.write("           <div class=\"container\" style=\"margin-top: 7rem;margin-bottom: 7rem\">\r\n");
      out.write("            <div class=\"mt-3\">\r\n");
      out.write("                <h4>Giỏ hàng</h4>\r\n");
      out.write("                <form id=\"formQuantity\" action=\"sync-cart\" method=\"get\">\r\n");
      out.write("                    <table class=\"w-100 table table-striped mt-3\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr><th>STT</th>\r\n");
      out.write("                                <th>Image</th>\r\n");
      out.write("                                <th>Name of Product</th>\r\n");
      out.write("                                <th>Price</th>\r\n");
      out.write("                                <th>Quantity</th>\r\n");
      out.write("                                <th>Total Price</th>\r\n");
      out.write("                                <th>Action</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>1</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>Product Name</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"50\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"100\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>2</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>Product Name</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"50\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"100\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>3</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>Product Name</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"50\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"100\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"text-right\">\r\n");
      out.write("                        <h4>Tổng tiền:<fmt:formatNumber type=\"currency\" value=\"100\"/></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"text-right\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash mr-2\"></i>Delete Cart</a>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info ml-2\"><i class=\"fas fa-sync-alt mr-2\"></i>Update Cart</button>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-success ml-2\">Continue\r\n");
      out.write("                            <i class=\"fas fa-arrow-right ml-2\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <!--Shopping Cart Area End-->\r\n");
      out.write("            <!-- Begin Footer Area -->\r\n");
      out.write("        </body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
