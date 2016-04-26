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

<hr>
		<div class="panel panel-default col-md-4 col-md-offset-4"
			align="center">
			<div class="panel-body ">
				<h4 class="form-group">手机验证</h4>
				<hr>
				<div id="phonediv" class="form-group">
					<input name="phone" type="number" class="form-control has-feedback"
						id="phone" placeholder="手机" value="">
					<h6>
						<span id="phonemsg" class="label label-danger">${phonemsg }</span>
					</h6>
				</div>
				<div id="pwddiv" class="form-group">
						<input id="pwd" name="pwd" type="password" class="form-control"
							placeholder="新密码">
						<h6>
							<span id="pwdmsg" class="label label-danger">${pwdmsg }</span>
						</h6>
					</div>
				<div id="checknumberdiv" class="form-group ">
					<input name="checknumber" type="text" class="form-control"
						id="checknumber" placeholder="验证码">
					<h6>
						<span id="checknumbermsg" class="label label-danger">${checknumbermsg }</span>
					</h6>
				</div>
				<div class="form-group ">
					<button id="sendnumber" type="button" class="btn  btn-sm btn-default">发送验证码</button>
				</div>
				<div class="form-group ">
					<button id="usersubmit" type="submit" class="btn   btn-primary">下一步</button>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<script type="text/javascript" src="/HoBuy/jsp/js/forgetpwd.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<hr>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>