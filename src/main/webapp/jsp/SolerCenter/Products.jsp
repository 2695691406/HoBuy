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
	<!-- Nav tabs -->
	<ul class="nav nav-tabs" role="tablist">
		<li class="nav-item"><a class="nav-link active"
			href="#productlist" role="tab" data-toggle="tab">商品列表</a></li>
		<li class="nav-item"><a class="nav-link" href="#productadd"
			role="tab" data-toggle="tab">增加商品</a></li>
	</ul>
	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane active" id="productlist">
			<div class="" id="collapseExample">
				<div class="card card-block">
					<script type="text/javascript">
						function Change(id) {
							var tt = document.getElementById(id);
							if (tt.getAttribute("hidden")) {
								document.getElementById(id).removeAttribute(
										"hidden");
							} else {
								document.getElementById(id).setAttribute(
										"hidden", "true")
							}
						}
					</script>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>名称</th>
								<th>简介</th>
								<th>状态</th>
								<th>图片</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>

						<tbody>
							<tr></tr>
							<c:forEach items="${products }" var="product">
								<tr>
									<td>${product.name }</td>
									<td>${product.introduce }</td>
									<td>${product.state  }</td>
									<td><img src="${product.imgurl }" alt="..."
										class="img-rounded" style="width: 50px; height: auto;">
									</td>
									<td><a class="btn btn-warning-outline btn-sm"
										onclick="Change('${product.id }-tr')">修改</a></td>
									<td><a class="btn btn-warning-outline btn-sm"
										href="/HoBuy/solercenter/productdelete.do?pid=${product.id }">删除</a></td>
								</tr>
								<tr></tr>
								<tr id="${product.id }-tr" hidden="true">
									<td colspan="6">
										<form action="/HoBuy/solercenter/productupdate.do"
											method="post" enctype="multipart/form-data">
											<div class="form-group form-inline">
												<img src="${product.imgurl }" alt="..." class="img-rounded"
													style="width: 50px; height: auto;"> <input
													type="text" name="id" value="${product.id }" hidden="true">
												<input type="text" name="name" class="form-control"
													value="${product.name }" placeholder="商品名称"> <input
													type="text" name="subtitle" class="form-control"
													value="${product.subtitle }" placeholder="小标题"> <input
													type="text" name="introduce" class="form-control"
													value="${product.introduce }" placeholder="简介"> <input
													type="checkbox" value="yes" name="changeimg">修改图片 <input
													type="file" class="form-control-file" name="img"> <input
													class="btn btn-success-outline" type="submit" value="保存">
											</div>
										</form>
									</td>
								</tr>
								<tr>
									<td colspan="6"><c:forEach items="${product.repertory }"
											var="rep">

											<div class="media">
												<div class="media-left pull-left">
													<img src="${rep.imgurl }" alt="..." class="img-rounded"
														style="width: 50px; height: auto;">
													<c:if test="${product.soler_property.pro1name!='' }">
														 ${product.soler_property.pro1name }:${rep.pro1 }
														 
														<%--  <input type="text"
															name="pro1" class="form-control" value="${rep.pro1 }"
															placeholder="${product.soler_property.pro1name }"
															style="width: 120px;"> --%>

													</c:if>
													<c:if test="${product.soler_property.pro2name!='' }">
														${product.soler_property.pro2name }: ${rep.pro2 }
														<%-- <input type="text"
															name="pro2" class="form-control" value="${rep.pro2 }"
															placeholder="${product.soler_property.pro2name }"
															style="width: 120px;"> --%>
													</c:if>
													<c:if test="${product.soler_property.pro3name!='' }">
														${product.soler_property.pro3name }: ${rep.pro3 }
														<%-- <input type="text"
															name="pro3" class="form-control" value="${rep.pro3 }"
															placeholder="${product.soler_property.pro3name }"
															style="width: 120px;"> --%>
													</c:if>
												</div>
												<div class="media-right pull-right">
													<div class="media-heading">
														<div class="form-group form-inline">
															<form action="/HoBuy/solercenter/repertoryupdate.do"
																method="post" enctype="multipart/form-data">
																<input id="${rep.id }-state" type="text" name="state"
																	value="${rep.state }" hidden="true"> <input
																	type="text" name="id" value="${rep.id }" hidden="true">
																售价: <input type="text" name="price"
																	class="form-control btn-sm" value="${rep.price }"
																	placeholder="售价" style="width: 80px;"> 促銷价: <input
																	type="text" name="bid" class="form-control btn-sm"
																	value="${rep.bid }" placeholder="售价"
																	style="width: 80px;"> 库存:<input type="text"
																	name="repertory_nubmer" class="form-control btn-sm"
																	value="${rep.repertory_nubmer }" placeholder="库存"
																	style="width: 80px;">
																<!-- 	修改图片 <input
													type="file" class="form-control-file" name="img"> -->
																<input class="btn btn-success btn-sm" type="submit"
																	value="修改"> <input
																	class="btn btn-success btn-sm" type="submit"
																	onclick="repertory('del','${rep.id}-state')" value="下架">
																<c:if test="${rep.state!=2 }">
																	<input class="btn btn-success btn-sm" type="submit"
																		onclick="repertory('sole','${rep.id}-state')"
																		value="促销">
																</c:if>

																<c:if test="${rep.state==2 }">
																	<input class="btn btn-warning btn-sm" type="submit"
																		onclick="repertory('stop','${rep.id}-state')"
																		value="止促">
																</c:if>
															</form>
														</div>


													</div>
												</div>
											</div>
										</c:forEach></td>
								</tr>

							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>

		</div>
		<!-- jQuery first, then Bootstrap JS. -->
		<script src="/HoBuy/jsp/js/jquery.min.js"></script>
		<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
		<script type="text/javascript">
			function repertory(type, id) {
				if (type == 'del') {
					document.getElementById(id).value = "0";
					alert(123);
				} else if (type == 'sole') {
					document.getElementById(id).value = "2";
				} else if (type == 'stop') {
					document.getElementById(id).value = "1";
				}
			}
			function ShowSelect(op) {
				var parentid = op.value;
				if (parentid != 'null') {
					var list1 = document.getElementById("secondlevel")
							.getElementsByTagName("option");
					for (var i = 0; i < list1.length; i++) {
						var node = list1.item(i);
						node.removeAttribute("hidden")
						node.setAttribute("hidden", "true")
						if (node.getAttribute("parent") == parentid) {
							node.removeAttribute("hidden")
						}
					}
					document.getElementById("op_null")
							.removeAttribute("hidden");
					document.getElementById("op_null").value = parentid;
					document.getElementById("op_null").setAttribute("selected",
							"selected")
				}
			}
		</script>
		<script type="text/javascript">
		<!--
			//-->
			function addtr() {
				var pro_group = document.getElementById("pro_tbody");
				var pro_tr = document.getElementById("pro_tr").cloneNode(true);
				pro_tr.removeAttribute("id")
				pro_tr.removeAttribute("hidden")
				pro_group.appendChild(pro_tr);
			}
			function submit_f() {
				var pro_group = document.getElementById("pro_tbody");
				var pro_tr = document.getElementById("pro_tr");
				pro_group.removeChild(pro_tr);
				return ture;
			}
			$(function() {
				$("#pro_group").change(function() {
					var pro = $("#pro_group").val();
					var option = {
						url : "getproperty.do",
						type : "post",
						dataType : "text",
						data : {
							proid : pro
						},
						success : function(response) {
							var res = JSON.parse(response)
							if (res.pro1name != null) {
								$("[tg='pro1s']").removeAttr("hidden");
								$("#pro1name").removeAttr("hidden");
								$("#pro1name").empty();
								$("#pro1name").append(res.pro1name);
							} else {
								$("[tg='pro1s']").attr("hidden", "true");
								$("#pro1name").attr("hidden", "true");
								$("#pro1name").empty();

							}
							if (res.pro2name != null) {
								$("#pro2name").removeAttr("hidden");
								$("[tg='pro2s']").removeAttr("hidden");
								$("#pro2name").empty();
								$("#pro2name").append(res.pro2name);
							} else {
								$("#pro2name").attr("hidden", "true");
								$("[tg='pro2s']").attr("hidden", "true");
								$("#pro2name").empty();
							}
							if (res.pro3name != null) {
								$("#pro3name").removeAttr("hidden");
								//alert(pro3name);
								$("[tg='pro3s']").removeAttr("hidden");
								$("#pro3name").empty();
								$("#pro3name").append(res.pro3name);
							} else {
								$("#pro3name").attr("hidden", "true");
								//alert(pro3name+"else");
								$("[tg='pro3s']").attr("hidden", "true");
								$("#pro3name").empty();
							}
						},
						error : function() {
							alert("系统错误");
						}
					};
					$.ajax(option);
				});
				$("#name")
						.change(
								function() {
									var name = $("#name").val();
									if (name
											.match("[A-Za-z0-9\u4e00-\u9fa5\\s]{1,16}") != null) {
										$("#namediv").removeClass("has-error");
										$("#namediv").addClass("has-success");
										$("#namemsg").empty();
										$("#namemsg").removeClass(
												"label-danger");
										return true;
									} else {
										$("#namediv")
												.removeClass("has-success");
										$("#namediv").addClass("has-error");
										$("#namemsg").empty();
										$("#namemsg").addClass("label-danger");
										$("#namemsg").append("姓名格式错误");
										return false;
									}

								});
				$("#p_submit").click(function() {
					if (!$("#name").change()) {
						return false;
					} else {
						submit_f();
						return true;
					}

				})
			});
		</script>
		<div role="tabpanel" class="tab-pane" id="productadd">
			<div>
				<form action="/HoBuy/solercenter/products.do" method="post"
					enctype="multipart/form-data">

					<div class="card card-block">
						<div class="form-group row">
							<label class="col-sm-2">设置说明</label>
							<div class="col-sm-10">
								<div class="radio disabled">
									<label style="color: red;">请您注意，建议您增加“无”属性组，因为默认不会为商家增加无属性组</label>
								</div>
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-2 form-control-label">名称</label>
							<div class="col-sm-10" id="namediv">
								<input type="text" class="form-control" id="name" name="name"
									placeholder="名称">
								<h6>
									<span id="namemsg" class="label label-danger">${namemsg }</span>
								</h6>
							</div>
						</div>
						<div class="form-group row ">
							<label class="col-sm-2 form-control-label">简介</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="introduce"
									placeholder="简介	">
							</div>
						</div>

						<div class="form-group row ">
							<label class="col-sm-2 form-control-label">屬性組</label>
							<div class="col-sm-10">
								<select class="form-control " id="pro_group" name="pro_id">
									<c:forEach items="${properties }" var="pro">
										<option value="${pro.id }">${pro.name }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2 form-control-label">类别</label>
							<div class="col-sm-10 form-inline">
								<select class="form-control " id="exampleSelect1"
									onchange="ShowSelect(this)">
									<option value="0">请选择</option>
									<c:forEach items="${parents }" var="cla">
										<option value="${cla.id }">${cla.name }</option>
									</c:forEach>
								</select> <select class="form-control " id="secondlevel" name="clazz_id">
									<option value="0" id="op_null" selected="selected">请选择</option>
									<c:forEach items="${chidsmap }" var="map">
										<c:forEach items="${map.value }" var="cla">
											<option value="${cla.id }" id="${cla.id }"
												parent="${map.key }" hidden="true">${cla.name }</option>
										</c:forEach>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group row ">
							<label class="col-sm-2 form-control-label">图片</label>
							<div class="col-sm-10">
								<input type="file" class="form-control-file" name="img">
							</div>
						</div>
						<script type="text/javascript">
							function addimg() {
								var vimg = document.getElementById("imggroup");
								var vparent = vimg.parentNode;
								var vchild = vimg.cloneNode(true);
								vchild.removeAttribute("id");
								vchild.removeAttribute("value");
								vparent.appendChild(vchild);
							}
						</script>
						<div class="form-group row ">
							<label class="col-sm-2 form-control-label">图片简介组</label>
							<div class="col-sm-10">
								<input type="button" class="btn btn-info-outline btn-sm"
									value="增加图片" onclick="addimg()" /> <input id="imggroup"
									type="file" class="form-control-file" name="imggroup">
							</div>
						</div>



						<div class="form-group row">
							<div class="col-sm-12	">

								<table class="table table-striped">
									<thead>
										<tr>
											<th>增加</th>
											<th id="pro1name" hidden="true"></th>
											<th id="pro2name" hidden="true"></th>
											<th id="pro3name" hidden="true"></th>
											<th>售价</th>
											<th>商品图片</th>
											<th>库存</th>
										</tr>
									</thead>


									<tbody id="pro_tbody">
										<tr id="pro_tr" hidden="true">
											<td><button type="button" class="btn btn-info"
													onclick="addtr()">+</button></td>
											<td tg="pro1s" hidden="true"><input type="text"
												class="form-control" name="pro1s" placeholder="" value=""></td>
											<td tg="pro2s" hidden="true"><input type="text"
												class="form-control" name="pro2s" placeholder="" value=""></td>
											<td tg="pro3s" hidden="true"><input type="text"
												class="form-control" name="pro3s" placeholder="" value=""></td>
											<td>
												<div class="col-sm-10" tg="pricediv">
													<input type=text class="form-control" name="prices"
														tg="price" placeholder="0.0" value="0.0">
													<h6>
														<span tg="pricemsg" class="label label-danger">${pricemsg }</span>
													</h6>
												</div>
											</td>
											<td><input type="file" class="form-control-file"
												name="imgs" onselect="ShowImg(this)"></td>
											<td><input type="text" class="form-control"
												name="repertory_nubme" placeholder="库存数量" value="0"></td>
										</tr>
										<tr>
											<td><button type="button" class="btn btn-info"
													onclick="addtr()">+</button></td>
											<td tg="pro1s" hidden="true"><input type="text"
												class="form-control" name="pro1s" placeholder="" value=""></td>
											<td tg="pro2s" hidden="true"><input type="text"
												class="form-control" name="pro2s" placeholder="" value=""></td>
											<td tg="pro3s" hidden="true"><input type="text"
												class="form-control" name="pro3s" placeholder="" value=""></td>
											<td><input type=text class="form-control" name="prices"
												placeholder="售价" value="0.0"></td>
											<td><input type="file" class="form-control-file"
												name="imgs" onselect="ShowImg(this)"></td>
											<td><input type="text" class="form-control"
												name="repertory_nubme" placeholder="库存数量" value="0"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>



						<input type="submit" class="btn btn-success" id="p_submit"
							value="增加">
					</div>
				</form>
			</div>
		</div>
	</div>





</body>
</html>