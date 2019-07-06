<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>资源详情</title>
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
    
     <script src="../js/jquery-2.1.4.js"></script> 
    
     <script type="text/javascript">
 	$(function() {
		
		$.getJSON("../../StockNumber/StockNumber.lovo", {
			
		}, findMouseData);
		
	
	});
 
function findMouseData(data) {
	var $table = $("#table");
	$table.empty();
	var head = "<tr><td>人员数量</td><td>车辆数量</td><td>可用人员</td><td>可用车辆</td></tr>";
	$table.append(head);

	$.each(data, function(i, e) {
		var otalCar = e.otalCar;
		var totalPerson = e.totalPerson;
		var useCar = e.useCar;
		var usePerson = e.usePerson;
		

		var tr = "<tr><td>"+
		totalPerson + "</td><td>" + otalCar + "</td><td>"+usePerson+"</td><td>"+useCar+"</td></tr>";
		$table.append(tr);
	});
	$("input[name=currPage]").val(data.currPage);
	$("input[name=totalPage]").val(data.totalPage);
	/* $("#span").html("第" + data.currPage + "页,共" + data.totalPage + "页") */
};
    
    
    
</script> 
    
    
    
    
    
    
    <style>

        .carA{
            position: relative;/*定位方式为相对定位,相对于默认文档流的位置来进行定位*/

            left: 800px;
        }

        .carB{
            position: absolute;/*定位方式为相对定位,相对于默认文档流的位置来进行定位*/

            left: 900px;
        }
    </style>
    <!-- //Meta Tags -->

    <!-- Style-sheets -->
    <!-- Bootstrap Css -->
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Bootstrap Css -->
    <!-- Common Css -->
    <link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--// Common Css -->
    <!-- Nav Css -->
    <link rel="stylesheet" href="../css/style4.css">
    <!--// Nav Css -->
    <!-- widgets Css -->
    <link href="../css/widgets.css" rel="stylesheet">
    <!-- widgets Css -->
    <!-- Fontawesome Css -->
    <link href="../css/fontawesome-all.css" rel="stylesheet">
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
                <a href="../hospital.jsp">医院管理系统</a>
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
                        <a href="../eventMaintenance/eventMaintenance.jsp">事件维护</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="../reportforms/numericalStatement.jsp">

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
                        <a href="resourceDetails.jsp">资源详情</a>
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
                        <a href="../dispatch/dispatchDetails.jsp">派遣详情</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="../usermanagement/userManagement.jsp">

                    用户管理
                </a>
            </li>
        </ul>
    </nav>
        <!-- Page Content Holder -->
        <div id="content">
            <!-- top-bar -->

            <!--// top-bar -->

            <!-- main-heading -->
            <h2 class="main-title-w3layouts mb-2 text-center">资源详情</h2>
            <!--// main-heading -->

            <div class="container-fluid">
                <div class="row">
                    <!-- Stats -->
                    <div class="outer-w3-agile col-xl">
                        <div class="work-progres">
                            <h4 class="tittle-w3-agileits mb-4">资源展示表</h4>
                            <hr>
                            <div class="table-responsive">
                                <table id="table"  class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>人员数量</th>
                                            <th>车辆数量</th>
                                            <th>可派人数</th>
                                            <th>可派车辆</th>
                                        </tr>
                                    </thead>

                                    </tbody>
                                </table>
								
                            </div>
                        </div>
                    </div>

                    <div class="modal-content">

                        <div class="modal-header">
                            <button  class="carA" type="button"><a href="carManagement.jsp" >车辆管理</a></button>


                            <button  class="carB" type="button"><a href="doctorManagement.jsp" >医生管理</a></button>

                           </div>
                        </div>







                    <!--// Stats -->
                    <!-- Pie-chart -->



    <!-- Required common Js -->
    <script src='../js/jquery-2.2.3.min.js'></script>
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

    <!-- Weather-skycons-icons -->
    <script src="../js/skycons.js"></script>
    <script>
        var icons = new Skycons({
                "color": "#FFD700"
            }),
            list = [
                "clear-day"
            ],
            i;

        for (i = list.length; i--;)
            icons.set(list[i], list[i]);

        icons.play();
    </script>
    <script>
        var icons = new Skycons({
                "color": "#f5f5f5"
            }),
            list = [
                "clear-night", "partly-cloudy-day",
                "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
                "fog"
            ],
            i;

        for (i = list.length; i--;)
            icons.set(list[i], list[i]);

        icons.play();
    </script>
    <!--// Weather-skycons-icons -->

    <!-- Js for bootstrap working-->
    <script src="../js/bootstrap.min.js"></script>
    <!-- //Js for bootstrap working -->

</body>

</html>