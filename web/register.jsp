<jsp:include page="/include/header.jsp"></jsp:include>

            <!-- Header Area End Here -->
            <!-- Begin Page Banner Area -->
            <div class="page-banner">
                <div class="container">
                    <div class="page-banner-content">
                        <ul>
                            <li><a href="Home">Home</a></li>
                            <li class="active"><a href="register.jsp">Register</a></li>
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
                            <div class="customer-login-register register-pt-0">
                                <div class="form-register-title">
                                    <h2>Đăng kí</h2>
                                    <p class="text-danger">${mess}</p>  
                                </div>
                                <div class="register-form">
                                    
                                    <form action="signup" method="post">
                                        <div class="form-fild">
                                            <label>Username<span class="required">*</span></label>
                                            <input name="user" value="" type="text">
                                        </div>
                                        
                                       
                                        
                                        <div class="form-fild">
                                            <label>Password <span class="required">*</span></label>
                                            <input name="pass" value="" type="password">
                                        </div>
                                        
                                        <div class="form-fild">
                                            <label>Re-password <span class="required">*</span></label>
                                            <input name="repass" value="" type="password">
                                        </div>
                                        <div class="register-submit">
                                            <button type="submit" class="form-button">Register</button>
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
