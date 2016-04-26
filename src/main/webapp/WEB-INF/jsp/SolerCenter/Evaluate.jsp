<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css4/bootstrap.css">
<style type="text/css">
body {
	font-size: 14px;
}
</style>
</head>
<body>
	<%-- ${orders } --%>
	<c:if test="${order==null }">
	暂时没有该状态订单
</c:if>


	<div class="card">
		<div class="card-block">
			<div class="bs-example " data-example-id="default-media"
				style="padding: 5px;">

				<div class="media" style="">
					<div class="media-body">
						<div class="card ">
							<div class="card-header card-info">商品信息</div>
							<div class="card-block">
								<c:forEach items="${order.order_product }" var="productorder">
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
										<div class="media-right">
											数量：
											<p>${productorder.pnum }</p>
										</div>
									</div>
									<hr>
								</c:forEach>
							</div>
						</div>

					</div>
					<div class="media-left" style="width: 15%;">
						<div class="card ">
							<div class="card-header card-warning">快递信息</div>
							<div class="card-block">
								<c:if test="${order.couriernum!=null }">
											快递编号：${order.couriernum }
											暂无快递信息										
											</c:if>
							</div>
						</div>
					</div>
					<div class="media-left" style="width: 10%;">
						<div class="card ">
							<div class="card-header card-danger">收貨人信息</div>
							<div class="card-block">
								<p>${order.address.name }</p>
								<p>${order.address.phone }</p>
								<p>${order.address.address }</p>
								<p>${order.address.postalcode }</p>
							</div>
						</div>
					</div>
					<div class="media-left" style="width: 10%;">


						<div class="card ">
							<div class="card-header card-info">支付状态</div>

							<div class="card-block">交易已完成</div>

						</div>

						<p></p>
					</div>
					<div class="media-left" style="width: 10%;">
						<div class="card ">
							<div class="card-header card-info">订单总价</div>
							<div class="card-block">${order.price }</div>
						</div>
					</div>

				</div>
			</div>

			<form action="/HoBuy/solercenter/evaluate.do" method="post">
				<div class="card text-center">
					<div class="card-header card-info">评价用户</div>
					<div class="card-block">

						<div class="form-group form-inline">
							<label >评价用户</label> 
							<input type="text" name="content"
								class="form-control"  placeholder="对用户的评价">
								<input
								type="radio" name="oid" value="${order.id }"
								checked="checked" hidden="true">
						</div>
						<div class="form-group form-inline">
							<label for="exampleInputEmail2">用户评级</label> <input type="radio"
								name="evaluate_level" class="form-control" value="1">一星 <input
								type="radio" name="evaluate_level" class="form-control" value="2">二星
							<input type="radio" name="evaluate_level" class="form-control" value="3">三星
							<input type="radio" name="evaluate_level" class="form-control" value="4">四星
							<input type="radio" name="evaluate_level" class="form-control" value="5"
								checked="checked">五星
						</div>
						<button type="submit" class="btn btn-success">提交评价</button>
					</div>
				</div>
			</form>
		</div>
	</div>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>
