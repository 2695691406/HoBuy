<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="/HoBuy/jsp/css/bootstrap.min.css" rel="stylesheet">
<!-- <link href="/HoBuy/jsp/css/jumbotron.css" rel="stylesheet"> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond./HoBuy/jsp/js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/HoBuy/index.do">HoBuy</a>
			
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<!-- <li><a href="#">Welcome</a></li> -->
					<c:if test="${user==null }">
						<li><a href="/HoBuy/login.do">登陆</a></li>
						<li><a href="/HoBuy/regist.do">注册</a></li>
					</c:if>
					<c:if test="${user!=null }">
						<li><a href="">${user.name },你好</a></li>
							
						<li><a class="" href="/HoBuy/logoff.do">注销</a></li>
					</c:if>
					

					<li><a href="/HoBuy/usercenter/orders.do">订单中心</a></li>
					<li><a href="/HoBuy/usercenter/shoppingcart.do">购物车</a></li>
					<!-- <li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">全部 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">美妆</a></li>
							<li><a href="#">服饰</a></li>
							<li><a href="#">食品</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">图书</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">虚拟商品</a></li>
						</ul></li> -->
				</ul>
				<form class="navbar-form navbar-left" role="search"
					action="/HoBuy/search.do">
					
					<div class="form-group">
						<input type="text" name="searchWord" class="form-control"
							placeholder="搜索">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<c:if test="${saler!=null }">
						<li class="nav-item"><a class="nav-link"
							href="/HoBuy/solercenter/center.do">控制台 </a></li>
					</c:if>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">网站导航 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">投诉中心</a></li>
							<li><a href="#">商家入驻</a></li>
							<li><a href="#">商业合作</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">联系客服</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<!-- <script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<script type="text/javascript" src="/HoBuy/jsp/js/login.js"></script>-->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script> 
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
</body>
</html>