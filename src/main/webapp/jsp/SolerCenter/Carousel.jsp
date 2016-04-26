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
	<form action="/HoBuy/CarouselServlet" method="post"
		enctype="multipart/form-data">
		<div class="card card-block">

			<div class="form-group row">
				<div class="jumbotron">
					<h1 class="display-3">Hello, jumbotron!</h1>
					<p class="lead">人人都可以上头条，广告屏就这么随意</p>
					<hr class="m-y-md">
					<p>商家可免费将商品增加到主页广告屏哦！</p>
				</div>
			</div>
			<div class="form-group row">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>广告序号</th>
							<th>商品名称</th>
							<th>广告图片</th>
							<th>删除</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${carousels }" var="carou" varStatus="status">
							<tr>

								<td>${status.index+1 }</td>
								<td>${carou.product.name }</td>
								<td>${carou.carouselimg }</td>
								<td><a class="btn btn-danger btn-sm" href="/HoBuy/CarouselServlet?method=doDelete&id=${carou.id }">删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 form-control-label">商品</label>
				<div class="col-sm-10 form-inline">
					<select class="form-control " id="exampleSelect1"
						onchange="ShowSelect(this)" name="pid">
						<option value="null">请选择</option>
						<c:forEach items="${products }" var="cla">
							<option value="${cla.id }">${cla.name }</option>
						</c:forEach>
				</div>
			</div>
			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2 form-control-label">主頁圖片</label>
				<div class="col-sm-10">
					<input type="file" class="form-control-file" name="pimg"
						id="exampleInputFile" onselect="ShowImg(this)">
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2">设置说明</label>
				<div class="col-sm-10">
					<div class="radio disabled">
						<label>请您注意，主頁圖片必須大於968X500像素</label>
					</div>
				</div>
			</div>
			<input type="submit" class="btn btn-success" value="上头条喽">
		</div>
	</form>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
		
</body>
</html>