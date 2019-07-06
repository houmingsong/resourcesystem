<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>资源派遣</title>
     <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
    <!-- Meta Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="" />
    <!-- Required common Js -->
    <script src='z/js/jquery-2.2.3.min.js'></script>
    <script src="z/js/jquery-2.1.4.js"></script>
    <!-- //Required common Js -->
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
        $(function(){
        	$.getJSON("finda.lovo",function(data){
        		var str ="";
        	
        		$.each(data,function(i,n){
        			str =str+ "<option value="+n.inventoriesId+">"+n.name+"</option>";
        			var s = str;
        			$("#left").empty();
        			$("#left").append(str);
        			$("#boss").empty();
        			$("#boss").append(s);
        		});
        	});
        	$("#sub").click(function(){
        		
        		if($("#right option").length==0){
        			$("#aaaa").html("派遣人数不能为空");
        			setTimeout(function(){
        				$("#aaaa").html("");
        			},3000);
        			return false;
        		}
        		if($("#y option").length==0){
        			$("#aaaa").html("派遣车辆不能为空");
        			setTimeout(function(){
        				$("#aaaa").html("");
        			},3000);
        			return false;
        		}
        		return true;
        		
        	});
        	$.getJSON("findcar.lovo",function(data){
        		var str ="";
        		$.each(data,function(i,n){
        			str =str+ "<option value="+n.resourceStocks+">"+n.plateNumber+"</option>";
        			$("#z").empty();
        			$("#z").append(str);
        		});
        	});
            $("input[class=qbyy1]").click(function(){
                $("#right").append($("#left option"));
                $("#right option").attr("selected","selected");
            });

            $("input[class=yy1]").click(function(){
                $("#right").append($("#left option:selected"));
               
            });

            $("input[class=zy1]").click(function(){
                $("#left").append($("#right option:selected"));
              
            });

            $("input[class=qbzy1]").click(function(){
                $("#left").append($("#right option"));
                
            });




            $("input[class=qbyy2]").click(function(){
                $("#y").append($("#z option"));
                $("#y option").attr("selected","selected");
            });

            $("input[class=yy]").click(function(){
                $("#y").append($("#z option:selected"));
                
            });

            $("input[class=zy]").click(function(){
                $("#z").append($("#y option:selected"));
                
            });

            $("input[class=qbzy2]").click(function(){
                $("#z").append($("#y option"));
                
            });

        });
    </script>
    <style>
    	#aaaa{
    	  color:red;
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
            <h2 class="main-title-w3layouts mb-2 text-center">事件维护</h2>
            <!--// main-heading -->

            <div class="container-fluid">
                <div class="row">
                    <!-- Stats -->
                    <div class="outer-w3-agile col-xl">
                        <div class="work-progres">
                            <h4 class="tittle-w3-agileits mb-4">队伍派遣</h4>
                            <div class="table-responsive">
                                    <!-- Tables content -->
                                        <!-- table1 -->
                                <form role="form" action="showteam.lovo" >
                                        <div class="outer-w3-agile mt-3">
                                            <span>事件编号：${a.id }</span> <span id="aaaa"></span>
                                             <input type="hidden" name="sjbh" value="${a.eventSourceId }" ><br>
                                            <span>事件名称：${a.eventName }</span>
                                            </tbody><br>

                                           请选择派遣人员: <select id="left"  multiple style="width: 100px;height: 150px">
                                                
                                            </select>

                                            <select  id="right" name="kk" style="width: 75px; height: 150px" multiple>
                                            </select>
                                            <br>
                                            <input type="button" class="qbzy1" value="全部左移" >
                                            <input type="button" class="zy1" value="左移">
                                            <input type="button" class="yy1" value="右移">
                                            <input type="button" class="qbyy1" value="全部右移" ><br><br>

                                                请选择派遣车辆:<select id="z"  multiple style="width: 100px;height: 150px">
                                            </select>

                                            <select  id="y" name="oo" style="width: 75px; height: 150px" multiple>
                                            </select>
                                            <br>
                                            <input type="button" class="qbzy2" value="全部左移" >
                                            <input type="button" class="zy" value="左移">
                                            <input type="button" class="yy" value="右移">
                                            <input type="button" class="qbyy2" value="全部右移" ><br><br>


                                                                                                                    负责人：<select id="boss" name="boss">
                                            </select><br>

                                            <input type="submit" value="派遣"  id="sub">
                                            <a href="z/eventMaintenance/eventMaintenance.jsp"><button type="button">返回</button></a>
                               </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <!--// Stats -->
                    <!-- Pie-chart -->





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