<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html class="no-js" lang="zxx">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <jsp:include page="/include/header.jsp"></jsp:include>
        </head>
        <body>
            <!-- Header Area End Here -->
            <!-- Begin Page Banner Area -->
            <div class="page-banner">
                <div class="container">
                    <div class="page-banner-content">
                        <ul>
                            <li><a href="Home">Trang chủ</a></li>
                            <li><a href="shop.jsp">Shop</a></li>
                            <li class="active"><a href="shopping-cart.jsp">Giỏ hàng</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Page Banner Area End Here -->
            <!--Shopping Cart Area Strat-->
           <div class="container" style="margin-top: 7rem;margin-bottom: 7rem">
           <c:choose>
               <c:when test="${listCart==null||listCart.size()==0}">
                    <div class="alert alert-danger" role="alert">
                             Giỏ hàng trống

                    </div>
               </c:when>
               <c:otherwise>
                     <div class="mt-3">
                <h4>Giỏ hàng</h4>
                <form id="formQuantity" action="updateCart" method="get">
                    <table class="w-100 table table-striped mt-3">
                        <thead>
                            <tr><th>STT</th>
                                <th>Image</th>
                                <th>Name of Product</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Total Price</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listCart}" var="c" varStatus="track">
                            <tr>
                                <td>${c.productId}</td>
                                <td>
                                    <img src="${c.productImg}" style="width: 100px">
                                </td>
                                <td>${c.productName}</td>
                                
                                  <td class="product-subtotal"><span class="amount">${c.productPrice}</span></td>

                                <td> 
                                    <input type="number" min="1" max="${c.productQuantity}" name="quantity${track.count-1}" value="${c.quantity}" class="pl-1" style="width: 60px"/>
                                </td>
                                
                                <td class="product-subtotal"><span class="amount">${c.quantity*c.productPrice}</span></td>
                                <td>
                                    <a href="delete-cart?productId=${c.productId}" class="btn btn-danger"><i class="fas fa-trash"></i></a>
                                </td>
                            </tr>
                            </c:forEach>
                          
                            
                        </tbody>
                    </table>
                    <hr/>
                    <div class="text-right">
                        
                        <h4>Tổng tiền:<td class="product-subtotal"><span class="amount">${totalMoney}</span></td>
                        </h4>
                    </div>
                    <hr/>
                    <div class="text-right">
                        <a href="delete-cart?all=1" class="btn btn-danger"><i class="fas fa-trash mr-2"></i>Delete Cart</a>

                        <button type="submit" class="btn btn-info ml-2"><i class="fas fa-sync-alt mr-2"></i>Update Cart</button>
                        <a href="checkout" class="btn btn-success ml-2">Checkout
                            <i class="fas fa-arrow-right ml-2"></i>
                        </a>
                    </div>
                </form>
            </div>

               </c:otherwise>    
           </c:choose>
                     </div>
            <!--Shopping Cart Area End-->
            <!-- Begin Footer Area -->
        </body>
    <jsp:include page="/include/footer.jsp"></jsp:include>
</html>