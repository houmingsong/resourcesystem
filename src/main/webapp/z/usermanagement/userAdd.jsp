<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户添加</title>
    <!-- Meta Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="" />
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
    
    <!-- //Meta Tags -->

    <!-- Style-sheets -->
    <!-- Bootstrap Css -->
    <link href="z/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Bootstrap Css -->
    <!-- Common Css -->
    <link href="z/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--// Common Css -->
    <!-- Nav Css -->
    <link rel="stylesheet" href="z/css/style4.css">
    <!--// Nav Css -->
    <!-- Fontawesome Css -->
    <link href="z/css/fontawesome-all.css" rel="stylesheet">
    <!--// Fontawesome Css -->
    <!--// Style-sheets -->

    <!--web-fonts-->
    <link href="http://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <!--//web-fonts-->
</head>

<body>
<div class="wrapper">
    <!-- Sidebar Holder -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <h1>
                <a href="z/hospital.jsp">医院管理系统</a>
            </h1>

        </div>

        <ul class="list-unstyled components">

            <li>
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    事件维护
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="z/eventMaintenance/eventMaintenance.jsp">事件维护</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="z/reportforms/numericalStatement.jsp">

                    统计报表
                </a>
            </li>

            <li>
                <a href="#pageSubmenu1" data-toggle="collapse" aria-expanded="false">

                    资源管理
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu1">
                    <li>
                        <a href="z/resourcemanagement/resourceDetails.jsp">资源详情</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#pageSubmenu3" data-toggle="collapse" aria-expanded="false">

                    资源调度
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu3">
                    <li>
                        <a href="z/dispatch/dispatchRecovery.jsp">派遣详情</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="z/usermanagement/userManagement.jsp">

                    用户管理
                </a>
            </li>
        </ul>
    </nav>

        <!-- Page Content Holder -->

            <!--// top-bar -->

            <!-- main-heading -->

            <!--// main-heading -->

            <!-- Forms content -->

                <!--// Inline Form -->
                <div class="container-fluid">
                    <div class="row">

                        <!-- Forms-1 -->
                        <div class="outer-w3-agile col-xl mt-3 mr-xl-3">
                            <h4 class="tittle-w3-agileits mb-4">添加用户</h4>
                            <form action="User/UserAdd.lovo" method="post">
                                <div class="form-group row">
                                    <label for="inputEmail3" class="col-sm-2 col-form-label">用户名</label>
                                    <div class="col-sm-10">
                                        <input type="text"  name="userName"  class="form-control" id="inputEmail3"  required="">
                                    </div>
                                    <label for="inputEmail3"   class="col-sm-2 col-form-label">密码</label>
                                    <div class="col-sm-10">
                                        <input type="text"   name="password" class="form-control" id="inputEmail4"  required="">
                                    </div>
                                    <label for="inputEmail3" class="col-sm-2 col-form-label">性别</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="sex" class="form-control" id="inputEmail5"  required="">
                                    </div>
                                    <label for="inputEmail3" class="col-sm-2 col-form-label">生日</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="birthday" class="form-control" id="inputEmail6"  required="">
                                    </div>
                                    
                                    <label for="inputEmail3" class="col-sm-2 col-form-label">电话</label>
                                    <div class="col-sm-10">
                                        <input type="text"  name="telephone" class="form-control" id="inputEmail6"  required="">
                                    </div>

                                    </div>
                                </fieldset>



                                <div class="form-group row">
                                    <div class="col-sm-10">
                                        <button type="submit" class="btn btn-primary">添加</button>
                                    </div>
                                </div>
                            </form>
                        </div>

                <!--// Forms-3 -->
                <!-- Forms-4 -->





    <!-- Required common Js -->
    <script src='z/js/jquery-2.2.3.min.js'></script>
    <!-- //Required common Js -->

    <!-- Sidebar-nav Js -->
    <script>
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>
    <!--// Sidebar-nav Js -->

    <!-- Validation Script -->
   <!--  <script>
        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function () {
            'use strict';

            window.addEventListener('load', function () {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');

                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(添加车辆, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script> -->
    <!--// Validation Script -->

    <!-- dropdown nav -->
    <script>
        $(document).ready(function () {
            $(".dropdown").hover(
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
        });
    </script>
    <!-- //dropdown nav -->

    <!-- Js for bootstrap working-->
    <script src="z/js/bootstrap.min.js"></script>
    <!-- //Js for bootstrap working -->

</body>

</html>