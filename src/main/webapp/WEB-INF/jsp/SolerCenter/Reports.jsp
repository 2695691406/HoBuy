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
	<h1 class="page-header">
		${soler.name} <small class="text-muted"><span
			class="label label-pill label-primary"></span></small>
	</h1>
	<h4>
		总评价<span class="label label-pill label-primary">${soler.reputaion }</span>
		总评价数<span class="label label-pill label-success">${soler.count }</span>
	</h4>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>用户名</th>
				<th>内容</th>
				<th>评级</th>
				<th>时间</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${evaluates }" var="evaluate">
				<tr>
					<td>${evaluate.user.name }</td>
					<td style="width: 20%;"><textarea cols="40" class=" disabled"
							readonly="readonly"> ${evaluate.content }</textarea></td>
					<td style="width: 10%;"><span
						class="label label-pill label-primary">${evaluate.evaluate_level }星</span></td>
					<td>${evaluate.time }</td>
				</tr>


			</c:forEach>
		</tbody>
	</table>
	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>