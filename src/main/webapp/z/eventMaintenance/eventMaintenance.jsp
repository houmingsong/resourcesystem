<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>事件维护</title>
<!-- Meta Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="" />
<script>
	addEventListener("load", function() {
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
<link href="z/css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- Bootstrap Css -->
<!-- Common Css -->
<link href="z/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
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
<link href="http://fonts.googleapis.com/css?family=Poiret+One"
	rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"
	rel="stylesheet">
<!--//web-fonts-->

					<!-- Required common Js -->
					<script src='z/js/jquery-2.2.3.min.js'></script>
					<!-- //Required common Js -->

<script type="text/javascript">
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}

	$(function() {
		var currPage = 1;
		$.post("showThing.lovo", {currPage : currPage}, showThing)
		$("input[type=button]").click(function() {
			var operator = this.value;
			currPage = parseInt($("input[name=currPage]").val());
			var totalPage = $("input[name=totalPage]").val();
			if (operator == "首页") {
				currPage = 1;
			} else if (operator == "上一页") {
				currPage = currPage - 1;
			} else if (operator == "下一页") {
				currPage = currPage + 1;
			} else if (operator == "尾页") {
				currPage = totalPage;
			}

			$.post("showThing.lovo", {currPage : currPage}, showThing)});
	});

	function showThing(data) {
		var tr = "<thead><tr>";
		tr += "<th scope='col'>事件编号</th>";
		tr += "<th scope='col'>事件名称</th>"
		tr += "<th scope='col'>派遣车辆数量</th>"
		tr += "<th scope='col'>派遣医生数量</th>"
		tr += "<th scope='col'>事件地址</th>"
		tr += "<th scope='col'>事件状态</th>"
		tr += "<th scope='col'>事件等级</th>"
		tr += "<th scope='col'>操作</th>"
		tr += "</tr></thead>";
		tr += "<tbody>";
		$.each(data.dataList,function(i, u) {
							tr += "<tr>";
							tr += "<td scope='col'>" + u.eventSourceId + "</td>";
							tr += "<td scope='col'>" + u.eventName + "</td>";
							tr += "<td scope='col'>" + u.carnumber + "</td>";
							tr += "<td scope='col'>" + u.numberpeople + "</td>";
							tr += "<td scope='col'>" + u.site + "</td>";
							tr += "<td scope='col'>" + u.state + "</td>";
							tr += "<td scope='col'>" + u.level + "</td>";
							if(u.state!=='处理中' && u.state!=='已处理'){
							tr += "<td scope='col'><a href='addteam.lovo?id="+u.id+""								
									+ "'>派遣</a></td>";
							}
							tr += "</tr></thead>";
						});
		tr += "</tbody>";
		$("#showThing").html(tr);
		$("input[name=currPage]").val(data.currPage);
		$("input[name=totalPage]").val(data.totalPage);
		$("#span").html("第" + data.currPage + "页,共" + data.totalPage + "页")
	};
</script>
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

			<li><a href="#homeSubmenu" data-toggle="collapse"
				aria-expanded="false"> 事件维护 <i
					class="fas fa-angle-down fa-pull-right"></i>
			</a>
				<ul class="collapse list-unstyled" id="homeSubmenu">
					<li><a href="z/eventMaintenance/eventMaintenance.jsp">事件维护</a></li>

				</ul></li>
			<li><a href="z/reportforms/numericalStatement.jsp"> 统计报表 </a></li>

			<li><a href="#pageSubmenu1" data-toggle="collapse"
				aria-expanded="false"> 资源管理 <i
					class="fas fa-angle-down fa-pull-right"></i>
			</a>
				<ul class="collapse list-unstyled" id="pageSubmenu1">
					<li><a href="z/resourcemanagement/resourceDetails.jsp">资源详情</a>
					</li>

				</ul></li>

			<li><a href="#pageSubmenu3" data-toggle="collapse"
				aria-expanded="false"> 资源调度 <i
					class="fas fa-angle-down fa-pull-right"></i>
			</a>
				<ul class="collapse list-unstyled" id="pageSubmenu3">
					<li><a href="z/dispatch/dispatchRecovery.jsp">派遣详情</a></li>

				</ul></li>
			<li><a href="z/usermanagement/userManagement.jsp"> 用户管理 </a></li>
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
							<h4 class="tittle-w3-agileits mb-4">事件展示表</h4>
							<hr>
							<div class="table-responsive">
								<table class="table table-hover" id="showThing">							

								</table>
								<input type="button" value="首页" >
                                <input type="button" value="上一页">
                                <input type="button" value="下一页">
                                <input type="button" value="尾页">
                                <span id="span"></span>
			 					<input type="hidden" name="currPage">
			 					<input type="hidden" name="totalPage">
							</div>
						</div>
					</div>
					<!--// Stats -->
					<!-- Pie-chart -->



					<!-- Sidebar-nav Js -->
					<script>
						$(document).ready(function() {
							$('#sidebarCollapse').on('click', function() {
								$('#sidebar').toggleClass('active');
							});
						});
					</script>
					<!--// Sidebar-nav Js -->

					<!-- dropdown nav -->
					<script>
						$(document).ready(
								function() {
									$(".dropdown").hover(
											function() {
												$('.dropdown-menu', this).stop(
														true, true).slideDown(
														"fast");
												$(this).toggleClass('open');
											},
											function() {
												$('.dropdown-menu', this).stop(
														true, true).slideUp(
														"fast");
												$(this).toggleClass('open');
											});
								});
					</script>
					<!-- //dropdown nav -->

					<!-- Weather-skycons-icons -->
					<script src="z/js/skycons.js"></script>
					<script>
						var icons = new Skycons({
							"color" : "#FFD700"
						}), list = [ "clear-day" ], i;

						for (i = list.length; i--;)
							icons.set(list[i], list[i]);

						icons.play();
					</script>
					<script>
						var icons = new Skycons({
							"color" : "#f5f5f5"
						}), list = [ "clear-night", "partly-cloudy-day",
								"partly-cloudy-night", "cloudy", "rain",
								"sleet", "snow", "wind", "fog" ], i;

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