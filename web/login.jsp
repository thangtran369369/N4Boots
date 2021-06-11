<jsp:include page="/include/header.jsp"></jsp:include>

            <!-- Header Area End Here -->
            <!-- Begin Page Banner Area -->
            <div class="page-banner">
                <div class="container">
                    <div class="page-banner-content">
                        <ul>
                            <li><a href="Home">Trang chủ</a></li>
                            <li class="active"><a href="login.jsp">Login</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Page Banner Area End Here -->
            <!--Login Register Area Strat-->
            <div class="login-register-area pt-80 pb-95">
                <div class="container">
                    <div class="row">
                        <!--Login Form Start-->
                        <div class="col-md-6 col-sm-6">
                            <div class="customer-login-register">
                                <div class="form-login-title">
                                    <h2>Đăng nhập</h2>
                                      <p class="text-danger">${mess}</p>      

                                </div>
                                <div class="login-form">
                                    <form action="login" method="post">
                                        <div class="form-fild">
                                            <label>Username <span class="required">*</span></label>
                                            <input name="username" value="${username}" type="text">
                                        </div>
                                        <div class="form-fild">
                                            <label>Password <span class="required">*</span></label>
                                            <input name="password" value="${password}" type="password">
                                        </div>
                                        <div class="login-submit">
                                            <button type="submit" class="form-button">Login</button>
                                            <label>
                                                <input class="checkbox" name="remember" value="" type="checkbox">
                                                <span>Remember me</span>
                                            </label>
                                        </div>
                                      </form>
                                </div>
                            </div>
                        </div>
                   
                    </div> 
                </div>
            </div>
            <!--Login Register Area End-->
            <!-- Begin Footer Area -->
<jsp:include page="/include/footer.jsp"></jsp:include>
