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
	<a class="navbar-brand" href="/HoBuy/IndexServlet">HoBuy</a>
	<div id="navbar">
		<nav class="nav navbar-nav pull-left"> <a
			class="nav-item nav-link" href="#">${saler.name }</a> <a
			class="nav-item nav-link" href="/HoBuy/solercenter/center.do">控制台
		</a><a class="nav-item nav-link" href="/HoBuy/logoffsoler.do">注销</a>
	</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-2 col-md-2 sidebar nav-pills nav-stacked">
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
					}
				</script>
				<ul class="nav nav-tabs nav-pills nav-stacked" role="tablist"
					id="myTab">
					<li class="nav-item"><a class="nav-link active" href="#reports"
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
					<li class="nav-item"><a class="nav-link" href="#carousel"
						role="tab" data-toggle="tab" aria-controls="carousel"
						onclick="change('carousel_i')">上头条</a></li>
				</ul>
			</div>
			
			<div class="col-sm-10 col-sm-offset-2 col-md-10 col-md-offset-2 main">
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
				</div>


			</div>
		</div>
	</div>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script> 
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>