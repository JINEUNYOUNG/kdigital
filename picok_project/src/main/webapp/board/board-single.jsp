<%@ page language="java" contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <title>Zay Shop - Product Detail Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="/picok_project/assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="/picok_project/assets/img/favicon.ico">

    <link rel="stylesheet" href="/picok_project/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/picok_project/assets/css/templatemo.css">
    <link rel="stylesheet" href="/picok_project/assets/css/custom.css">

    <!-- Load fonts style after rendering the layout styles -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
    <link rel="stylesheet" href="/picok_project/assets/css/fontawesome.min.css">

    <!-- Slick -->
    <link rel="stylesheet" type="text/css" href="/picok_project/assets/css/slick.min.css">
    <link rel="stylesheet" type="text/css" href="/picok_project/assets/css/slick-theme.css">


</head>

<body>    

<!-- 헤더 include -->
   <jsp:include page="../common/header.jsp"></jsp:include>


    <!-- Open Content -->
    <section class="bg-light">
        <div class="container pb-5">
            <div class="row">
                <div class="col-lg-5 mt-5">
                    <div class="card mb-3">
                        <img class="card-img img-fluid" src="/picok_project/assets/img/product_single_10.jpg" alt="Card image cap" id="product-detail">
                    </div>
                    <div class="row">
         
                        <!--Start Carousel Wrapper-->
                        <div id="multi-item-example" class="col-10 carousel slide carousel-multi-item" data-bs-ride="carousel">
                            <!--Start Slides-->
                            <div class="carousel-inner product-links-wap" role="listbox">

                         
                            </div>
                            <!--End Slides-->
                        </div>
                        <!--End Carousel Wrapper-->
                    </div>
                </div>
                <!-- col end -->
                <div class="col-lg-7 mt-5">
                    <div class="card">
                        <div class="card-body">
                            <h1 class="h2">Active Wear</h1>
                            <p class="h3 py-2">$25.00</p>
                            <p class="py-2">
                                <i class="fa fa-thumbs-up text-warning"></i>
                                <span class="list-inline-item text-dark">Rating 4.8 | 36 Comments</span>
                            </p>
                            <ul class="list-inline">
                                <li class="list-inline-item">
                                    <h6>Brand:</h6>
                                </li>
                                <li class="list-inline-item">
                                    <p class="text-muted"><strong>Easy Wear</strong></p>
                                </li>
                            </ul>

                            <h6>Description:</h6>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod temp incididunt ut labore et dolore magna aliqua. Quis ipsum suspendisse. Donec condimentum elementum convallis. Nunc sed orci a diam ultrices aliquet interdum quis nulla.</p>
                            <ul class="list-inline">
                                <li class="list-inline-item">
                                    <h6>Avaliable Color :</h6>
                                </li>
                                <li class="list-inline-item">
                                    <p class="text-muted"><strong>White / Black</strong></p>
                                </li>
                            </ul>

                            <h6>Specification:</h6>
                            <ul class="list-unstyled pb-3">
                                <li>Lorem ipsum dolor sit</li>
                                <li>Amet, consectetur</li>
                                <li>Adipiscing elit,set</li>
                                <li>Duis aute irure</li>
                                <li>Ut enim ad minim</li>
                                <li>Dolore magna aliqua</li>
                                <li>Excepteur sint</li>
                            </ul>

                            <form action="" method="GET">
                                <input type="hidden" name="product-title" value="Activewear">
                                <div class="row">
                                    <div class="col-auto">
                                        <ul class="list-inline pb-3">
                                    
                                        </ul>
                                    </div>
                                    <div class="col-auto">
                                        <ul class="list-inline pb-3">
                             
                                        </ul>
                                    </div>
                                </div>
                                <div class="row pb-3">
                                    <div class="col d-grid">
                                        <button type="submit" class="btn btn-success btn-lg" name="submit" value="buy">인터페이스는</button>
                                    </div>
                                    <div class="col d-grid">
                                        <button type="submit" class="btn btn-success btn-lg" name="submit" value="addtocard">이따생각</button>
                                    </div>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Close Content -->


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