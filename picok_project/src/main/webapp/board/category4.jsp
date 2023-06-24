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

    <!-- 우측 상단 아이콘 --> 
    <div class="modal fade bg-white" id="templatemo_search" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="w-100 pt-1 mb-5 text-right">
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="" method="get" class="modal-content modal-body border-0 p-0">
                <div class="input-group mb-2">
                    <input type="text" class="form-control" id="inputModalSearch" name="q" placeholder="Search ...">
                    <button type="submit" class="input-group-text bg-success text-light">
                        <i class="fa fa-fw fa-search text-white"></i>
                    </button>
                </div>
            </form>
        </div>
    </div>
    <!-- 우측 상단 아이콘 끝  --> 

    <!-- 좌측 메뉴 -->
    <div class="container py-5">
        <div class="row">

            <div class="col-lg-3">
                <h1 class="h2 pb-4">Category4</h1>
                <ul class="list-unstyled templatemo-accordion">
                    <li class="pb-3">
                        <a class="collapsed d-flex justify-content-between h4 text-decoration-none" href="#">
                           Latest
                            <i class="fa fa-fw fa-chevron-circle-right mt-1"></i>
                        </a>
                       
                    </li>
                    <li class="pb-3">
                        <a class="collapsed d-flex justify-content-between h4 text-decoration-none" href="#">
                            Popular
                            <i class="pull-right fa fa-fw fa-chevron-circle-right mt-1"></i>
                        </a>
                    </li>
                </ul>
            </div>
     <!-- 좌측 메뉴 끝  -->
     
     <!-- 게시판 -->
		<!-- 게시글 하나  -->
            <div class="col-lg-9">
                <div class="row">
                    <div class="col-md-6">
                        <ul class="list-inline shop-top-menu pb-3 pt-1">
                            <li class="list-inline-item">
                            </li>
                            <li class="list-inline-item">
                            </li>
                            <li class="list-inline-item">
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-4 product-wap rounded-0">
                            <div class="card rounded-0">
                                <img class="card-img rounded-0 img-fluid" src="/picok_project/assets/img/shop_01.jpg">
                                <div class="card-img-overlay rounded-0 product-overlay d-flex align-items-center justify-content-center">
                                    <ul class="list-unstyled">
                                    </ul>
                                </div>
                            </div>
                            <div class="card-body">
                                <a href="board-single.jsp" class="h3 text-decoration-none">게시글 제목</a>
                                <ul class="w-100 list-unstyled d-flex justify-content-between mb-0">
                                    <li>짧은 내용글!</li>
                                    <li class="pt-2">
                                        <span class="product-color-dot color-dot-red float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-blue float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-black float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-light float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-green float-left rounded-circle ml-1"></span>
                                    </li>
                                </ul>
                                <ul class="list-unstyled d-flex justify-content-right mb-1">
                                    <li>
                                        
                                    </li>
                                </ul>
									<p class="text-end mb-0"><i class="text-warning fa fa-thumbs-up fa-2x"></i></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 product-wap rounded-0">
                            <div class="card rounded-0">
                                <img class="card-img rounded-0 img-fluid" src="/picok_project/assets/img/shop_01.jpg">
                                <div class="card-img-overlay rounded-0 product-overlay d-flex align-items-center justify-content-center">
                                    <ul class="list-unstyled">
                                    </ul>
                                </div>
                            </div>
                            <div class="card-body">
                                <a href="board-single.jsp" class="h3 text-decoration-none">게시글 제목</a>
                                <ul class="w-100 list-unstyled d-flex justify-content-between mb-0">
                                    <li>짧은 내용글!</li>
                                    <li class="pt-2">
                                        <span class="product-color-dot color-dot-red float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-blue float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-black float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-light float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-green float-left rounded-circle ml-1"></span>
                                    </li>
                                </ul>
                                <ul class="list-unstyled d-flex justify-content-right mb-1">
                                    <li>
                                        
                                    </li>
                                </ul>
									<p class="text-end mb-0"><i class="text-warning fa fa-thumbs-up fa-2x"></i></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 product-wap rounded-0">
                            <div class="card rounded-0">
                                <img class="card-img rounded-0 img-fluid" src="/picok_project/assets/img/shop_01.jpg">
                                <div class="card-img-overlay rounded-0 product-overlay d-flex align-items-center justify-content-center">
                                    <ul class="list-unstyled">
                                    </ul>
                                </div>
                            </div>
                            <div class="card-body">
                                <a href="board-single.jsp" class="h3 text-decoration-none">게시글 제목</a>
                                <ul class="w-100 list-unstyled d-flex justify-content-between mb-0">
                                    <li>짧은 내용글!</li>
                                    <li class="pt-2">
                                        <span class="product-color-dot color-dot-red float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-blue float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-black float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-light float-left rounded-circle ml-1"></span>
                                        <span class="product-color-dot color-dot-green float-left rounded-circle ml-1"></span>
                                    </li>
                                </ul>
                                <ul class="list-unstyled d-flex justify-content-right mb-1">
                                    <li>
                                        
                                    </li>
                                </ul>
									<p class="text-end mb-0"><i class="text-warning fa fa-thumbs-up fa-2x"></i></p>
                            </div>
                        </div>
                    </div>
                    </div>
 				<!-- 페이징 -->
                <div div="row">
                    <ul class="pagination pagination-lg justify-content-end">
                        <li class="page-item disabled">
                            <a class="page-link active rounded-0 mr-3 shadow-sm border-top-0 border-left-0" href="#" tabindex="-1">1</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link rounded-0 mr-3 shadow-sm border-top-0 border-left-0 text-dark" href="#">2</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link rounded-0 shadow-sm border-top-0 border-left-0 text-dark" href="#">3</a>
                        </li>
                    </ul>
                </div>
                <!-- 페이징 끝  -->
            </div>
        </div>
    </div>
    <!-- 게시판 끝 -->

   
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