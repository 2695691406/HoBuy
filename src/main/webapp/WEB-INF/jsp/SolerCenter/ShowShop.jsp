<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../bootstrap.css">
<link rel="stylesheet" href="../dashboard.css">
</head>
<body>
	<h1 class="page-header">
		${saler.name }<small class="text-muted"><span
			class="label label-pill label-primary">${saler.reputaion }</span></small>
	</h1>

	<div class="row placeholders">
		<c:forEach items="${products }" var="product" varStatus="status">
		<div class="col-xs-6 col-sm-3 placeholder">
		
			<img
				src="${product.img }"
				width="200" height="200" class="img-fluid"
				alt="${product.subtitle }">
			<h4>Num${status }</h4>
			<span class="text-muted">${product.snum }件</span>
		</div>
		</c:forEach>
	</div>
	<!-- jQuery first, then Bootstrap JS. -->
	<script src="../jquery.min.js"></script>
	<script src="../bootstrap.js"></script>
</body>
</html>