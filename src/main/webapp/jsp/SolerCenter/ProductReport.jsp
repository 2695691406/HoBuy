<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h2 class="sub-header">商品整体预览</h2>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>商品编号</th>
					<th>名称</th>
					<th>评价</th>
					<th>评价数量</th>
					<th>销量</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products }" var="product">
					<%-- ${product } --%>
					<tr>
						<td>${product.id }</td>
						<td>${product.name }</td>
						<td><span class="label label-pill label-info">${product.evaluate_level }</span></td>
						<td><span class="label label-pill label-info">${product.evaluate_count }</span></td>
						<td><span class="label label-pill label-info">${product.solenumber }</span></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>