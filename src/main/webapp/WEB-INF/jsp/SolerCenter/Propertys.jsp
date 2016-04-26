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
<body style="margin-top: 0; padding-top: 0;">
	<h2 class="page-header">属性组管理</h2>
	<!-- Nav tabs -->
	<ul class="nav nav-tabs" role="tablist">
		<li class="nav-item"><a class="nav-link active" href="#home2"
			role="tab" data-toggle="tab">属性组列表</a></li>
		<li class="nav-item"><a class="nav-link" href="#profile2"
			role="tab" data-toggle="tab">增加属性组</a></li>
	</ul>
	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane active" id="home2">
			<div class="" id="collapseExample">

				<div class="card card-block">
					<div class="form-group row">
						<label class="col-sm-2">设置说明</label>
						<div class="col-sm-10">
							<div class="radio disabled">
								<label style="color: #00ccff;">请您注意，如果您的商品中使用到了屬性組則無法刪除</label>
							</div>
						</div>
					</div>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>属性组</th>
								<th>属性一</th>
								<th>属性二</th>
								<th>属性三</th>
								<th>商品數量</th>
								<th>操作</th>
								<th>删除</th>
							</tr>
						</thead>
						<script type="text/javascript">
							function Change(id) {
								var tt = document.getElementById(id);
								if (tt.getAttribute("hidden")) {
									document.getElementById(id)
											.removeAttribute("hidden");
								} else {
									document.getElementById(id).setAttribute(
											"hidden", "true")
								}
							}
						</script>
						<tbody>
							<c:forEach items="${properties }" var="pro">
								<tr>

									<td>${pro.name }</td>
									<td>${pro.pro1name }</td>
									<td>${pro.pro2name }</td>
									<td>${pro.pro3name }</td>
									<td>${pro.pcount }</td>
									<td><a class="btn btn-warning btn-sm"
										onclick="Change('${pro.id}-tr')">修改</a></td>
									<td>
											<a class="btn btn-info-outline  btn-sm"
												href="/HoBuy/solercenter/propertysdelete.do?id=${pro.id }">删除</a>
									</td>
								</tr>
								<tr id="${pro.id }-tr" hidden="true">
									<td colspan="6">
										<form action="/HoBuy/solercenter/propertysupdate.do"
											method="post">
											<div class="form-group ">
												<input type="text" name="id" value="${pro.id }"
													hidden="true">
											</div>
											<div class="form-group form-inline text-center">
												组名称：<input type="text" name="name" class="form-control"
													value="${pro.name }" placeholder="组名称">
											</div>
											<div class="form-group form-inline text-center">
												属性一：<input type="text" name="pro1name" class="form-control"
													value="${pro.pro1name }" placeholder="属性一">
											</div>
											<div class="form-group form-inline text-center">
												属性二：<input type="text" name="pro2name" class="form-control"
													value="${pro.pro2name }" placeholder="属性二">
											</div>
											<div class="form-group form-inline text-center">
												属性三：<input type="text" name="pro3name" class="form-control"
													value="${pro.pro3name }" placeholder="属性三">
											</div>
											<div class="form-group text-center">
												<input class="btn btn-success-outline" type="submit"
													value="保存修改">
											</div>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>
		</div>
		<div role="tabpanel" class="tab-pane" id="profile2">
			<div class="" id="collapseExample1">
				<form action="/HoBuy/solercenter/propertys.do" method="post">
					<div class="card card-block">

						<div class="form-group row">
							<label for="inputEmail3" class="col-sm-2 form-control-label">名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="name" name="name"
									placeholder="名称">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputEmail3" class="col-sm-2 form-control-label">属性一</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="pro1"
									name="pro1name" placeholder="属性一">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputEmail3" class="col-sm-2 form-control-label">属性二</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="pro2"
									name="pro2name" placeholder="属性二">
							</div>
						</div>
						<div class="form-group row ">
							<label for="inputEmail3" class="col-sm-2 form-control-label">属性三</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="pro3"
									name="pro3name" placeholder="属性三">
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2">设置说明</label>
							<div class="col-sm-10">
								<div class="radio disabled">
									<label>每组属性最多设置三个，您可以只填一个或两个</label>
								</div>
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2">设置范例</label>
							<div class="col-sm-10">
								<div class="checkbox">
									<label> <a class="nav-link" href=""> 点击查看 </a>
									</label>
								</div>
							</div>
						</div>
						<input type="submit" class="btn btn-success" value="增加">
					</div>
				</form>
			</div>
		</div>
	</div>












	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>