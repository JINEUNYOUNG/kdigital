<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <!-- 헤더 -->
    <nav class="navbar navbar-expand-lg navbar-light shadow">
       <div class="container d-flex justify-content-between align-items-center">
   			 <a class="navbar-brand text-info logo h1 align-self-center" href="/picok_project/index.jsp">
                Picok
            </a>

            <button class="navbar-toggler border-0" type="button" data-bs-toggle="collapse" data-bs-target="#templatemo_main_nav" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between" id="templatemo_main_nav">
                <div class="flex-fill">
                    <ul class="nav navbar-nav d-flex justify-content-between mx-lg-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="/picok_project/board/category1.jsp">Category1</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/picok_project/board/category1.jsp">Category2</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/picok_project/board/category1.jsp">Category3</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/picok_project/board/category1.jsp">Category4</a>
                        </li>
                    </ul>
                </div>
                <div class="navbar align-self-center d-flex">
                    <div class="d-lg-none flex-sm-fill mt-3 mb-4 col-7 col-sm-auto pr-3">
                        <div class="input-group">
                            <input type="text" class="form-control"  placeholder="write">
                            <div class="input-group-text">
                                <i class="fa fa-fw fa-pencil-square-o" aria-hidden="true"></i>
                            </div>
                        </div>
                    </div>
                    <a class="nav-icon position-relative text-decoration-none" href="#">
                        <i class="fa fa-fw fa-pencil-square-o text-dark mr-3"></i>
                    </a>
                    <a class="nav-icon position-relative text-decoration-none" href="#">
                        <i class="fa fa-fw fa-user text-dark mr-3"></i>
                    </a>
                </div>
            </div>

        </div>
    </nav>
    <!-- 헤더끝 -->
    
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

</body>
</html>