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
<body style="background-image:url('/HoBuy/jsp/img/maoboli.jpg');background-size: cover;">
	<jsp:include page="/jsp/Nav.jsp"></jsp:include>
	<div class="page-header">
		<div class="container">
			<h1>
				用户登陆 <small> </small>
			</h1>
		</div>
	</div>
	<div class="container" >
		<div class="row" >
			<div class="col-md-4 col-md-offset-4 ">
				<c:if test="${sessionScope.user==null }">
					<form action="/HoBuy/loginuser.do" id="demoForm" method="post">
						<div class="form-group">
							<label for="username">用户账户</label> <input name="phone"
								type="text" class="form-control" id="username" placeholder="手机"
								value="${user.phone }">
						</div>
						<div class="form-group">
							<label for="password">密码</label> <input name="pwd"
								type="password" class="form-control" id="password"
								placeholder="密码">
							<h6>
								<span class="label label-danger">${loginmsg }</span>
							</h6>
						</div>
						<div class="form-group">
						<button type="submit" class="btn btn-success" style="width: 100%">登陆</button>
						</div>
						<div class="form-group">
							<a class="btn btn-default" href="/HoBuy/regist.do"
								style="width: 100%">注册</a>
						</div>
						<div class="form-group">
							<a class="btn btn-default" href="/HoBuy/forgetuserpwd.do"
								style="width: 100%">忘记密码</a>
						</div>
					</form>
				</c:if>
				<c:if test="${sessionScope.user!=null }">
					<br>
					<br>
					<div class="form-group " align="center">
						<label for="username">${user.name }</label>
					</div>
					<div class="form-group" align="center">
						<label for="username">您已經登陸</label>

					</div>
					<div class="form-group" align="center">
						<a class="btn btn-info" href="/HoBuy/logoffuser.do">切换账户</a>

					</div>
					<div class="form-group" align="center">
						<a class="btn btn-danger" href="/HoBuy/logoffuser.do">退出登錄</a>

					</div>

				</c:if>
			</div>
		</div>
	</div>
	<div class="page-header">
		<div class="container">
			<h1>
				商家登陆 <small> </small>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4 ">
				<c:if test="${sessionScope.soler==null }">
					<form action="/HoBuy/loginsoler.do" id="demoForm" method="post">
						<div class="form-group">
							<label for="username">商家账户</label> <input name="phone"
								type="text" class="form-control" id="username" placeholder="手机"
								value="${soler.phone }">
						</div>
						<div class="form-group ">
							<label for="password">密码</label> <input name="pwd"
								type="password" class="form-control" id="password"
								placeholder="密码">
							<h6>
								<span class="label label-danger">${solerloginmsg }</span>
							</h6>
						</div>
						<div class="form-group ">
							<button type="submit" class="btn btn-success" style="width: 100%">登陆</button>
						</div>
						<div class="form-group">
							<a class="btn btn-default" href="/HoBuy/regist.do"
								style="width: 100%">注册</a>
						</div>
						<div class="form-group">
							<a class="btn btn-default" href="/HoBuy/forgetsolerpwd.do"
								style="width: 100%">忘记密码</a>
						</div>
					</form>
				</c:if>
				<c:if test="${sessionScope.soler!=null }">
					<br>
					<br>
					<div class="form-group " align="center">
						<label for="username">${user.name }</label>
					</div>
					<div class="form-group" align="center">
						<label for="username">您已經登陸</label>

					</div>
					<div class="form-group" align="center">
						<a class="btn btn-info" href="/HoBuy/logoffsoler.do">切换账户</a>

					</div>
					<div class="form-group" align="center">
						<a class="btn btn-danger" href="/HoBuy/logoffsoler.do">退出登錄</a>

					</div>

				</c:if>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<!-- <script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<script type="text/javascript" src="/HoBuy/jsp/js/login.js"></script>
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script> -->
	<script src="/HoBuy/jsp/js/jquery.validate-1.13.1.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<hr>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>