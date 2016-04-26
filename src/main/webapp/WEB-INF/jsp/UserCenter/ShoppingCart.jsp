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
	${shoppingcarts }
		<br>
		<c:if test="${shoppingcarts[0]==null }">
			购物车中还没有商品，赶快去添加吧
		</c:if>
		<c:if test="${shoppingcarts[0]!=null }">
		<form action="/HoBuy/usercenter/orders.do" method="post">

			<c:forEach items="${shoppingcarts }" var="Cart">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="bs-example " data-example-id="default-media"
							style="padding: 5px;">
							<div class="media " style="">
								<div class="media-left">
									<input type="checkbox" value="${Cart.repertory.id }"
										name="rids" checked="checked">
								</div>
								<div class="media-left">
									<a href="/HoBuy/product.do?id=${Cart.repertory.product.id }"> <img class="media-object"
										src="${Cart.repertory.imgurl }" data-holder-rendered="true"
										style="width: 80px; height: 80px;">
									</a>
								</div>
								<div class="media-left" style="width: 15%;">
									<h4>
										<a href="/HoBuy/product.do?id=${Cart.repertory.product.id }">${Cart.repertory.product.name }</a>
									</h4>
								</div>
								<div class="media-left" style="width: 35%;">
									<p>${Cart.repertory.product.introduce }</p>
								</div>
								<div class="media-left" style="width: 10%;">
									<h3>${Cart.repertory.price }</h3>
								</div>
								<div class="media-left" style="width: 5%;"></div>
								<div class="media-left" style="width: 10%;">
									<input type="text" class="form-control input-sm" name="sums"
										value="${Cart.sum }"> <input type="button"
										class="form-control  btn " disabled="disabled" value="数量">
								</div>
								<div class="media-left" style="width: 5%;"></div>
								<div class="media-left" style="width: 10%;">

									<a class=" btn btn-danger"
										href="/HoBuy/usercenter/shoppingcartDelete.do?id=${Cart.id }">删除</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
			<c:forEach items="${addresses }" var="add" varStatus="status">
				<div class="panel panel-default">
					<div class="panel-body form-inline">
						<c:if test="${status.index==status.count-1  }">
							<input type="radio" name="id" value="${add.id }"
								checked="checked">
						</c:if>
						<c:if test="${status.index!=status.count-1 }">
							<input type="radio" name="id" value="${add.id }">
						</c:if>

						收货人： ${add.name }&nbsp; 电话； ${add.phone }&nbsp; 地址： ${add.address }&nbsp;
						邮编： ${add.postalcode }
					</div>
				</div>
			</c:forEach>

			<div class="panel panel-default">
				<div class="panel-body form-inline">
					<input type="radio" name="choseAddress" value="new"> 姓名：<input
						type="text" class="form-control" name="name">电话：<input
						type="text" class="form-control" name="phone">收货地址：<input
						type="text" class="form-control" name="address">邮编号码：<input
						type="text" class="form-control" name="postalcode">
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-body">
					<input type="submit" class="btn btn-primary btn-sm"
						value="结算">
				</div>
			</div>
		</form>
		</c:if>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>