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
			<script type="text/javascript">
				var phoneok = false;
				var s = 30;
				function startTime() {
					// add a zero in front of numbers<10
					s = checkTime(s);
					document.getElementById('sendnumber').innerHTML = "已经发送"
							+ s;
					document.getElementById('sendnumber').setAttribute(
							"disabled", "disabled");
					s--;
					if (s > 0) {
						t = setTimeout('startTime()', 1000);
					} else {
						document.getElementById('sendnumber').innerHTML = "再次发送验证码";
						document.getElementById('sendnumber').removeAttribute(
								"disabled");
						s = 30;
					}
				}
				function checkTime(i) {
					if (i < 10) {
						i = "0" + i
					}
					return i
				}

				$(function() {
					$("#phone")
							.change(
									function() {
										var phone = $("#phone").val();
										if (phone.match("^[1][358]{1}[0-9]{9}") == null) {
											$("#phonediv").removeClass(
													"has-success");
											$("#phonediv")
													.addClass("has-error");
											$("#phonemsg").empty();
											$("#phonemsg").removeClass(
													"label-success");
											$("#phonemsg").addClass(
													"label-danger");
											$("#phonemsg").append("手机格式错误");
											return false;
										}
										var option = {
											url : "checkphone.do",
											type : "post",
											dataType : "text",
											data : {
												phone : phone
											},
											success : function(response) {
												if (response == "1") {
													$("#phonediv").removeClass(
															"has-error");
													$("#phonediv").addClass(
															"has-success");
													$("#phonemsg").empty();
													$("#phonemsg").removeClass(
															"label-danger");
													$("#phonemsg").addClass(
															"label-success");
													$("#phonemsg").append(
															"手机号可以使用");
													$("#checknumberdiv").show();
													phoneok = true;
												} else {
													$("#phonediv").removeClass(
															"has-success");
													$("#phonediv").addClass(
															"has-error");
													$("#phonemsg").empty();
													$("#phonemsg").removeClass(
															"label-success");
													$("#phonemsg").addClass(
															"label-danger");
													$("#phonemsg").append(
															"手机号已经注册");
													$("#checknumberdiv").hide();
													phoneok = false;
												}
											},
											error : function() {
												alert("系统错误");
											}
										};
										$.ajax(option);
									})
					$("#sendnumber").click(
							function() {
								if (!phoneok) {
									return false;
								}
								var phone = $("#phone").val();

								var option = {
									url : "phonemessage.do",
									type : "post",
									dataType : "text",
									data : {
										phone : phone
									},
									success : function(response) {
										if (response == "1") {
											startTime();
											$("#checknumbermsg").empty();
											$("#checknumbermsg").removeClass(
													"label-danger");
											$("#checknumbermsg").addClass(
													"label-success");
											$("#checknumbermsg").append(
													"验证码发送成功");

										} else {
											$("#checknumbermsg").empty();
											$("#checknumbermsg").removeClass(
													"label-success");
											$("#checknumbermsg").addClass(
													"label-danger");
											$("#checknumbermsg").append(
													"验证码发送失败");
										}
									},
									error : function() {
										alert("系统错误");

									}
								};

								$.ajax(option);
							})

					$("#email")
							.change(
									function() {
										var email = $("#email").val();
										if (email
												.match("^[a-z0-9]+([._\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$") != null) {
											$("#emaildiv").removeClass(
													"has-error");
											$("#emaildiv").addClass(
													"has-success");
											$("#emailmsg").empty();
											$("#emailmsg").removeClass(
													"label-danger");
											$("#emailmsg").addClass(
													"label-success");
											$("#emailmsg").append("邮箱格式正确");
											return true;
										} else {
											$("#emaildiv").removeClass(
													"has-success");
											$("#emaildiv")
													.addClass("has-error");
											$("#emailmsg").empty();
											$("#emailmsg").removeClass(
													"label-success");
											$("#emailmsg").addClass(
													"label-danger");
											$("#emailmsg").append("邮箱格式错误");
											return false;
										}

									})
					$("#name")
							.change(
									function() {
										var name = $("#name").val();
										if (name
												.match("[A-Za-z0-9\u4e00-\u9fa5\\s]{1,16}") != null) {
											$("#namediv").removeClass(
													"has-error");
											$("#namediv").addClass(
													"has-success");
											$("#namemsg").empty();
											$("#namemsg").removeClass(
													"label-danger");
											$("#namemsg").addClass(
													"label-success");
											$("#namemsg").append("姓名格式正确");
											return true;
										} else {
											$("#namediv").removeClass(
													"has-success");
											$("#namediv").addClass("has-error");
											$("#namemsg").empty();
											$("#namemsg").removeClass(
													"label-success");
											$("#namemsg").addClass(
													"label-danger");
											$("#namemsg").append("姓名格式错误");
											return false;
										}

									})
					$("#pwd")
							.change(
									function() {
										var pwd = $("#pwd").val();
										if (pwd
												.match("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}") != null) {
											$("#pwddiv").removeClass(
													"has-error");
											$("#pwddiv")
													.addClass("has-success");
											$("#pwdmsg").empty();
											$("#pwdmsg").removeClass(
													"label-danger");
											$("#pwdmsg").addClass(
													"label-success");
											$("#pwdmsg").append("密码格式正确");
											return true;
										} else {
											$("#pwddiv").removeClass(
													"has-success");
											$("#pwddiv").addClass("has-error");
											$("#pwdmsg").empty();
											$("#pwdmsg").removeClass(
													"label-success");
											$("#pwdmsg").addClass(
													"label-danger");
											$("#pwdmsg").append(
													"需要包含大写字母小写字母特殊符号");
											return false;
										}

									})
					$("#checknumber").change(function() {
						var checknumber = $("#checknumber").val();
						if (checknumber.match("[0-9]{4}") != null) {
							$("#checknumbermsg").empty();
							$("#checknumbermsg").removeClass("label-danger");
							$("#checknumbermsg").addClass("label-success");
							$("#checknumbermsg").append("格式正确");
							return true;
						} else {
							$("#checknumbermsg").empty();
							$("#checknumbermsg").removeClass("label-success");
							$("#checknumbermsg").addClass("label-danger");
							$("#checknumbermsg").append("格式不正确");
							return false;
						}

					})
					$("#arrage").change(function() {
						var arrage = $("#usersubmit").attr("disabled");
						if (arrage == 'disabled') {
							$("#usersubmit").removeAttr("disabled");
							return true;
						} else {
							$("#usersubmit").attr("disabled", "disabled");
							return false;
						}

					})
					$("#usersubmit").click(function() {
						if (!$("#email").change()) {
							alert("email")
							return false;

						}
						if (!$("#name").change()) {
							alert("name")
							return false;
						}
						if (!phoneok) {
							//alert("phone")
							$("#phone").change()
							return false;
						}

						if (!$("#pwd").change()) {
							alert("pwd")
							return false;
						}
						if (!$("#checknumber").change()) {
							alert("checknumber")
							return false;
						}

						return true;

					})
					/* $("#repwd").change(function() {
						var repwd= $("#repwd").val();
						var pwd= $("#pwd").val();
						if(repwd==pwd){
							$("#repwddiv").removeClass("has-error");
							$("#repwddiv").addClass("has-success");
							$("#repwdmsg").empty();
							$("#repwdmsg").removeClass("label-danger");
							$("#repwdmsg").addClass("label-success");
							$("#repwdmsg").append("密码一致");
						}else{
							$("#repwddiv").removeClass("has-success");
							$("#repwddiv").addClass("has-error");
							$("#repwdmsg").empty();
							$("#repwdmsg").removeClass("label-success");
							$("#repwdmsg").addClass("label-danger");
							$("#repwdmsg").append("密码不一致");
						}
						
					}) */

				})
			</script>
			<div class="col-sm-12 col-md-6 col-md-offset-3 col-mx-6">

				<form action="/HoBuy/regist.do" method="post">

					<div id="emaildiv" class="form-group">

						<input name="token" type="text" value="${token }" hidden="true"> <input
							name="email" type="email" class="form-control" id="email"
							placeholder="邮箱" value="${user.email }">
						<h6>
							<span id="emailmsg" class="label label-danger">${emailmsg }</span>
						</h6>
					</div>
					<div id="namediv" class="form-group">
						<input name="name" type="text" class="form-control" id="name"
							placeholder="姓名" value="${user.name }">
						<h6>
							<span id="namemsg" class="label label-danger">${namemsg }</span>
						</h6>
					</div>

					<div id="phonediv" class="form-group">
						<input name="phone" type="number"
							class="form-control has-feedback" id="phone" placeholder="手机"
							value="">
						<h6>
							<span id="phonemsg" class="label label-danger">${phonemsg }</span>
						</h6>
					</div>
					<div id="checknumberdiv" class="form-group form-inline">
						<input name="checknumber" type="text" class="form-control"
							id="checknumber" placeholder="验证码">
						<button id="sendnumber" type="button" class="btn  btn-sm">发送验证码</button>
						<h6>
							<span id="checknumbermsg" class="label label-danger">${checknumbermsg }</span>
						</h6>
					</div>
					<div id="pwddiv" class="form-group">
						<input id="pwd" name="pwd" type="password" class="form-control"
							placeholder="密码">
						<h6>
							<span id="pwdmsg" class="label label-danger">${pwdmsg }</span>
						</h6>
					</div>
					<%-- <div id="repwddiv" class="form-group">
						<input id="repwd" name="repwd" type="password" class="form-control"
							 placeholder="重复密码">
						<h6>
							<span id="repwdmsg" class="label label-danger">${repwdmsg }</span>
						</h6>
					</div> --%>
					<select class="form-control" name="university">
						<option value="1">江苏大学</option>
						<option value="2">江苏科技大学</option>
						<option value="3">江苏高职技术学院</option>
					</select>
					<h6>
						<span class="label label-danger">${universitymsg }</span>
					</h6>
					<div class="checkbox" align="center">
						<label> <input id="arrage" type="checkbox" name="arrage"
							value="1"> 我同意HoBuy网站用户使用协议
						</label>
						<h6>
							<span id="arragemsg" class="label label-danger">${arragemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<button id="usersubmit" type="submit" class="btn btn-success"
							disabled="disabled" style="width: 100%">注册</button>
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
							id="exampleInputEmail1" placeholder="商家邮箱"
							value="${soler.email }">
						<h6>
							<span class="label label-danger">${soleremailmsg }</span>
						</h6>
					</div>

					<div class="form-group">
						<input name="phone" type="number" class="form-control"
							id="exampleInputEmail1" placeholder="注册人手机号码"
							value="${soler.phone }">
						<h6>
							<span class="label label-danger">${solerphonemsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="pwd" type="password" class="form-control"
							placeholder="密码">
						<h6>
							<span class="label label-danger">${solerpwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="repwd" type="password" class="form-control"
							placeholder="重复密码">
						<h6>
							<span class="label label-danger">${solerrepwdmsg }</span>
						</h6>
					</div>
					<div class="form-group">
						<input name="address" type="text" class="form-control"
							placeholder="地址信息" value="${soler.address }">
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
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>