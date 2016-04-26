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
	${order }
		<br>
		<%-- ${orders } --%>
		<div class="panel panel-default">
			<div class="media-left" style="width: 15%;">
				<div class="panel panel-warning">
					<div class="panel-heading">快递信息</div>
					<div class="panel-body">
						<c:if test="${order.couriernum==null }">
											暂无快递信息										
											</c:if>
						<c:if test="${order.couriernum!=null }">
											 快递编号：${order.couriernum }
											</c:if>
					</div>
				</div>
			</div>
			<div class="media-left" style="width: 10%;">
				<div class="panel panel-danger">
					<div class="panel-heading">收貨人信息</div>
					<div class="panel-body">
						<p>${order.address.name }</p>
						<p>${order.address.phone }</p>
						<p>${order.address.address }</p>
						<p>${order.address.postalcode }</p>
					</div>
				</div>
			</div>
			<div class="media-left" style="width: 10%;">


				<div class="panel panel-info">
					<div class="panel-heading">支付状态</div>
					<c:if test="${order.state==3 }">
						<div class="panel-body">已完成</div>
					</c:if>
				</div>

				<p></p>
			</div>
			<div class="media-left" style="width: 10%;">
				<div class="panel panel-info">
					<div class="panel-heading">订单总价</div>
					<div class="panel-body">${order.price }</div>
				</div>
			</div>
		</div>
		<form action="/HoBuy/usercenter/evaluate.do" method="post">
			<c:forEach items="${order.order_product }" var="productorder" varStatus="status">

				<div class="panel panel-default">
					<div class="panel-body">
						<div class="bs-example " data-example-id="default-media"
							style="padding: 5px;">
							<div class="media " style="">
								<%-- 								<div class="media-left">
									<input type="checkbox" value="${order.id }" name="orders"
										checked="checked">
								</div>
 --%>
								<div class="media-body">
									<div class="panel panel-info">
										<div class="panel-heading">商品信息</div>
										<div class="panel-body">

											<div class="media">
												<div class="media-left">
													<a href="#"> <img class="media-object"
														src="${productorder.repertory.imgurl }"
														data-holder-rendered="true"
														style="width: 80px; height: 80px;">
													</a>
												</div>
												<div class="media-left" style="width: 50%;">
													<a href="#">${productorder.repertory.product.name }</a>
												</div>
												<div class="media-left">
													价格：
													<p>${productorder.repertory.price }</p>
												</div>
											</div>
											<hr>
										</div>
									</div>
								</div>

								<div class="media-left" style="width: 10%;">
									<div class="panel panel-info">
										<div class="panel-heading">商品评价</div>
										<div class="panel-body">
											<textarea name="contents"></textarea>
											<input type="text" name="pids"
												value="${productorder.repertory.product.id }" hidden="true">
										</div>
									</div>
								</div>
								<div class="media-left" style="width: 10%;">
									<div class="panel panel-info">
										<div class="panel-heading">商品评级</div>
										<div class="panel-body">
											<input type="radio" name="plevel${productorder.repertory.product.id }" value="1">一星<br>
											<input type="radio" name="plevel${productorder.repertory.product.id }" value="2">二星 <br>
											<input type="radio" name="plevel${productorder.repertory.product.id }" value="3">三星 <br>
											<input type="radio" name="plevel${productorder.repertory.product.id }" value="4">四星 <br>
											<input type="radio" name="plevel${productorder.repertory.product.id }" value="5" checked="checked">五星
										</div>
									</div>
								</div>
								<%-- <div class="media-left" style="width: 10%;">
									<div class="panel panel-info">
										<div class="panel-heading">快递评级</div>
										<div class="panel-body">
											<input type="radio" name="slevel${status.index }" value="1">一星<br>
											<input type="radio" name="slevel${status.index }" value="2">二星 <br>
											<input type="radio" name="slevel${status.index }" value="3">三星 <br>
											<input type="radio" name="slevel${status.index }" value="4">四星 <br>
											<input type="radio" name="slevel${status.index }" value="5" checked="checked">五星
										</div>
									</div>
								</div> --%>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
			<div class="" style="width: 100%;" align="center">
				<input type="text" name="oid" value="${order.id }" hidden="true">
				整体评价：<input type="text" name="content" > 商家评级：<input
					type="radio" name="evaluate_level" value="1">一星 <input
					type="radio" name="evaluate_level" value="2">二星 <input
					type="radio" name="evaluate_level" value="3">三星 <input
					type="radio" name="evaluate_level" value="4">四星 <input
					type="radio" name="evaluate_level" value="5" checked="checked">五星
			</div>
			<div class="" style="width: 100%;" align="center">
				<input type="submit" class=" btn btn-primary" value="提交评价">
			</div>

		</form>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>