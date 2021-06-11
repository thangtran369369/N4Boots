<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="stu" class="dao.GenderDAO"></jsp:useBean>
<jsp:useBean id="cdao" class="dao.CategoryDAO"></jsp:useBean>

    <!DOCTYPE html>
    <html class="no-js" lang="zxx">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta charset="UTF-8" />




            <title>Home || Raavin - Shoes eCommerce Bootstrap 4 Template</title>
            <meta name="description" content="">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Favicon -->
            <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png">
            <!-- Material Design Iconic Font-V2.2.0 -->
            <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
            <!-- Font Awesome -->
            <link rel="stylesheet" href="css/font-awesome.min.css">
            <!-- Font Awesome Stars-->
            <link rel="stylesheet" href="css/fontawesome-stars.css">
            <!-- Meanmenu CSS -->

            <link href="./assets/fontawesome-free-5.15.3/css/all.min.css" rel="stylesheet">
            <link rel="stylesheet" href="css/meanmenu.css">
            <!-- Nivo Slider CSS -->
            <link rel="stylesheet" href="css/nivo-slider.css">
            <!-- owl carousel CSS -->
            <link rel="stylesheet" href="css/owl.carousel.min.css">
            <!-- Slick Carousel CSS -->
            <link rel="stylesheet" href="css/slick.css">
            <!-- Animate CSS -->
            <link rel="stylesheet" href="css/animate.css">
            <!-- Jquery-ui CSS -->
            <link rel="stylesheet" href="css/jquery-ui.min.css">
            <!-- Venobox CSS -->
            <link rel="stylesheet" href="css/venobox.css">
            <!-- Nice Select CSS -->
            <link rel="stylesheet" href="css/nice-select.css">
            <!-- Magnific Popup CSS -->
            <link rel="stylesheet" href="css/magnific-popup.css">
            <!-- Bootstrap V4.1.3 Fremwork CSS -->
            <link rel="stylesheet" href="css/bootstrap.min.css">
            <!-- Main Style CSS -->
            <link rel="stylesheet" href="style.css">
            <!-- Responsive CSS -->
            <link rel="stylesheet" href="css/responsive.css">
            <!-- Modernizr js -->
            <script src="js/vendor/modernizr-2.8.3.min.js"></script>
        </head>
        <body>
            <!--[if lt IE 8]>
                        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
                <![endif]-->
            <!-- Begin Body Wrapper -->
            <div class="body-wrapper">

                <header>
                    <!-- Begin Main Header Area -->
                    <div class="main-header stick header-sticky">
                        <div class="container-fluid">
                            <div class="row">
                                <!-- Begin Logo Area -->
                                <div class="col-lg-2 col-md-3 col-2">
                                    <div class="logo">
                                        <a href="Home">
                                            <img src="images/menu/logo/1.png" alt="">
                                        </a>
                                    </div>
                                </div>
                                <!-- Logo Area End Here -->
                                <!-- Begin Main Menu Area -->
                                <div class="col-lg-6 d-none d-lg-block d-xl-block">
                                    <div class="main-menu">
                                        <nav>
                                            <ul>
                                                <li class="active"><a href="Home">Trang chủ</a></li>
                                                <c:forEach items="${stu.getAllGender()}" var="g">
                                                <li><a href="gender?id=${g.id}">${g.name}</a></li>
                                                </c:forEach>
                                                <li class=""><a href="#">Nhãn hiệu</a>
                                                <!-- Begin Dropdown Menu Area -->
                                                <ul class="dropdown">
                                                    <c:forEach items="${cdao.getAllCategory()}" var="c">
                                                        <li><a href="category?cid=${c.id}">${c.name}</a></li>
                                                        </c:forEach>

                                                </ul>
                                                <!-- Dropdown Menu Area End Here -->
                                                </li>
                                                <li><a href="sale">Sale</a></li>
                                                <li><a href="faq.jsp">FAQ</a>
                                                </li>
                                                <li><a href="contact-us.jsp">Contact Us</a></li>
                                                <c:if test="${sessionScope.acc != null}">
                                                    <li><a href="#"><i class="fa fa-user"></i> Hello ${sessionScope.acc.username}</a></li>                                                        
                                                </c:if>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <!-- Main Menu Area End Here -->
                            <!-- Begin Header Right Area -->
                            <div class="col-lg-4 col-md-9 col-10">
                                <div class="header-right">
                                    <!-- Begin Mini Cart Area -->

                                    <div class="main-menu primary-menu">
                                        <nav>
                                            <ul>
                                                <li><a href="cart"><i class="fa fa-shopping-bag"></i>Giỏ hàng <span>${sessionScope.listOrder.size()}</span></a>
                                                </li>
                                            </ul>
                                        </nav>
                                    </div>
                                    <!-- Mini Cart Area End Here -->
                                    <!-- Begin Header Search Area -->

                                    <div class="main-menu primary-menu">
                                        <nav>
                                            <ul>
                                                <li><a href="#"><i class="fa fa-search"></i>Tìm kiếm</a>
                                                    <ul class="dropdown header-search">
                                                        <li>
                                                            <form action="search" method="post">
                                                                <input type="text" name="txtSearch" value="${txtS}" onblur="if (this.value == '') {
                                                                            this.value = 'Enter key words...'
                                                                        }" onfocus="if (this.value == 'Enter key words...') {
                                                                                    this.value = ''
                                                                                }">
                                                                <button><i class="fa fa-search"></i></button>
                                                            </form>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </nav>
                                    </div>
                                    <!-- Header Search Area End Here -->
                                    <!-- Begin User Account Area -->

                                    <div class="main-menu primary-menu">
                                        <nav>                                            
                                            <ul>

                                                <li><a href="#"><i class="fa fa-cog"></i>Cài đặt</a>
                                                    <ul class="dropdown primary-dropdown">

                                                        <li><a href="#"><i class="fa fa-user"></i>My Account</a></li>
                                                        <li><a href="myWishlist"><i class="fa fa-heart"></i>My Wishlist</a></li>
                                                            <c:if test="${sessionScope.acc != null}">
                                                            <li><a href="logout"><i class="fas fa-sign-out-alt"></i>Logout</a></li>

                                                        </c:if> 
                                                        <c:if test="${sessionScope.acc == null}">
                                                            <li><a href="login.jsp"><i class="fas fa-unlock"></i>Login</a></li>
                                                            </c:if> 
                                                        <li><a href="register.jsp"><i class="fas fa-user-plus"></i>Sign up</a></li>


                                                    </ul>
                                                </li>
                                            </ul>
                                        </nav>
                                    </div>
                                    <c:if test="${sessionScope.acc.isAdmin == 1}">
                                        <div class="main-menu primary-menu">

                                            <nav>                                            
                                                <ul>
                                                    <li><a href="#"><i class="fas fa-user-shield"></i>Admin</a>
                                                        <ul class="dropdown primary-dropdown">
                                                            <li><a href="managerProduct.jsp"><i class="fas fa-tasks"></i>Quản Lý Sản Phẩm </a></li>
                                                            <li><a href="#"><i class="fas fa-users"></i>Quản lý người dùng</a></li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </nav>
                                        </div>
                                    </c:if>

                                    <!-- User Account Area End Here -->
                                </div>
                            </div>
                            <!-- Header Right Area End Here -->
                            <!-- Begin Mobile Menu Area -->
                            <div class="mobile-menu-area d-lg-none d-xl-none col-12">
                                <div class="mobile-menu">
                                    <nav>
                                        <ul>
                                            <li class="active"><a href="index.jsp.html">Home</a>
                                                <!-- Begin Dropdown Menu Area -->
                                                <ul class="dropdown">
                                                    <li><a href="index.jsp.html">Home Shop 1</a></li>
                                                    <li><a href="index-2.html">Home Shop 2</a></li>
                                                    <li><a href="index-3.html">Home Shop 3</a></li>
                                                </ul>
                                                <!-- Dropdown Menu Area End Here -->
                                            </li>
                                            <li><a href="shop.html">Shop</a>
                                                <!-- Begin Megamenu Area -->
                                                <ul class="dropdown megamenu">
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Shop Grid Pages</a></h3>
                                                        <ul>
                                                            <li><a href="shop-3-column.html">Shop Three Column</a></li>
                                                            <li><a href="shop-4-column.html">Shop Four Column</a></li>
                                                            <li><a href="shop-left-sidebar.html">Shop Left Sidebar</a></li>
                                                            <li><a href="shop-right-sidebar.html">Shop Right Sidebar</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Shop List Pages</a></h3>
                                                        <ul>
                                                            <li><a href="shop-list.html">Shop List</a></li>
                                                            <li><a href="shop-list-left-sidebar.html">Shop List Left Sidebar</a></li>
                                                            <li><a href="shop-list-right-sidebar.html">Shop List Right Sidebar</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Product Types</a></h3>
                                                        <ul>
                                                            <li><a href="product-details.html">Product Details</a></li>
                                                            <li><a href="product-details-reverse.html">Product Details Reverse</a></li>
                                                            <li><a href="product-details-2.html">Product Details-2</a></li>
                                                            <li><a href="product-details-2-reverse.html">Product Details 2 Reverse</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                </ul>
                                                <!-- Megamenu Area End Here -->
                                            </li>
                                            <li><a href="blog.html">Blog</a>
                                                <!-- Begin Megamenu Area -->
                                                <ul class="dropdown megamenu megamenu-3">
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Blog Layouts</a></h3>
                                                        <ul>
                                                            <li><a href="blog-none-sidebar.html">Blog None Sidebar</a></li>
                                                            <li><a href="blog-left-sidebar.html">Blog left Sidebar</a></li>
                                                            <li><a href="blog-right-sidebar.html">Blog Right Sidebar</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Blog Details</a></h3>
                                                        <ul>
                                                            <li><a href="blog-details-none-sidebar.html">Blog Details None Sidebar</a></li>
                                                            <li><a href="blog-details-left-sidebar.html">Blog Details Left Sidebar</a></li>
                                                            <li><a href="blog-details-right-sidebar.html">Blog Details Right Sidebar</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                    <!-- Begin Megamenu List Area -->
                                                    <li>
                                                        <h3 class="megamenu-title"><a href="#">Blog Format</a></h3>
                                                        <ul>
                                                            <li><a href="blog-image-format.html">Blog Image Format</a></li>
                                                            <li><a href="blog-gallery-format.html">Blog Gallery Format</a></li>
                                                            <li><a href="blog-video-format.html">Blog Video Format</a></li>
                                                            <li><a href="blog-audio-format.html">Blog Audio Format</a></li>
                                                        </ul>
                                                    </li>
                                                    <!-- Megamenu List Area End Here -->
                                                </ul>
                                                <!-- Megamenu Area End Here -->
                                            </li>
                                            <li><a href="#">Pages</a>
                                                <!-- Begin Dropdown Menu Area -->
                                                <ul class="dropdown">
                                                    <li><a href="login-register.html">My Account</a></li>
                                                    <li><a href="wishlist.html">Wishlist</a></li>
                                                    <li><a href="shopping-cart.html">Shopping Cart</a></li>
                                                    <li><a href="checkout.html">Checkout</a></li>
                                                    <li><a href="about-us.html">About Us</a></li>
                                                    <li><a href="services.html">Services</a></li>
                                                    <li><a href="faq.jsp">FAQ</a></li>
                                                    <li><a href="404.html">Error 404</a></li>
                                                </ul>
                                                <!-- Dropdown Menu Area End Here --> 
                                            </li>
                                            <li><a href="portfolio.html">Portfolio</a>
                                                <!-- Begin Dropdown Menu Area -->
                                                <ul class="dropdown">
                                                    <li><a href="portfolio-colums-3.html">Portfolio Columns 3</a></li>
                                                </ul>
                                                <!-- Dropdown Menu Area End Here -->
                                                <!-- Dropdown Menu Area End Here --> 
                                            </li>
                                            <li><a href="contact-us.html">Contact Us</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <!-- Mobile Menu Area End Here -->
                        </div>
                    </div>
                </div>
                <!-- Main Header Area End Here -->
            </header>
</html>