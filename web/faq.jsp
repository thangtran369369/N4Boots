<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
<jsp:include page="/include/header.jsp"></jsp:include>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
            <!-- Header Area End Here -->
            <!-- Begin Page Banner Area -->
            <div class="page-banner mb-20">
                <div class="container">
                    <div class="page-banner-content">
                        <ul>
                            <li><a href="Home">Trang chủ</a></li>
                            <li class="active"><a href="faq.jsp">FAQ</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Page Banner Area End Here -->
            <!-- Begin Frequently Area -->
            <div class="frequently-area pt-80 pb-90">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="frequently-content">
                                <div class="frequently-desc">
				<h4><span>FAQ - Câu Hỏi Thường Gặp</span></h4>
                                </div>
                            </div>
                            <!-- Begin Frequently Accordin -->
                            <div class="frequently-accordion">
                                <div id="accordion">
                                   <div class="card">
                                    <div class="card-header" id="headingOne">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                                       Làm thế nào để đăng ký tài khoản?
                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                                      <div class="card-body">
                                     1. Nhấn vào <a href="register.jsp" style="color: red" >đây</a> để tiến hành đăng ký tài khoản. <br>
                                     2. Điền tên đăng nhập, mật khẩu và xác nhận mật khẩu. <br> 
                                     3. Nhấn vào nút đăng ký để hoàn tất.
                                      </div>
                                    </div>
                                  </div>
                                  <div class="card">
                                    <div class="card-header" id="headingTwo">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                       Làm thế nào để đăng nhập?

                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                                      <div class="card-body">
                                     1. Nhấn vào <a href="login.jsp" style="color: red" >đây</a> để tiến hành đăng nhập tài khoản. <br>
                                     2. Điền tên đăng nhập, mật khẩu. <br> 
                                     3. Nhấn vào nút đăng ký để hoàn tất.
                                      </div>
                                    </div>
                                  </div>
                                  <div class="card">
                                    <div class="card-header" id="headingThree">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                      Các phương thức thanh toán
                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                                      <div class="card-body">
                                          1.Thanh toán lúc đặt hàng(không bắt buộc).<br>    
                                      2.Thanh toán lúc nhận hàng.
                                      </div>
                                    </div>
                                  </div>
                                  <div class="card">
                                    <div class="card-header" id="headingFour">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                         Nếu hàng đã chuyển nhưng không vừa ý?
                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordion">
                                      <div class="card-body">
                                        Nếu sản phẩm đã nhận không vừa ý, khách hàng sẽ trả phí vận chuyển và hoàn về cho Shop.

                                      </div>
                                    </div>
                                  </div>
                                  <div class="card">
                                    <div class="card-header" id="headingFive">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
                                        Làm thế nào để hủy đơn hàng?

                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseFive" class="collapse" aria-labelledby="headingFive" data-parent="#accordion">
                                      <div class="card-body">
                                      Khách hàng có thể hủy đơn khi đơn hàng chưa được giao đi. Liên hệ: 091 785 2836  để hủy hàng
                                      </div>
                                    </div>
                                  </div>
                                  <div class="card">
                                    <div class="card-header" id="headingSix">
                                      <h5 class="mb-0">
                                        <a class="collapsed" data-toggle="collapse" data-target="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
                                        Tôi muốn biết thời gian giao hàng
                                        </a>
                                      </h5>
                                    </div>
                                    <div id="collapseSix" class="collapse" aria-labelledby="headingSix" data-parent="#accordion">
                                      <div class="card-body">
                                       Bộ phận CSKH sẽ liên hệ và hẹn thời gian giao hàng ước tính cho quý khách hàng.
                                      </div>
                                    </div>
                                  </div>
                                </div>
                            </div>
                            <!--Frequently Accordin End Here -->
                        </div>
                    </div>
                </div>
            </div>
            <!--Frequently Area End Here -->
            <!-- Begin Footer Area -->
 <jsp:include page="/include/footer.jsp"></jsp:include>
