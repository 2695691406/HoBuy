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
<title>商品详情</title>

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
		<div class="page-header" style="margin-top: 0;">
			<h1>
				<small>商家： </small> ${product.soler.name }<small><span
					class="badge">信誉：${product.soler.reputaion }</span></small>
			</h1>
		</div>
		<div class="panel panel-success">
			<div class="row">
				<div class="col-sm-6 col-md-6">
					<div class="thumbnail">
						<img src="${product.imgurl }" class="img-rounded">
					</div>
				</div>
				<div class="col-sm-6 col-md-6">
					<div class="caption ">
						<form class="form-horizontal" action="/HoBuy/usercenter//shoppingcart.do"
							method="post">
							<div class="form-group form-inline">
								<h2 class="media-heading  center-data col-sm-offset-1">
									${product.name }</h2>
								<label for="inputEmail3" class="col-sm-4 ">${product.subtitle }</label>
							</div>

							<div class="form-group form-inline">
								<c:if test="${product.soler_property.pro1name!='' }">
									<label for="inputEmail3" class="col-sm-2 control-label">${product.soler_property.pro1name }</label>
									<c:forEach items="${product.repertory }" var="rep">
										<div class="col-sm-2">
											<p class="form-control-static">${rep.pro1 }</p>
										</div>
									</c:forEach>
								</c:if>
								<c:if test="${product.soler_property.pro2name!='' }">
									<label for="inputEmail3" class="col-sm-2 control-label">${product.soler_property.pro2name }</label>
									<c:forEach items="${product.repertory }" var="rep">
										<div class="col-sm-2">
											<p class="form-control-static">${rep.pro2 }</p>
										</div>
									</c:forEach>
								</c:if>
								<c:if test="${product.soler_property.pro3name!='' }">
									<label for="inputPassword3" class="col-sm-2 control-label">${product.soler_property.pro3name }:</label>
									<c:forEach items="${product.repertory }" var="rep">
										<div class="col-sm-2">
											<p class="form-control-static">${rep.pro3 }</p>
										</div>
									</c:forEach>
								</c:if>
							</div>
							<div class="form-group ">

								<label for="inputPassword3" class="col-sm-2 control-label ">库存</label>
								<div class="col-sm-2">
									<div class="btn alert-success " role="alert">
										${product.repertory[0].repertory_nubmer }</div>
								</div>
								<label for="inputPassword3" class="col-sm-2 control-label">销量</label>
								<div class="col-sm-2">
									<div class="btn alert-info " role="alert">
										${product.repertory[0].sole_number }</div>
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">价格</label>
								<div class="col-sm-2">
									<div class="btn alert-danger " role="alert">
										<c:if test="${product.repertory[0].state==1 }">
											<b
												style="color: #c40000; font-weight: bolder; font-size: 30px;">
												￥${product.repertory[0].price } </b>
										</c:if>
										<c:if test="${product.repertory[0].state==2 }">
											<b
												style="font-weight: bolder; font-size: 12px; text-decoration: line-through;">
												￥${product.repertory[0].price } </b>
											<b
												style="color: #c40000; font-weight: bolder; font-size: 30px;">
												￥${product.repertory[0].bid } </b>
										</c:if>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label ">數量</label>
								<div class="col-sm-2">
									<input type="text" name="repertoryid"
										value="${product.repertory[0].id }" hidden="true"> <input
										type="number" class="form-control" name="sum"
										id="inlineRadio1" value="1">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<c:if test="${product.repertory[0].repertory_nubmer>0 }">
									<button type="submit" class="btn btn-default">加入购物车</button>
									</c:if>
									 <c:if test="${product.repertory[0].repertory_nubmer<1 }">
									<button type="button" class="btn btn-default disabled">暂时无货</button>
									</c:if> 
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">商品详情</div>
			<div class="panel-body">
				<p>${product.subtitle }</p>
			</div>

			<!-- Table -->
			<table class="table">
				<tr>
					<th>评级</th>
					<th>内容</th>
					<th>时间</th>
				</tr>

				<c:forEach items="${product.product_evaluate }" var="evaluate">
					<tr>
						<td>
							<div class="progress">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="${evaluate.evaluate_level*20 }"
									aria-valuemin="0" aria-valuemax="100"
									style="width: ${evaluate.evaluate_level*20 }%">
									<span class="sr-only">20% Complete</span>
								</div>
							</div>
						</td>
						<td>${evaluate.content }</td>
						<td>${evaluate.time }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">商品详情</div>
			<div class="panel-body">
				<p>${product.name }</p>
			</div>
			<c:if test="${product.img_group.img1url!='' }">
				<img alt="" class="img-responsive" src="${product.img_group.img1url }">
			</c:if>
			<c:if test="${product.img_group.img2url!='' }">
				<img alt="" class="img-responsive" src="${product.img_group.img2url }">
			</c:if>
			<c:if test="${product.img_group.img3url!='' }">
				<img alt="" class="img-responsive" src="${product.img_group.img3url }">
			</c:if>
			<c:if test="${product.img_group.img4url!='' }">
				<img alt="" class="img-responsive" src="${product.img_group.img4url }">
			</c:if>
			<c:if test="${product.img_group.img5url!='' }">
				<img alt="" class="img-responsive" src="${product.img_group.img5url }">
			</c:if>

		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<hr>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>