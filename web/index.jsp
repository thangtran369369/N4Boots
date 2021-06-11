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
            <!-- Begin Slider Area -->
            <div class="slider-area">
                <div class="container-fluid">
                    <div class="slider-active owl-carousel">
                        <!-- Begin Single Slide Area -->
                        <div class="single-slide align-center-left animation-style-01 bg-1 ">
                            <div class="slider-progress"></div>
                        </div>
                        <!-- Single Slide Area End Here -->
                        <!-- Begin Single Slide Area -->
                        <!--                        <div class="single-slide align-center-left fullscreen animation-style-02 bg-2">
                                                    <div class="slider-progress"></div>
                        
                                                </div>-->

                    </div>
                </div>
            </div>

            <div class="static">
                <div class="container">
                    <!-- Begin Static Information Area -->
                    <div class="static-info">
                        <div class="row">
                            <!-- Begin Information Area -->
                            <div class="row w3l-grids-footer border-top border-bottom py-sm-4 py-3">
                                <div class="col-md-4 offer-footer">
                                    <div class="row">
                                        <div class="col-4 icon-fot">
                                            <i class="fas fa-dolly"></i>
                                        </div>
                                        <div class="col-8 text-form-footer">
                                            <h3>Miễn phí ship</h3>
                                            <p>Đơn hàng trên 300.000 đồng</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4 offer-footer my-md-0 my-4">
                                    <div class="row">
                                        <div class="col-4 icon-fot">
                                            <i class="fas fa-shipping-fast"></i>
                                        </div>
                                        <div class="col-8 text-form-footer">
                                            <h3>Vận chuyển nhanh chóng</h3>
                                            <p>Toàn quốc</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4 offer-footer">
                                    <div class="row">
                                        <div class="col-4 icon-fot">
                                            <i class="far fa-thumbs-up"></i>
                                        </div>
                                        <div class="col-8 text-form-footer">
                                            <h3>Lựa chọn tốt</h3>
                                            <p>của mọi sản phẩm</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Information Area End Here -->
                        </div>
                    </div>
                    <!-- Static Information Area End Here -->
                </div>
            </div>

            <section class="new-product pt-95 pb-100">
                <div class="container">
                    <!-- Begin Product Title Area -->
                    <div class="pos-title">
                        <h2>Sản phẩm mới</h2>
                    </div>
                    <br>
                    <!-- Product Title Area End Here -->
                    <!-- Begin Product Content Area -->
                    <div class="row">
                        <div class="col-lg-12">

                            <div class="pos-content">

                                <div class="new-product-active owl-carousel">
                                <c:forEach begin="1" end="10" step="1" items="${listNewProduct}" var="o">
                                    <div class="product-slide-item">

                                        <div class="single-product">
                                            <!-- Begin Product Image Area -->
                                            <div class="product-img">
                                                <a href="details?id=${o.id}">
                                                    <img class="primary-img" src="${o.image}"  height="300px" width="255" alt="">
                                                    <img class="secondary-img" src="${o.image1}" height="300px" width="255"  alt="">
                                                </a>
                                                <div class="sticker"><span>New</span></div>
                                                <!-- Begin Product Action Area -->
                                                <div class="product-action">
                                                    <div class="product-action-inner">
                                                        <div class="cart">
                                                            <a href="addToCart?productId=${o.id}">
                                                                <span>Add To Cart</span>
                                                            </a>
                                                        </div>
                                                        <ul class="add-to-links">
                                                            <c:choose>  
                                                                <c:when test="${wl.isExit(sessionScope.acc.id , o.id) == null}">
                                                                    <li class="rav-wishlist"><a href="addtoWishList?id=${o.id}" data-toggle="tooltip" title="Add To Wishlist"><i class="far fa-heart"></i></a></li>
                                                                        </c:when>


                                                                <c:when test="${wl.isExit(sessionScope.acc.id , o.id) != null}">
                                                                    <li class="rav-wishlist"><a href="deleteWishList?id=${wl.returnId(sessionScope.acc.id , o.id)}&product_id=${o.id}" data-toggle="tooltip"><i class="fas fa-heart"></i></a></li>
                                                                        </c:when>
                                                                    </c:choose>
                                                            <li class="rav-compare"><a href="#" data-toggle="tooltip" data-placement="top" title="Compare"><i class="fa fa-refresh"></i></a></li>
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
                                                    <a href="product-details.jsp" title="Printed Chiffon Dress">${o.name}</a>
                                                </h5>
                                                <!-- Product Name Area End Here -->
                                                <!-- Begin Price Box Area -->
                                                <div class="price-box">
                                                    <span class="price">${o.price} đ</span>
                                                    <span class="old-price"></span>
                                                </div>

                                            </div>
                                            <!-- Product Content Area End Here -->
                                        </div>

                                    </div>    
                                </c:forEach>
                            </div>

                        </div>

                    </div>
                </div>
                <!-- Product Content Area End Here -->
            </div>
        </section>

        <diV>


        </diV>
        <!-- Static Bottom Area End Here -->
        <!-- Begin Footer Area -->
    </body>
    <jsp:include page="/include/footer.jsp"></jsp:include>
</html>
