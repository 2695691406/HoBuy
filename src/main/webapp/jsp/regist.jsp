<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<div class="row">
			<div class="col-sm-12 col-mx-12 col-md-12" align="center">
				<h1>Hello, User!</h1>
				<p>我们希望您能阅读《HoBuy用户使用协议》以帮助您在使用过程中产生遵守协议，同时我们也为您的使用提供更快捷的指导！</p>
				<p>
					<a class="btn btn-default btn-sm" href="#" role="button">了解更多</a>
				</p>
			</div>

			<div class="col-sm-12 col-md-6 col-md-offset-3 col-mx-6">
				<form action="/HoBuy/regist.do" method="post">
					<div class="form-group">
						<input name="email" type="email" class="form-control"
							id="exampleInputEmail1" placeholder="邮箱" value="${user.email }">
						<h6>
							<span class="label label-danger">${emailmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="name" type="text" class="form-control"
							id="exampleInputEmail1" placeholder="姓名" value="${user.name }">
						<h6>
							<span class="label label-danger">${namemsg }</span>
						</h6>
					</div>

					<div class="form-group">
						<input name="phone" type="number" class="form-control"
							id="exampleInputEmail1" placeholder="手机" value="${user.phone }">
						<h6>
							<span class="label label-danger">${phonemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="pwd" type="password" class="form-control"
							id="exampleInputPassword1" placeholder="密码">
						<h6>
							<span class="label label-danger">${pwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="repwd" type="password" class="form-control"
							id="exampleInputPassword1" placeholder="重复密码">
						<h6>
							<span class="label label-danger">${repwdmsg }</span>
						</h6>
					</div>
					<select class="form-control" name="university">
						<option value="1">江苏大学</option>
						<option value="2">江苏科技大学</option>
						<option value="3">江苏高职技术学院</option>
					</select>
					<h6>
						<span class="label label-danger">${universitymsg }</span>
					</h6>
					<div class="checkbox" align="center">
						<label> <input type="checkbox" name="arrage"
							checked="checked" value="1"> 我同意HoBuy网站用户使用协议
						</label>
						<h6>
							<span class="label label-danger">${arragemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-success " style="width: 100%">注册</button>
					</div>

				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 col-mx-12 col-md-12" align="center">
				<h1>Hello, Soler!</h1>
				<p>我们希望您能阅读《HoBuy用户使用协议》以帮助您在使用过程中产生遵守协议，同时我们也为您的使用提供更快捷的指导！</p>
				<p>
					<a class="btn btn-default btn-sm" href="#" role="button">了解更多</a>
				</p>
			</div>

			<div class="col-sm-12 col-md-6 col-md-offset-3 col-mx-6">
				<form action="/HoBuy/registsoler.do" method="post">
					<div class="form-group">
						<input name="name" type="text" class="form-control"
							id="exampleInputEmail1" placeholder="商家名称" value="${soler.name }">
						<h6>
							<span class="label label-danger">${solernamemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="email" type="email" class="form-control"
							id="exampleInputEmail1" placeholder="商家邮箱" value="${soler.email }">
						<h6>
							<span class="label label-danger">${soleremailmsg }</span>
						</h6>
					</div>

					<div class="form-group">
						<input name="phone" type="number" class="form-control"
							id="exampleInputEmail1" placeholder="注册人手机号码" value="${soler.phone }">
						<h6>
							<span class="label label-danger">${solerphonemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="pwd" type="password" class="form-control"
							id="exampleInputPassword1" placeholder="密码">
						<h6>
							<span class="label label-danger">${solerpwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="repwd" type="password" class="form-control"
							id="exampleInputPassword1" placeholder="重复密码">
						<h6>
							<span class="label label-danger">${solerrepwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="address" type="text" class="form-control"
							id="exampleInputPassword1" placeholder="地址信息" value="${soler.address }">
						<h6>
							<span class="label label-danger">${solerrepwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<textarea type="textarea" name="introduce" class="form-control"
							placeholder="简介">${soler.introduce }</textarea>
						<h6>
							<span class="label label-danger">${solerintroducemsg }</span>
						</h6>
					</div>
					<select class="form-control" name="university">
						<option value="1">江苏大学</option>
						<option value="2">江苏科技大学</option>
						<option value="3">江苏高职技术学院</option>
					</select>
					<h6>
						<span class="label label-danger">${soleruniversitymsg }</span>
					</h6>
					<div class="checkbox" align="center">
						<label> <input type="checkbox" name="arrage"
							checked="checked" value="1"> 我同意HoBuy网站商家使用协议
						</label>
						<h6>
							<span class="label label-danger">${solerarragemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-success " style="width: 100%">注册</button>
					</div>

				</form>
			</div>
		</div>
	</div>
	<div class="container"></div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<hr>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>