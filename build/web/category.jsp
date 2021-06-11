<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="wl" class="dao.WishListDAO"></jsp:useBean>

<!DOCTYPE html>
<html class="no-js" lang="zxx">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./include/header.jsp"></jsp:include>
            <link href="style.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>

            <!-- Header Area End Here -->
            <!-- Begin Page Banner Area -->
            <div class="page-banner">
                <div class="container">
                    <div class="page-banner-content">
                        <ul>
                            <li><a href="index.jsp.html">Trang chủ</a></li>
                            <c:choose>

                            <c:when test="${cid == 1}">
                                <li class="active"><a href="">Biti's</a></li>

                            </c:when>
                            <c:when test="${cid == 2}">
                                <li class="active"><a href="">Adidas</a></li>

                            </c:when>
                            <c:when test="${cid == 3}">
                                <li class="active"><a href="">Nike</a></li>

                            </c:when>
                            <c:when test="${cid == 4}">
                                <li class="active"><a href="">Vans</a></li>

                            </c:when>        

                        </c:choose>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Page Banner Area End Here -->
        <!-- Begin Shop Topbar Wrapper Area -->
        <div class="shop-topbar-area shop-topbar-area-reverse pt-100 pb-100">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 order-2 order-lg-1">


                    </div>



                    <div class="shop-product">
                        <!-- Begin Tab Menu Content Area -->
                        <div class="tab-content">
                            <div id="grid" class="tab-pane show fade in active">
                                <div class="grid-view">
                                    <div class="row">
                                        <c:forEach items="${listP}" var ="o">

                                            <div class="col-lg-4 col-md-6 col-sm-6">
                                                <!-- Begin Single Product Area -->
                                                <div class="single-product single-product-3">
                                                    <!-- Begin Product Image Area -->
                                                    <div class="product-img">
                                                        <a href="details?id=${o.id}">
                                                            <img class="primary-img" src="${o.image}" alt="">
                                                            <img class="secondary-img" src="${o.image1}" alt="">
                                                        </a>
                                                        <!-- Begin Product Action Area -->
                                                        <div class="product-action">
                                                            <div class="product-action-inner">
                                                                <div class="cart">
                                                                    <c:if test="${o.amount>0}">
                                                                        <a href="addToCart?productId=${o.id}">
                                                                            <span>Thêm vào giỏ hàng</span>
                                                                        </a>
                                                                    </c:if>
                                                                    <c:if test="${o.amount<=0}">
                                                                        <button type="button" class="btn btn-danger">
                                                                            Hết hàng
                                                                        </button>
                                                                    </c:if>  
                                                                </div>
                                                                <ul class="add-to-links">
                                                                    <c:choose>  
                                                                        <c:when test="${wl.isExit(sessionScope.acc.id , o.id) == null}">
                                                                            <li class="rav-wishlist"><a href="addtoWishList?id=${o.id}" data-toggle="tooltip" title="Add To Wishlist"><i class="far fa-heart"></i></a></li>
                                                                    </c:when>


                                                                        <c:when test="${wl.isExit(sessionScope.acc.id , o.id) != null}">
                                                                            <li class="rav-wishlist"><a href="deleteWishList?id=${wl.returnId(sessionScope.acc.id , o.id)}&product_id=${o.id}" data-toggle="tooltip" title="Add To Wishlist"><i class="fas fa-heart"></i></a></li>
                                                                        </c:when>
                                                                    </c:choose>                                                                     
                                                                    <li class="rav-quickviewbtn">
                                                                        <a href=".open-modal" data-toggle="modal" title="Quick view"><i class="fa fa-eye"></i></a>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                        <!-- Product Action Area End Here -->
                                                    </div>
                                                    <!-- Product Image Area End Here -->
                                                    <!-- Begin Product Content Area -->
                                                    <div class="product-contents">
                                                        <!-- Begin Product Name Area -->
                                                        <h5 class="product-name">
                                                            <a href="product-details.html" title="Printed Chiffon Dress">${o.name}</a>
                                                        </h5>
                                                        <!-- Product Name Area End Here -->
                                                        <!-- Begin Price Box Area -->
                                                        <div class="price-box">
                                                            <span class="price">${o.price}đ</span>
                                                        </div>
                                                        <!-- Price Box Area End Here -->
                                                        <!-- Begin Rating Area -->
                                                        <div class="rating">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </div>
                                                        <!-- Rating Area End Here -->
                                                    </div>
                                                    <!-- Product Content Area End Here -->
                                                </div>
                                                <!-- Single Product Area End Here -->
                                            </div>
                                        </c:forEach>

                                    </div>
                                </div>
                            </div>

                            <!-- Tab Menu Content Area End Here -->
                        </div>
                        <!-- Begin Pagination Area -->
                        <div class="pagination-area pagination-area-reverse">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-12 p-0">
                                        <div class="product-pagination">
                                            <ul
                                                <c:forEach begin="1" end="${totalPage}" var="i">
                                                    <li><a class="${tag==i?"activedds":""}" href="category?pageIndex=${i}&cid=${cid}">${i}</a></li>
                                                    </c:forEach> 
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Pagination Area End Here -->
                    </div>

                </div>
            </div>
        </div>
        <!-- Shop Topbar  Wrapper Area End Here -->
        <!-- Begin Footer Area -->
        <!-- Begin Footer Area -->
    </body>
    <jsp:include page="./include/footer.jsp"></jsp:include>
</html>