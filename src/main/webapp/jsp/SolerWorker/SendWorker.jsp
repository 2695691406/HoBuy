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
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading" style="text-align: center;">订单清单</div>
			<div class="panel-body">
				<p style="text-align: center;">请注意，货物配送流程-->选择订单-->确认配送-->取货-->配送-->app签收</p>
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
											 快递编号：${order.couriernum }
											</c:if></td>
							<td>${order.address.name }<br> ${order.address.phone }
								<br> ${order.address.address } <br>
								${order.address.postalcode } <br>
							</td>
							<td>${order.price }</td>
							<td align="center"><a class=" btn btn-success btn-sm"
								href="/HoBuy/usercenter/pay.do?oid=${order.id }">配送订单</a></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>


			<%-- 	<div class="panel-body " >
							<div class="media row" style="">
								<div class="media-body col-md-1">
									<div class="panel panel-info ">
										<div class="panel-heading">商品信息</div>
										<div class="panel-body">
											<c:forEach items="${order.order_product }" var="productorder">
												<div class="media" >
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
													<div class="media-left">
														价格：
														<p>${productorder.repertory.price }</p>
													</div>
													<div class="media-right">
														数量：
														<p>${productorder.pnum }</p>
													</div>
												</div>
												
											</c:forEach>
										</div>
									</div>

								</div>
								<div class="media-left col-md-2" >
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
								<div class="media-left col-md-2" >
									<div class="panel panel-danger">
										<div class="panel-heading">收貨人信息</div>
										<div class="panel-body" style="font-size: 12px;">
											${order.address.name }<br>
											 ${order.address.phone } <br>
											 ${order.address.address } <br>
											 ${order.address.postalcode } <br>
										</div>
									</div>
								</div>

								<div class="media-left col-md-2" >
									<div class="panel panel-info">
										<div class="panel-heading">订单总价</div>
										<div class="panel-body">${order.price }</div>
									</div>
								</div>
								<div class="media-left col-md-2" >
									<div class="panel panel-info">
										<div class="panel-heading">订单操作</div>
										<div class="panel-body">
											<c:if test="${order.state==0 }">
												<a class=" btn btn-primary btn-sm"
													href="/HoBuy/usercenter/pay.do?oid=${order.id }">支付</a>
												
												<a class="btn btn-default btn-sm"
													href="/HoBuy/usercenter/cancleorder.do?oid=${order.id }">取消</a>
											</c:if>
											<c:if test="${order.state==1 }">
												<a class=" btn btn-default  btn-sm"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">联系客服</a>
												
												<a class="btn btn-default btn-sm"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请取消</a>
											</c:if>
											<c:if test="${order.state==2 }">
												<a class=" btn btn-default btn-sm"
													href="/HoBuy/usercenter/receive.do?oid=${order.id }">确认收货</a>
												
												<a class="btn btn-default" href="${order.id }">查看物流</a>
											</c:if>
											<c:if test="${order.state==3 }">
												<a class=" btn btn-default btn-sm"
													href="/HoBuy/usercenter/evaluate.do?oid=${order.id }">进行评价</a>
												
												<a class="btn btn-default btn-sm"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
											</c:if>
											<c:if test="${order.state==4 }">
												<a class=" btn btn-default disabled" href="">已经评价</a>
												
												<a class="btn btn-default btn-sm"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
											</c:if>
											<c:if test="${order.state==5 }">
												<a class=" btn btn-default btn-sm"
													href="/HoBuy/usercenter/evaluate.do?oid=${order.id }">进行评价</a>
												
												<a class="btn btn-default btn-sm"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
											</c:if>
											<c:if test="${order.state==6 }">
											交易成功
										</c:if>
											<c:if test="${order.state==7 }">
											用戶取消
										</c:if>
											<c:if test="${order.state==8 }">
											等待商家取消
										</c:if>
											<c:if test="${order.state==9 }">
											商家取消
										</c:if>
										</div>
									</div>

								</div>
							</div>
					</div> --%>
		</div>

	</div>
	

	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script>
	<script src="/HoBuy/jsp/js/bootstrap.js"></script>
</body>
</html>