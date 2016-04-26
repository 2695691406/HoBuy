<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
	<h2 class="page-header">订单管理</h2>
	<script type="text/javascript">
		function change(m) {
			if (m == 'new_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=1&page=0';
			}
			if (m == 'sending_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=2&page=0';
			}
			if (m == 'success_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=3&page=0';
			}
			if (m == 'evaluate_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=4&page=0';
			}
			if (m == 'overevaluate_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=5&page=0';
			}
			if (m == 'over_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=6&page=0';
			}
			if (m == 'solerCancale_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=9&page=0';
			}
			if (m == 'wantCancale_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=8&page=0';
			}
			if (m == 'userCancale_i') {
				document.getElementById("new_i").src = '/HoBuy/solercenter/orders.do?state=7&page=0';
			}
		}
	</script>
	<form class="form-horizontal">
		<!-- Nav tabs -->
		<ul class="nav nav-tabs" role="tablist">
			<li class="nav-item"><a class="nav-link active" href="#new-1"
				onclick="change('new_i')" role="tab" data-toggle="tab">新订单</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('sending_i')" role="tab" data-toggle="tab">已发货</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('success_i')" role="tab" data-toggle="tab">已收货</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('evaluate_i')" role="tab" data-toggle="tab">未评价</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('overevaluate_i')" role="tab" data-toggle="tab">已评价</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('over_i')" role="tab" data-toggle="tab">已完成</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('wantCancale_i')" role="tab" data-toggle="tab">申请取消</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('solerCancale_i')" role="tab" data-toggle="tab">商家取消</a></li>
			<li class="nav-item"><a class="nav-link" href="#new-1"
				onclick="change('userCancale_i')" role="tab" data-toggle="tab">用户取消</a></li>
		</ul>
		<!-- Tab panes -->
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="new-1">
				<div class="embed-responsive embed-responsive-4by3">
					<iframe class="embed-responsive-item" id="new_i"
						src="/HoBuy/solercenter/orders.do?state=1&page=0"
						allowfullscreen></iframe>
				</div>
			</div>
		</div>
	</form>

	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>