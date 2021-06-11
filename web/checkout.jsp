<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <li><a href="index.jsp.html">Home</a></li>
                            <li><a href="shop.html">Shop</a></li>
                            <li class="active"><a href="checkout.html">Thanh toán</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Page Banner Area End Here -->
            <!--Checkout Area Strat-->
            <div class="checkout-area pt-100 pb-70">
                <div class="container" style="margin-top: 5rem">
            <div class="row">
                <div class="col-md-8" style="border: 1px solid #ced4da;border-radius: 5px !important">
                    <h4 class="mt-3">List of Product</h4>
                    <table class="w-100 table table-striped mt-3">   
                        <tr>
                            <th>STT</th>
                            <th>Image</th>
                            <th>Name of Product</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total Price</th>
                        </tr>
                        <c:forEach items="${listCart}" var="c">
                            <tr>
                                <td>${c.productId}</td>
                                <td>
                                    <img src="${c.productImg}" style="width: 100px">
                                </td>
                                <td>${c.productName}</td>
                                <td>
                                    <fmt:formatNumber type="currency" value="${c.productPrice}"/>
                                </td>
                                <td>
                                    ${c.quantity}
                                </td>
                                <td>
                                    <fmt:formatNumber type="currency" value="${c.quantity*c.productPrice}"/>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                    <hr/>
                    <div class="text-right">
                        <h4>Total money:<fmt:formatNumber type="currency" value="${totalMoney}"/></h4>
                    </div>
                </div>
                <div class="col-md-4 pl-5" style="border: 1px solid #ced4da;border-radius: 5px !important;">
                    <h3 class="mt-3" style="color: orange">Infomation of Customer</h3>
                    <div class="card mt-3">
                        <div class="card-body">
                            <form action="checkout" method="post">
                                <div class="form-group">
                                    <label for="name">Full Name</label>
                                    <input type="text" name="name" class="form-control" placeholder="Enter name" required>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                <div class="form-group">
                                    <label for="sdt">Phone number</label>
                                    <input type="number" name="phone" class="form-control" placeholder="enter phone number" required>
                                </div>
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <textarea class="form-control" rows="3" name="address" required></textarea>
                                </div>
<!--                                <div class="form-group">
                                    <label for="note">Note</label>
                                    <textarea class="form-control" rows="3" name="note"></textarea>
                                </div>-->

                                <button type="submit" class="btn btn-success w-100">Accept</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
            </div>
            <!--Checkout Area End-->
            <!-- Begin Footer Area -->
        </body>
    <jsp:include page="/include/footer.jsp"></jsp:include>
</html>