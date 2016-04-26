<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta http-equiv=Cache-Control content=no-cache />
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css4/bootstrap.css">
<link rel="stylesheet" href="/HoBuy/jsp/css4/dashboard.css">
</head>
<body>


	<nav class="navbar navbar-dark navbar-fixed-top bg-inverse ">
	<button type="button" class="navbar-toggler hidden-sm-up"
		data-toggle="collapse" data-target="#navbar" aria-expanded="false"
		aria-controls="navbar">
		<span class="sr-only">T</span> <span class="icon-bar"></span> <span
			class="icon-bar"></span> <span class="icon-bar"></span>
	</button>
	<a class="navbar-brand" href="/HoBuy/index.do">HoBuy</a>
	<div id="navbar">

		<ul class="nav navbar-nav nav-pills " role="tablist" id="myTab">
			<li class="nav-item	"><a class="nav-item nav-link"
				href="/HoBuy/solercenter/center.do">控制台 </a></li>

			<li class="nav-item	"><a class="nav-link active" href="#reports"
				role="tab" data-toggle="tab" aria-controls="reports"
				onclick="change('reports_i')">整体预览 </a></li>
			<li class="nav-item"><a class="nav-link" href="#productreport"
				role="tab" data-toggle="tab" aria-controls="productreport"
				onclick="change('productreport_i')">商品报告</a></li>
			<li class="nav-item"><a class="nav-link" href="#productmanage"
				role="tab" data-toggle="tab" aria-controls="productmanage"
				onclick="change('productmanage_i')">商品管理</a></li>
			<li class="nav-item"><a class="nav-link" href="#propertymanage"
				role="tab" data-toggle="tab" aria-controls="propertymanage"
				onclick="change('propertymanage_i')">属性管理</a></li>
			<li class="nav-item"><a class="nav-link" href="#ordermanage"
				role="tab" data-toggle="tab" aria-controls="ordermanage"
				onclick="change('ordermanage_i')">订单管理</a></li>
			<li class="nav-item"><a class="nav-link" href="#waiters"
				role="tab" data-toggle="tab" aria-controls="waiters"
				onclick="change('waiters_i')">客服管理</a></li>
			<li class="nav-item"><a class="nav-link" href="#solerworkers"
				role="tab" data-toggle="tab" aria-controls="solerworkers"
				onclick="change('solerworkers_i')">人员管理</a></li>
			<li class="nav-item"><a class="nav-link" href="#carousel"
				role="tab" data-toggle="tab" aria-controls="carousel"
				onclick="change('carousel_i')">上头条</a></li>
			<li class="nav-item	"><a class="nav-item nav-link"
				href="/HoBuy/logoffsoler.do">注销</a></li>
		</ul>
	</div>
	</nav>

	<div class="container-fluid" style="margin-top: 50px;">
		<script>
			function change(m) {
				if (m == 'reports_i') {
					document.getElementById("reports_i").src = '/HoBuy/solercenter/reports.do';
				}
				if (m == 'productreport_i') {
					document.getElementById("productreport_i").src = '/HoBuy/solercenter/productreport.do';
				}
				if (m == 'productmanage_i') {
					document.getElementById("productmanage_i").src = '/HoBuy/solercenter/products.do';
				}
				if (m == 'propertymanage_i') {
					document.getElementById("propertymanage_i").src = '/HoBuy/solercenter/propertys.do';
				}
				if (m == 'ordermanage_i') {
					document.getElementById("ordermanage_i").src = '/HoBuy/solercenter/ordermanage.do';
				}
				if (m == 'carousel_i') {
					document.getElementById("carousel_i").src = '/HoBuy/solercenter/carousel.do';
				}
				if (m == 'waiters_i') {
					document.getElementById("waiters_i").src = '/HoBuy/solercenter/waiters.do';
				}
				if (m == 'solerworkers_i') {
					document.getElementById("solerworkers_i").src = '/HoBuy/solercenter/solerworkers.do';
				}
			}
		</script>


		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="reports">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="reports_i"
						src="/HoBuy/solercenter/reports.do" allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="productreport">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="productreport_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="productmanage">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="productmanage_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="propertymanage">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="propertymanage_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="ordermanage">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="ordermanage_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="carousel">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="carousel_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="waiters">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="waiters_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="solerworkers">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="solerworkers_i" src=""
						allowfullscreen></iframe>
				</div>
			</div>
		</div>


	</div>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>