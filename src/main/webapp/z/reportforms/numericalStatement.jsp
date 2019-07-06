<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



    <title>统计报表</title>
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
    
    <style>

        .carA{
            position: relative;/*定位方式为相对定位,相对于默认文档流的位置来进行定位*/

            left: 800px;
        }

        .carB{
            position: absolute;/*定位方式为相对定位,相对于默认文档流的位置来进行定位*/

            left: 900px;
        }
        
        
        #main{
              margin: auto;
        }
        
         #aa{
              margin: auto;
        }
    </style>
    
    
    <script src="z/js/echarts.js"></script>
    <script src="z/js/jquery-2.1.4.js"></script> 
    

    
    
    
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
                        <a href="z/dispatch/dispatchDetails.jsp">派遣详情</a>
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
            <h2 class="main-title-w3layouts mb-2 text-center">统计报表</h2>
            <!--// main-heading -->

            <div class="container-fluid">
                <div class="row">
                    <!-- Stats -->
                    <div class="outer-w3-agile col-xl">
                        <div class="work-progres">
                            <h4 class="tittle-w3-agileits mb-4">报表展示</h4>
                            <hr>
                            <div class="table-responsive">
                                <table class="table table-hover">
                                <tr>
                                 <div id="main" style="width: 500px;height:400px;"></div>
 <script type="text/javascript">
   $(function () {
    	$.getJSON("numericalStatement.lovo",show);	
    });
   function show(data)
   {
	   var a1=new Array(data.length-1);
	   var b1=new Array(data.length-1);
	   $.each(data, function(i,e){
  	 	/* if(i==(data.a.length-1))
   		{
  	 		sth+='"'+e.type+'"';
  	 	}
   		else
   		{
   			sth+='"'+e.type+'"'+","
  	 	} */
		   a1[i]=e.eventName;
  	 	
	  });
  	 	$.each(data, function(i1,e1){
  	  /* 	if(i1==(data.b.length-1))
  	   	{
  	  		 sth2+=e1;
  	   	}
  	   else
  	   	{
  	   	    sth2+=e1+",";
  	   	} */
  	 		b1[i1]=e1.numberpeople;
  	
  	 });
/* 	   alert(sth);
 */        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '事件区域条形图'
            },
            tooltip: {},
            legend: {
                data:['事件派出人员数量']
            },
            xAxis: {
                data: a1
            },
            yAxis: {},
            series: [{
                name: '事件派出人员数量',
                type: 'bar',
                data: b1
                
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        }
    </script>
    </tr>
                                </table>
                                
                                <table>
                                
                                
                                 <tr>
                                 <div id="aa" style="width: 500px;height:400px;"></div>
 <script type="text/javascript">
   $(function () {
    	$.getJSON("numericalStatement.lovo",aa);	
    });
   function aa(data)
   {
	   var a1=new Array(data.length-1);
	   var b1=new Array(data.length-1);
	   $.each(data, function(i,e){
  	 	/* if(i==(data.a.length-1))
   		{
  	 		sth+='"'+e.type+'"';
  	 	}
   		else
   		{
   			sth+='"'+e.type+'"'+","
  	 	} */
		   a1[i]=e.eventName;
	  });
  	 	$.each(data, function(i1,e1){
  	  /* 	if(i1==(data.b.length-1))
  	   	{
  	  		 sth2+=e1;
  	   	}
  	   else
  	   	{
  	   	    sth2+=e1+",";
  	   	} */
  	 		b1[i1]=e1.carnumber;
  	
  	 });
/* 	   alert(sth);
 */        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('aa'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '事件区域条形图'
            },
            tooltip: {},
            legend: {
                data:['事件派出车辆数量']
            },
            xAxis: {
                data: a1
            },
            yAxis: {},
            series: [{
                name: '事件派出车辆数量',
                type: 'bar',
                data: b1
                
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        }
    </script>
    </tr>
                                
                                
                                </table>
                                
                                
                            </div>
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