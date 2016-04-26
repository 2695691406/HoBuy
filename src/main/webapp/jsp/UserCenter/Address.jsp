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
	<div class="container" style="min-height: 550px;">
		<button type="button" class="btn btn-primary"
			data-toggle="modal" data-target="#myModal">增加新地址</button>
		
		<hr>
		<c:forEach items="${addresses }" var="add" varStatus="status">

			<div class="panel panel-default">
				<div class="panel-body form-inline">
					<input type="text" hidden="true" name="id" value="${add.id }">
					收货人： ${add.name }&nbsp; 电话； ${add.phone }&nbsp; 地址： ${add.address }&nbsp;
					邮编： ${add.postalcode }
					<!--  <a class="btn btn-default pull-right"
						href="">删除</a>  -->
				</div>
			</div>
		</c:forEach>
		
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
						<h4 class="modal-title" id="myModalLabel">Modal title</h4>
					</div>
					<form action="/HoBuy/usercenter/address.do" method="post">
						<div class="modal-body">
							<div align="center">
								<div class="panel-heading">增加地址</div>
								<div class="panel-body form-inline">
									收货人姓名：<input type="text" class="form-control" name="name">
								</div>
								<div class="panel-body form-inline">
									收货人电话：<input type="text" class="form-control" name="phone">
								</div>
								<div class="panel-body form-inline">
									收货人地址：<input type="text" class="form-control" name="address">
								</div>
								<div class="panel-body form-inline">
									收货人邮编：<input type="text" class="form-control" name="postalcode">
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="submit" class="btn btn-primary">保存</button>
						</div>
					</form>
				</div>
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