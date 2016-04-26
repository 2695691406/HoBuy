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
	<jsp:include page="/jsp/Nav.jsp"></jsp:include>
	<div class="container">

		<!-- <a href="">账户状态</a>
			<div class="panel panel-default">
				<div class="panel-body form-inline">
					上次登录地址:江苏
				</div>
				<div class="panel-body form-inline">
					邮箱验证状态:未验证
				</div>
			</div> -->

		<hr>
		<div class="panel panel-default" align="center">
			<div class="panel-heading">修改密码</div>
			<div class="panel-body form-inline">
				<button type="button" class="btn btn-default " data-toggle="modal"
					data-target="#myModal">修改密码</button>
			</div>
		</div>


		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">修改密码</h4>
					</div>
					<form action="/HoBuy/usercenter/updatepwd.do" method="post">
						<div class="modal-body">
							<div align="center">
								<div class="panel-body form-inline">
									旧密码：<input type="password" class="form-control" name="oldpwd">
								</div>
								<div class="panel-body form-inline">
									新密码：<input type="password" class="form-control" name="newpwd">
								</div>
								<div class="panel-body form-inline">
									重复密码：<input type="password" class="form-control"
										name="renewpwd">
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="submit" class="btn btn-primary">保存修改</button>
						</div>
					</form>
				</div>
			</div>
		</div>


		<hr>
		<div class="panel panel-default" align="center">
			<div class="panel-heading">邮箱验证</div>
			<div class="panel-body form-inline">邮箱：${user.email }</div>
			<div class="panel-body form-inline">
				<a class="btn btn-default" href="/HoBuy/usercenter/validateemail.do">验证邮箱</a>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>