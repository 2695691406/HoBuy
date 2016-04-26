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
	<form action="/HoBuy/solercenter/waiters.do" method="post">
		<div class="card card-block">

			<div class="form-group row">
				<div class="jumbotron">
					<h1 class="display-3">客服系統!</h1>
					<p class="lead">商家可以設置客服了</p>
					<hr class="m-y-md">
				</div>
			</div>
			<div class="form-group row">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>客服序号</th>
							<th>客服名稱</th>
							<th>客服電話</th>
							<th>客服QQ</th>
							<th>客服类型</th>
							<th>删除</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${waiters[0]==null }">
							<tr>
								<td colspan="6" style="text-align: center;">暂无客服，请添加</td>
							</tr>
						</c:if>
						<c:forEach items="${waiters }" var="waiter" varStatus="status">
							<tr>
								<td>${status.index+1 }</td>
								<td>${waiter.name }</td>
								<td>${waiter.phone }</td>
								<td>${waiter.account }</td>
								<td>
								<c:if test="${waiter.type==1 }">售前客服</c:if>
								<c:if test="${waiter.type==2 }">售后客服</c:if>
								</td>
								<td><a class="btn btn-danger btn-sm"
									href="/HoBuy/solercenter/waitersdelete.do?wid=${waiter.id }">删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2 col-sm-offset-4 form-control-label">客服名称</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="name">
				</div>
			</div>
			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2 col-sm-offset-4 form-control-label">客服电话</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="phone">
				</div>
			</div>
			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2 col-sm-offset-4 form-control-label">客服QQ</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="account">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 col-sm-offset-4 form-control-label">客服类型</label>
				<div class="col-sm-6 form-inline">
					<select class="form-control " name="type">
						<option value="1" selected="selected">售前客服</option>
						<option value="2">售后客服</option>
					</select>
				</div>
			</div>
			<div align="center">
			<input type="submit" class="btn btn-success" value="增加客服">
			</div>
		</div>
	</form>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>