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
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css4/bootstrap.css">
<link rel="stylesheet" href="/HoBuy/jsp/css4/dashboard.css">
</head>
<body style="padding-top: 0;">
	<h2 class="page-header">商品管理</h2>
	<script>
		function change(m) {
			if (m == 'property_tab') {
				document.getElementById("property_tab").src = '/HoBuy/solercenter/propertys.do';
			}
			if (m == 'product_tab') {
				document.getElementById("spbg_i").src = '/HoBuy/solercenter/products.do';
			}
		}
	</script>
	<ul class="nav nav-tabs" role="tablist">
		<li class="nav-item "><a class="btn btn-secondary"
			href="#sp-spgl" role="tab" data-toggle="tab" onclick="change('product_tab')">商品</a></li>
		<li class="nav-item "><a class="btn btn-secondary"
			href="#lb-spgl" role="tab" data-toggle="tab" onclick="change('property_tab')">属性组</a></li>
	</ul>
	<br>
	<div class="tab-content">

		<div role="tabpanel" class="tab-pane " id="lb-spgl">

			<div class="embed-responsive embed-responsive-4by3">
				<iframe class="embed-responsive-item" id="property_tab"
					src="" allowfullscreen></iframe>
			</div>
		</div>


		<div role="tabpanel" class="tab-pane active" id="sp-spgl">

			<div class="embed-responsive embed-responsive-4by3">
				<iframe class="embed-responsive-item" id="product_tab"
					src="/HoBuy/solercenter/products.do" allowfullscreen></iframe>
			</div>
		</div>
	</div>










	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>