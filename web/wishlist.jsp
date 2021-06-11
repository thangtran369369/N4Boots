<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="wl" class="dao.WishListDAO"></jsp:useBean>

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
                            <li><a href="Home">Home</a></li>
                            <li><a href="shop.jsp">Shop</a></li>
                            <li class="active"><a href="wishlist.jsp">Wishlist</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Page Banner Area End Here -->
            <!--Wishlist Area Strat-->
            <div class="wishlist-area pt-100 pb-100">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <form action="#">
                                <div class="table-content table-responsive">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th class="raavin-product-remove">remove</th>
                                                <th class="raavin-product-thumbnail">images</th>
                                                <th class="cart-product-name">Product</th>
                                                <th class="raavin-product-price">Unit Price</th>
                                                <th class="raavin-product-stock-status">Stock Status</th>
                                                <th class="raavin-product-add-cart">add to cart</th>
                                            </tr>
                                        </thead>
                                        <tbody> 

                                        <c:forEach items="${listP}" var="o">
                                            <tr>
                                                <td class="raavin-product-remove"><a href="deleteWishList?action=deleteMyWishList&id=${o.id}"><i class="fas fa-trash">Delete</i></a></td>
                                                <td class="raavin-product-thumbnail"><a href="#"><img src="${o.image}" height="150px" width="150px" alt=""></a></td>
                                                <td class="raavin-product-name"><a href="#">${o.name}</a></td>
                                                <td class="raavin-product-price"><span class="amount">${o.price}</span></td>
                                                <td class="raavin-product-stock-status"><span class="out-stock">Còn hàng</span></td>
                                                <td class="raavin-product-add-cart"><a href="addToCart?productId=${o.id}">add to cart</a></td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </form>
                            <p class="text-danger"><a href="login.jsp">${mess}</a></p>      

                    </div>
                </div>
            </div>
        </div>
        <!--Wishlist Area End-->
        <!-- Begin Footer Area -->
    </body>
    <jsp:include page="/include/footer.jsp"></jsp:include>
</html>            