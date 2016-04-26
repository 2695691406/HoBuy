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
		<br>
		<%-- ${orders } --%>
		<form action="/HoBuy/OrderServlet" method="post">

			<c:forEach items="${orders }" var="order">
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
											<c:forEach items="${order.order_product }" var="productorder">
												<div class="media">
													<div class="media-left">
														<a
															href="/HoBuy/product.do?id=${productorder.repertory.product.id }">
															<img class="media-object"
															src="${productorder.repertory.imgurl }"
															data-holder-rendered="true"
															style="width: 80px; height: 80px;">
														</a>
													</div>
													<div class="media-left" style="width: 50%;">
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
												<hr>
											</c:forEach>
										</div>
									</div>

								</div>
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
										<c:if test="${order.state==0 }">
											<div class="panel-body">未支付</div>
										</c:if>
										<c:if test="${order.state==1 }">
											<div class="panel-body">已支付</div>
										</c:if>
										<c:if test="${order.state==2 }">
											<div class="panel-body">已发货</div>
										</c:if>
										<c:if test="${order.state==3 }">
											<div class="panel-body">已完成</div>
										</c:if>
										<c:if test="${order.state==4 }">
											<div class="panel-body">已完成</div>
										</c:if>
										<c:if test="${order.state==5 }">
											<div class="panel-body">已完成</div>
										</c:if>
										<c:if test="${order.state==7 }">
											<div class="panel-body">取消</div>
										</c:if>
										<c:if test="${order.state==8 }">
											<div class="panel-body">正在申请取消</div>
										</c:if>
										<c:if test="${order.state==9 }">
											<div class="panel-body">商家取消</div>
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
								<div class="media-left" style="width: 10%;">
									<div class="panel panel-info">
										<div class="panel-heading">订单操作</div>
										<div class="panel-body">
											<c:if test="${order.state==0 }">
												<a class=" btn btn-primary"
													href="/HoBuy/usercenter/pay.do?oid=${order.id }">支付</a>
												<hr>
												<a class="btn btn-default"
													href="/HoBuy/usercenter/cancleorder.do?oid=${order.id }">取消</a>
											</c:if>
											<c:if test="${order.state==1 }">
												<a class=" btn btn-default "
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">联系客服</a>
												<hr>
												<a class="btn btn-default" href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请取消</a>
											</c:if>
											<c:if test="${order.state==2 }">
												<a class=" btn btn-default"
													href="/HoBuy/usercenter/receive.do?oid=${order.id }">确认收货</a>
												<hr>
												<a class="btn btn-default" href="${order.id }">查看物流</a>
											</c:if>
											<c:if test="${order.state==3 }">
													<a class=" btn btn-default"
														href="/HoBuy/usercenter/evaluate.do?oid=${order.id }">进行评价</a>
												<hr>
												<a class="btn btn-default"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
											</c:if>
											<c:if test="${order.state==4 }">
												<a class=" btn btn-default disabled" href="">已经评价</a>
												<hr>
												<a class="btn btn-default"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
											</c:if>
											<c:if test="${order.state==5 }">
												<a class=" btn btn-default disabled" href="">已经评价</a>
												<hr>
												<a class="btn btn-default"
													href="/HoBuy/usercenter/waiters.do?oid=${order.id }">申请售后</a>
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
						</div>
					</div>
				</div>
			</c:forEach>


			<!-- 			<div class="panel panel-default">
				<div class="panel-body">
					<input type="checkbox">全选 <input type="button"
						class="btn btn-default btn-sm" value="删除"> 已选订单<span>0</span>件
					合计:￥0.00 <input type="submit" class="btn btn-danger btn-sm"
						value="全部支付">
				</div>
			</div>
 -->
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