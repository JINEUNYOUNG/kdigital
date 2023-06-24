<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>

    <title>PICOK</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- 부트스트랩 외 아이콘 -->
    <link rel="stylesheet" href="/picok_project/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/picok_project/assets/css/templatemo.css">
    <link rel="stylesheet" href="/picok_project/assets/css/custom.css">
    <link rel="stylesheet" href="/picok_project/assets/css/fontawesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">

</head>


<body>
<!-- 헤더 include -->
   <jsp:include page="../common/header.jsp"></jsp:include>

	<!-- 배너 -->
    <section class="bg-success py-5">
        <div class="container">
            <div class="row align-items-center py-5">
                <div class="col-md-8 text-white">
                    <h1>About Us</h1>
                    <p>
                        우리 사이트는 어쩌구저쩌구 우리 사이트는 어쩌구저쩌구 우리 사이트는 어쩌구저쩌구 우리 사이트는 어쩌구저쩌구 <br/>
                        
                    </p>
                </div>
                <div class="col-md-4">
                    <img src="/picok_project/assets/img/about-hero.svg" alt="About Hero">
                </div>
            </div>
        </div>
    </section>
    <!-- 배너끝 -->

    <!-- Start Section -->
    <section class="container py-5">
        <div class="row text-center pt-5 pb-3">
            <div class="col-lg-6 m-auto">
                <h1 class="h1">Our Services</h1>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    Lorem ipsum dolor sit amet.
                </p>
            </div>
        </div>
        <div class="row">

            <div class="col-md-6 col-lg-3 pb-5">
                <div class="h-100 py-5 services-icon-wap shadow">
                    <div class="h1 text-info text-center"><i class="fa fa-truck fa-lg"></i></div>
                    <h2 class="h5 mt-4 text-center">Delivery Services</h2>
                </div>
            </div>

            <div class="col-md-6 col-lg-3 pb-5">
                <div class="h-100 py-5 services-icon-wap shadow">
                    <div class="h1 text-info text-center"><i class="fas fa-exchange-alt"></i></div>
                    <h2 class="h5 mt-4 text-center">Shipping & Return</h2>
                </div>
            </div>

            <div class="col-md-6 col-lg-3 pb-5">
                <div class="h-100 py-5 services-icon-wap shadow">
                    <div class="h1 text-info text-center"><i class="fa fa-percent"></i></div>
                    <h2 class="h5 mt-4 text-center">Promotion</h2>
                </div>
            </div>

            <div class="col-md-6 col-lg-3 pb-5">
                <div class="h-100 py-5 services-icon-wap shadow">
                    <div class="h1 text-info text-center"><i class="fa fa-user"></i></div>
                    <h2 class="h5 mt-4 text-center">24 Hours Service</h2>
                </div>
            </div>
        </div>
    </section>
    <!-- End Section -->


 <!-- 푸터 include -->
   <jsp:include page="../common/footer.jsp"></jsp:include>
 

    <!-- Start Script -->
	<script src="https://kit.fontawesome.com/a5f5e6fa14.js" crossorigin="anonymous"></script>
    <script src="/picok_project/assets/js/jquery-1.11.0.min.js"></script>
    <script src="/picok_project/assets/js/jquery-migrate-1.2.1.min.js"></script>
    <script src="/picok_project/assets/js/bootstrap.bundle.min.js"></script>
    <script src="/picok_project/assets/js/templatemo.js"></script>
    <script src="/picok_project/assets/js/custom.js"></script>
    <!-- End Script -->
</body>

</html>