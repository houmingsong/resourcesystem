
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<DOCTYPE html>
<html lang="en">
<head>
<title>404 Error Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/z/";
%>
<base href="<%=basePath%>">
<script src='js/jquery-2.2.3.min.js'></script>
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);
	function hideURLbar() {
		window.scrollTo(0, 1);
	}
	$(function() {
		$(function() {
			var currPage = 1;

			$.getJSON("user/findCharacter.lovo", {
				currPage : currPage
			}, data);
			$("a").click(function() {
				var operation = $(this).text();

				currPage = parseInt($("input[name=number]").val());
				var totalPage = $("#totalPage").text();
				if (operation == "首页") {

					currPage = 1;
				} else if (operation == "上一页") {
					currPage = currPage - 1;
					if (currPage < 1) {
						currPage = 1;
					}
				}
				if (operation == "下一页") {

					currPage = currPage + 1;
					if (currPage > totalPage) {
						currPage = totalPage;
					}
				} else if (operation == "尾页") {//尾页

					currPage = totalPage;
				}
				$.getJSON("event/find.lovo", {
					currPage : currPage
				}, data);
			});
		});
		function data(data) {
			var $table = $("#table");
			$table.empty();
			var head = "<tr><th scope=col>角色名字</th><th scope=col>角色用户管理</th><th scope=col>角色权限管理</th><th>删除角色</th></tr>";
			$table.append(head);

			$.each(	data.list,	function(i, e) {
				var characterName = e.characterName;
				
				var tr = "<tr><td>"+characterName+"</td><td><a href=user/userManage.lovo?characterId="+e.id+">用户管理</a></td><td><a href=user/powerManage.lovo?characterId="+e.id+">权限管理</a></td><td><a href=user/deleteCharacter?characterId="+e.id+">删除</a></td></tr>";

				$table.append(tr);
			});

			$("input[name=number]").val(data.pageNum);
			$("#totalPage").text(data.pages);
		}
	});
</script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/style4.css">
<link href="css/fontawesome-all.css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Poiret+One"
	rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"
	rel="stylesheet">
<style>
#number {
	width: 6%;
}

#page a, input {
	margin-left: 2%;
}

table tr td a {
	margin-left: 10%;
}

div {
	text-align: center;
}

#add {
	text-align: center;
	margin-top: auto;
	font-family: 楷体;
	color: darkgrey;
	font-weight: bolder;
	font-size: large;
}
</style>
</head>
<body>
	<div class="wrapper">
	 <div class="wrapper">
        <!-- Sidebar Holder -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h1>
                    <a href="index.jsp">医院管理系统</a>
                </h1>
                <span>M</span>
            </div>

           <ul class="list-unstyled components">

            <li>
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    事件维护
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="eventMaintenance/eventMaintenance.jsp">事件维护</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="reportforms/numericalStatement.jsp">

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
                        <a href="resourcemanagement/resourceDetails.jsp">资源详情</a>
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
                        <a href="dispatch/dispatchRecovery.jsp">派遣详情</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="usermanagement/userManagement.jsp">

                    用户管理
                </a>
            </li>
        </ul>
    </nav>

		<div id="content">
			<nav class="navbar navbar-default mb-xl-5 mb-4">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" id="sidebarCollapse"
							class="btn btn-info navbar-btn">
							<i class="fas fa-bars"></i>
						</button>
					</div>
					<ul class="top-icons-agileits-w3layouts float-right">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown2"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="far fa-user">用户</i>
						</a>
							<div class="dropdown-menu drop-3">
								<div class="profile d-flex mr-o">
									<div class="profile-l align-self-center">
										<img src="images/profile.jpg" class="img-fluid mb-3"
											alt="Responsive image">
									</div>
									<div class="profile-r align-self-center">
										<h3 class="sub-title-w3-agileits">Will Smith</h3>
									</div>
								</div>
								<a href="#" class="dropdown-item mt-3">
									<h4>
										<i class="far fa-user mr-3"></i>用户角色
									</h4>
								</a> <a href="#" class="dropdown-item mt-3">
									<h4>
										<i class="fas fa-link mr-3"></i>联系方式
									</h4>
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="userManage.html">登出</a>
							</div></li>
					</ul>
				</div>
			</nav>
			<h2 class="main-title-w3layouts mb-2 text-center">角色管理</h2>
			<section class="error-page-content">
				<div class="outer-w3-agile mt-3">
					<table class="table col-xl mr-xl-3" id="table">
						<thead>
							<tr><th scope="col">角色名字</th><th scope="col">角色用户管理</th><th scope="col">角色权限管理</th></tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">Success</th>
								<td><a href="characterManagerUser.html">管理用户</a></td>
								<td><a href="characterManagerPower.html">管理权限</a></td>
							</tr>
							<tr>
								<th scope="row">Success</th>
								<td><a href="characterManagerUser">管理用户</a></td>
								<td><a href="characterManagerPower">管理权限</a></td>
							</tr>
							<tr>
								<th scope="row">Success</th>
								<td><a href="characterManagerUser">管理用户</a></td>
								<td><a href="characterManagerPower">管理权限</a></td>
							</tr>
						</tbody>
					</table>
					<div id="page" class="active">
						<a name="首页">首页</a><a name="上一页">上一页</a><input type="number"
							name="number">/<span id="totalPage">10页</span> <a
							name="下一页">下一页</a><a name="尾页">尾页</a>
					</div>
				</div>
			</section>
			<div
				class="copyright-w3layouts py-xl-3 py-2 mt-xl-5 mt-4 text-center">
				<p>
					Copyright &copy; 2018.Company name All rights reserved.<a
						target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>
			</div>
		</div>
	</div>
	<script src='js/jquery-2.2.3.min.js'></script>
	<script>
		$(document).ready(function() {
			$('#sidebarCollapse').on('click', function() {
				$('#sidebar').toggleClass('active');
			});
		});
	</script>
	<script>
		$(document).ready(function() {
			$(".dropdown").hover(function() {
				$('.dropdown-menu', this).stop(true, true).slideDown("fast");
				$(this).toggleClass('open');
			}, function() {
				$('.dropdown-menu', this).stop(true, true).slideUp("fast");
				$(this).toggleClass('open');
			});
		});
	</script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>