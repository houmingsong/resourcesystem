<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户管理</title>
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



 <script src="z/js/jquery-2.1.4.js"></script> 
    
     <script type="text/javascript">
     $(function() {
    	 var currPage=1;
     
    	$.getJSON("User/User.lovo",{currPage:currPage},data);
		$("button").click(function(){
			var operation = $(this).text();			
		
			if(operation=="查询"){
				var area=$("select[name=area] option:selected").val();
				var type=$("select[name=type] option:selected").val();
				var level=$("select[name=level] option:selected").val();
				var startDate=$("input[name=startDate]").val();
				var endDate=$("input[name=endDate]").val();
				 currPage=1;
				 var select="查询";
	        	$.getJSON("User/User.lovo",{currPage:currPage},data);
			}
			else{
				currPage = parseInt($("span[name=currPage]").text());
				var totalPage = $("span[name=totalPage]").text();
				if (operation == "首页") {
					
					currPage = 1;
				} else if(operation == "上一页"){		
					
					currPage = currPage - 1;
					if(currPage<1){
						currPage=1;
					}
				}
				if(operation == "下一页"){
					
					currPage = currPage + 1;
					if(currPage>totalPage){
						currPage=totalPage;
					}
				} else if(operation == "尾页"){//尾页
					
					currPage = totalPage;
				}	
	        	$.getJSON("User/User.lovo",{currPage:currPage},data);
			}
		});
	});
     function data(data){
            var $table = $("#table");
            $table.empty();
            var head = "<thead><tr><th scope=col>用户</th><th scope=col>性别</th><th scope=col>联系方式</th><th scope=col>操作</th></tr></thead>";
            $table.append(head);
            
            $.each(data.list, function(i, e) {
    		var userName = e.userName;
    		var sex = e.sex;
    		var telephone = e.telephone;
    		var id = e.id
    		
    		var tr = "<tr><td>"+ userName +"</td><td>"+ sex +"</td><td>"+telephone+"<td><a href='User/Userdelect.lovo?id="
			+ id + "'>删除</a>&nbsp;<a href='User/UserRevise.lovo?id="+id+"'>修改<a/></td></tr>";
    		
    		$table.append(tr);
    		});
            // pageNum当前页 pages总页数
            $("span[name=currPage]").text(data.pageNum);
            $("span[name=totalPage]").text(data.pages);
     }

    
    
    
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
    <link href="z/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Bootstrap Css -->
    <!-- Common Css -->
    <link href="z/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--// Common Css -->
    <!-- Nav Css -->
    <link rel="stylesheet" href="z/css/style4.css">
    <!--// Nav Css -->
    <!-- widgets Css -->
    <link href="z/css/widgets.css" rel="stylesheet">
    <!-- widgets Css -->
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
        <div id="content">
            <!-- top-bar -->

            <!--// top-bar -->

            <!-- main-heading -->
            <h2 class="main-title-w3layouts mb-2 text-center">用户管理</h2>
            <!--// main-heading -->

            <div class="container-fluid">
                <div class="row">
                    <!-- Stats -->
                    <div class="outer-w3-agile col-xl">
                        <div class="work-progres">
                            <h4 class="tittle-w3-agileits mb-4">用户展示表</h4>
                            <hr>
                            <div class="table-responsive">
                                <table  id="table" class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>用户名</th>
                                            
                                            <th>操作</th>
                                        </tr>
                                    </thead>

                                    </tbody>
                                </table>
								<button type="button" name="number">首页</button>
                                <button type="button" name="number">上一页</button>
                             
                                <button type="button" name="number">下一页</button>
                                <button type="button" name="number">尾页</button>
                                  第<span name="currPage"></span>页
			                  
			                          共<span  name="totalPage"> </span>页
			                  
			                          
                            </div>
                        </div>
                    </div>

                    <div class="modal-content">

                        <div class="modal-header">
                            <button  class="carA" type="button"><a href="z/usermanagement/userAdd.jsp" >添加用户</a></button>




                        </div>
                    </div>







                    <!--// Stats -->
                    <!-- Pie-chart -->



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
    <script src="z/js/skycons.js"></script>
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
    <script src="z/js/bootstrap.min.js"></script>
    <!-- //Js for bootstrap working -->

</body>

</html>