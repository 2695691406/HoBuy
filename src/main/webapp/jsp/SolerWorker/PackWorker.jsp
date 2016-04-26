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
	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/js/jquery-1.10.0.js"></script>

	<div class="container">
		<ul class="nav nav-tabs nav-pills " role="tablist" id="myTab">
			<li class="nav-item active"><a class="nav-link " href="#accept"
				role="tab" data-toggle="tab" aria-controls="accept">确认订单</a></li>
			<li class="nav-item"><a class="nav-link" href="#exporting"
				role="tab" data-toggle="tab" aria-controls="exporting">正在出库</a></li>
			<li class="nav-item"><a class="nav-link" href="#exported"
				role="tab" data-toggle="tab" aria-controls="exported">出库完成</a></li>
		</ul>
		<!-- 16:9 aspect ratio -->
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="accept">
				<div class="embed-responsive embed-responsive-16by9"
					style="height: 1000px;">
					<iframe class="embed-responsive-item"
						src="/HoBuy/solerworker/acceptorder.do"></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane " id="exporting">
				<div class="embed-responsive embed-responsive-16by9">
					<iframe class="embed-responsive-item"
						src="/HoBuy/solerworker/exportingorder.do"></iframe>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane " id="exported">
				<div class="embed-responsive embed-responsive-16by9">
					<iframe class="embed-responsive-item"
						src="/HoBuy/solerworker/exportedorder.do"></iframe>
				</div>
			</div>
		</div>
	</div>

	<script src="/HoBuy/jsp/js/bootstrap.js"></script>
</body>
</html>