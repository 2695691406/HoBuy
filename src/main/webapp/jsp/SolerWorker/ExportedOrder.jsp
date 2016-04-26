<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta http-equiv=Cache-Control content=no-cache />
<meta http-equiv="refresh" content="6" />
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css/bootstrap.css">
</head>
<body>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading panel-success" style="text-align: center;">出库完成订单</div>
			<div class="panel-body">
			exported
				<p style="text-align: center;">请注意，货物出库流程-->选择订单-->正在出库-->出库完成等待配送</p>
			</div>
			<table class="table table-bordered table-hover table-responsive"
				style="font-size: 12px;">

				<thead>
					<tr>
						<th style="text-align: center;" width="20%">商品信息</th>
						<th style="text-align: center;" width="10%">价格</th>
						<th style="text-align: center;" width="10%">数量</th>
						<th style="text-align: center;" width="15%">快递信息</th>
						<th style="text-align: center;" width="25%">收货人信息</th>
						<th style="text-align: center;" width="10%">总价</th>
						<th style="text-align: center;" width="10%">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${orders }" var="order">
						<tr>
							<c:forEach items="${order.order_product }" var="productorder">
								<td>
									<div class="media">
										<div class="media-left">
											<a
												href="/HoBuy/product.do?id=${productorder.repertory.product.id }">
												<img class="media-object"
												src="${productorder.repertory.imgurl }"
												data-holder-rendered="true"
												style="width: 40px; height: 40px;">
											</a>
										</div>

										<div class="media-left">
											<a
												href="/HoBuy/product.do?id=${productorder.repertory.product.id }">${productorder.repertory.product.name }</a>
										</div>
									</div>
								</td>
								<td>
									<div class="media-left">
										<p>${productorder.repertory.price }</p>
									</div>
								</td>
								<td>
									<div class="media-right">
										<p>X${productorder.pnum }</p>
									</div>
								</td>

							</c:forEach>
							<td><c:if test="${order.couriernum==null }">
											暂无快递信息										
											</c:if> <c:if test="${order.couriernum!=null }">
											 ${order.couriernum }
											</c:if></td>
							<td>${order.address.name }<br> ${order.address.phone }
								<br> ${order.address.address } <br>
								${order.address.postalcode } <br>
							</td>
							<td>${order.price }</td>
							<td align="center"><a class=" btn btn-success btn-sm"
								style="margin-bottom: 5px;"
								href="/HoBuy/usercenter/pay.do?oid=${order.id }">确认订单</a> <a
								class=" btn btn-default btn-sm"
								href="/HoBuy/usercenter/pay.do?oid=${order.id }">取消</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script>
	<script src="/HoBuy/jsp/js/bootstrap.js"></script>
</body>
</html>