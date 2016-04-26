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
	<c:if test="${orders[0]==null }">
	<div class="alert alert-info" role="alert">
  <strong>暂时没有哦!</strong> 马上去宣传你的商品吧.
</div>
	
</c:if>
	<c:forEach items="${orders }" var="order">
		<form action="/HoBuy/solercenter/sendproduct.do" method="post">
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

										<c:if test="${order.state==1 }">
											<input type="text" name="couriernum">
										</c:if>
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
									<c:if test="${order.state==0 }">
										<div class="card-block">未支付</div>
									</c:if>
									<c:if test="${order.state==1 }">
										<div class="card-block">用户已支付</div>
									</c:if>
									<c:if test="${order.state==2 }">
										<div class="card-block">商家已发货</div>
									</c:if>
									<c:if test="${order.state==3 }">
										<div class="card-block">已经收货,尚未评价</div>
									</c:if>
									<c:if test="${order.state==4 }">
										<div class="card-block">已经收货,尚未评价</div>
									</c:if>
									<c:if test="${order.state==5 }">
										<div class="card-block">交易已完成,已经评价</div>
									</c:if>
									<c:if test="${order.state==6 }">
										<div class="card-block">交易已结束</div>
									</c:if>
									<c:if test="${order.state==8 }">
										<div class="card-block">用户申请取消</div>
									</c:if>
									<c:if test="${order.state==9 }">
										<div class="card-block">商家已经取消</div>
									</c:if>
									<c:if test="${order.state==7 }">
										<div class="card-block">用户已取消</div>
									</c:if>
								</div>

								<p></p>
							</div>
							<div class="media-left" style="width: 10%;">
								<div class="card ">
									<div class="card-header card-info">订单总价</div>
									<div class="card-block">${order.price }</div>
								</div>
							</div>
							<div class="media-left" style="width: 10%;">
								<div class="card ">
									<div class="card-header card-info">订单操作</div>
									<div class="card-block">
										<c:if test="${order.state==8 }">
											<a class="btn btn-default "
												href="/HoBuy/solercenter/ordercancle.do?oid=${order.id }">取消订单</a>
										</c:if>
										<c:if test="${order.state==1 }">

											<input type="text" name="oid" value="${order.id }"
												hidden="true">


											<input type="submit" class=" btn btn-default " value="发货">
											<hr>
											<a class="btn btn-default "
												href="/HoBuy/solercenter/ordercancle.do?oid=${order.id }">取消订单</a>
										</c:if>
										<c:if test="${order.state==2 }">
											<a class=" btn btn-default" href="/HoBuy/solercenter/connectuser.do?oid=${order.id }">联系买家</a>
											<hr>
											<a class="btn btn-default" href="${order.id }">查看物流</a>
										</c:if>
										<c:if test="${order.state==3 }">
											<a class=" btn btn-default"
												href="/HoBuy/solercenter/evaluate.do?oid=${order.id }">评价用户</a>
											<hr>
											<a class="btn btn-default" href="${order.id }">查看物流</a>
										</c:if>
										<c:if test="${order.state==4 }">
											<a class=" btn btn-default"
												href="/HoBuy/solercenter/evaluate.do?oid=${order.id }">评价用户</a>
											<hr>
											<a class="btn btn-default" href="${order.id }">查看物流</a>
										</c:if>
										<c:if test="${order.state==5 }">
											<a class=" btn btn-default disabled"
												>已经评价</a>
											<hr>
											<a class="btn btn-default" href="${order.id }">查看物流</a>
										</c:if>
										<c:if test="${order.state==6 }">
												无
											</c:if>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>

			</div>
		</form>
	</c:forEach>
				<nav>
					<ul class="pager">
					<c:if test="${page!=0 }">
						<li><a href="${url }${page-1}">上一页</a></li>
					</c:if>
					<c:if test="${orders[4]!=null }">
						<li><a href="${url }${page+1}">下一页</a></li>
					</c:if>
					</ul>
				</nav>

	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>
