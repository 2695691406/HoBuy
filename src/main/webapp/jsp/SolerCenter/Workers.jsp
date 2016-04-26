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
	<form action="/HoBuy/solercenter/solerworkers.do" method="post">
		<div class="card card-block">

			<div class="form-group row">
				<div class="jumbotron">
					<h1 class="display-3">工作人员系統!</h1>
					<p class="lead">商家可以設置工作人员了</p>
					<hr class="m-y-md">
				</div>
			</div>
			<div class="form-group row">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>人员ID</th>
							<th>人员名稱</th>
							<th>人员電話</th>
							<th>人员类型</th>
							<th>在线状态</th>
							<th>删除</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${solerWorkers[0]==null }">
							<tr>
								<td colspan="6" style="text-align: center;">暂无工作人员，请添加</td>
							</tr>
						</c:if>
						<c:forEach items="${solerWorkers }" var="worker" varStatus="status">
							<tr>
								<td>${status.index+1 }</td>
								<td>${worker.name }</td>
								<td>${worker.phone }</td>
								<td>
								<c:if test="${worker.state==0 }">离职</c:if>
								<c:if test="${worker.state==1 }">在职</c:if>
								</td>
								<td>
								<c:if test="${worker.type==1 }">包装工作人员</c:if>
								<c:if test="${worker.type==2 }">配送工作人员</c:if>
								</td>
								<td><a class="btn btn-danger btn-sm"
									href="/HoBuy/solercenter/solerworkersfire.do?swid=${worker.id }">删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div class="form-group row ">
				<label  class="col-sm-2 col-sm-offset-4 form-control-label">工作人员名称</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="name">
				</div>
			</div>
			<div class="form-group row ">
				<label  class="col-sm-2 col-sm-offset-4 form-control-label">工作人员电话</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="phone">
				</div>
			</div>
			<div class="form-group row ">
				<label  class="col-sm-2 col-sm-offset-4 form-control-label">工作人员密码</label>
				<div class="col-sm-6">
					<input type="text" class="form-control-file" name="account">
				</div>
			</div>
			<div class="form-group row">
				<label  class="col-sm-2 col-sm-offset-4 form-control-label">工作人员类型</label>
				<div class="col-sm-6 form-inline">
					<select class="form-control " name="type">
						<option value="1" selected="selected">包装工作人员</option>
						<option value="2">配送工作人员</option>
					</select>
				</div>
			</div>
			<div align="center">
			<input type="submit" class="btn btn-success" value="增加工作人员">
			</div>
		</div>
		
	</form>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>