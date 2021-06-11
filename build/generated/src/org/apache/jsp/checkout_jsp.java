package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                            <li><a href=\"index.jsp.html\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"shop.html\">Shop</a></li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"checkout.html\">Thanh toán</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Page Banner Area End Here -->\r\n");
      out.write("            <!--Checkout Area Strat-->\r\n");
      out.write("            <div class=\"checkout-area pt-100 pb-70\">\r\n");
      out.write("                <div class=\"container\" style=\"margin-top: 5rem\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\" style=\"border: 1px solid #ced4da;border-radius: 5px !important\">\r\n");
      out.write("                    <h4 class=\"mt-3\">List of Product</h4>\r\n");
      out.write("                    <table class=\"w-100 table table-striped mt-3\">   \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>STT</th>\r\n");
      out.write("                            <th>Image</th>\r\n");
      out.write("                            <th>Name of Product</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Quantity</th>\r\n");
      out.write("                            <th>Total Price</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"C\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <img src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.productImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 100px\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <fmt:formatNumber type=\"currency\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.quantity*C.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </c:forEach>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"text-right\">\r\n");
      out.write("                        <h4>Total money:<fmt:formatNumber type=\"currency\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 pl-5\" style=\"border: 1px solid #ced4da;border-radius: 5px !important;\">\r\n");
      out.write("                    <h3 class=\"mt-3\" style=\"color: orange\">Infomation of Customer</h3>\r\n");
      out.write("                    <div class=\"card mt-3\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <form action=\"checkout\" method=\"post\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"name\">Full Name</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Enter name\" required>\r\n");
      out.write("                                    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"sdt\">Phone number</label>\r\n");
      out.write("                                    <input type=\"number\" name=\"mobile\" class=\"form-control\" placeholder=\"enter phone number\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"address\">Address</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" name=\"address\" required></textarea>\r\n");
      out.write("                                </div><div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"note\">Note</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" name=\"note\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success w-100\">Accept</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Checkout Area End-->\r\n");
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
