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
</head>
<body style="font-size: 16px;">

	<!-- 导航条 -->

	<jsp:include page="/jsp/nav/Nav.jsp"></jsp:include>

	<!-- 滚动屏 -->
	<div class="container">
		<c:if test="${carousels[0]!=null }">

			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">

					<c:forEach items="${carousels }" var="caro" varStatus="status">
						<c:if test="${status.first }">
							<div class="carousel-item active">
								<a
									href="/HoBuy/ProductServlet?method=showDetals&id=${caro.product.id }">
									<img src="${caro.carouselimg }" alt="First slide">
								</a>
							</div>
						</c:if>

						<c:if test="${!status.first }">
							<div class="carousel-item ">
								<a
									href="/HoBuy/product.do?id=${caro.product.id }">
									<img src="${caro.carouselimg }" alt="First slide">
								</a>
							</div>
						</c:if>
					</c:forEach>

				</div>
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span class="icon-prev"
					aria-hidden="true"></span> <span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span class="icon-next"
					aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a>
			</div>
		</c:if>
	</div>
	<br>
	<!-- 快捷分区 -->

	<div class="container">


		<div class="card card-inverse card-primary text-center">
			<div class="card-block">
				<blockquote class="card-blockquote">
					<div class="card card-block">
						<h3 class="card-title">数码</h3>
						<p class="card-text">玩、看、听、你的世界你感受</p>
						<!-- <a href="#" class="btn btn-primary">Go</a> -->
					</div>
				</blockquote>
			</div>
		</div>
		<div class="row">

			<c:forEach items="${products }" var="clo">
				<div class="col-sm-3">
					<a href="/HoBuy/product.do?id=${clo.id }">
						<div class="card">
							<img src="${clo.imgurl }" class="img-responsive"
								alt="Responsive image">
							<div class="card-block">
								<p class="card-text">${clo.name}</p>
							</div>
						</div>
					</a>
				</div>
			</c:forEach>

		</div>
		<br>

		<div class="card card-inverse card-success text-center">
			<div class="card-block">
				<blockquote class="card-blockquote">
					<div class="card card-block">
						<h3 class="card-title">手机</h3>
						<p class="card-text">华为、小米、iphone、你想要的尽在这里</p>
						<!-- <a href="#" class="btn btn-success">Go</a> -->
					</div>
				</blockquote>
			</div>
		</div>

		<div class="row">
			<c:forEach items="${phones }" var="phone">
				<div class="col-sm-3">
					<div class="card">
						<a href="/HoBuy/product.do?id=${phone.id }">
							<img src="${phone.imgurl }" class="img-responsive"
							alt="Responsive image">
						</a>
						<div class="card-block">

							<p class="card-text">
								<a
									href="/HoBuy/product.do?id=${phone.id }">${phone.name }</a>
							</p>
							<p class="card-text">${phone.introduce }</p>
							<p class="card-text">
								<small class="text-muted">${phone.subtitle }</small>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>


		<div class="card card-inverse card-info text-center">
			<div class="card-block">
				<blockquote class="card-blockquote">
					<div class="card card-block">
						<h3 class="card-title">零食</h3>
						<p class="card-text">不吃零食，不吃零食，不吃零食，重要的事情说三遍</p>
						<!-- <a href="#" class="btn btn-info">Go</a> -->
					</div>
				</blockquote>
			</div>
		</div>

		<div class="row">
			<c:forEach items="${foods}" var="food">
				<div class="col-sm-3">
					<div class="card">
						<a href="/HoBuy/product.do?id=${food.id }"> <img
							src="${food.imgurl }" class="img-responsive"
							alt="Responsive image">
						</a>
						<div class="card-block">
							<a href="/HoBuy/product.do?id=${food.id }">
								<h4 class="card-title">${food.name }</h4>
							</a>
							<p class="card-text">${food.introduce }</p>
							<p class="card-text">
								<small class="text-muted">${food.subtitle }</small>
							</p>
						</div>
					</div>

				</div>
			</c:forEach>
		</div>

		<div class="card card-inverse card-warning text-center">
			<div class="card-block">
				<blockquote class="card-blockquote">
					<div class="card card-block">
						<h3 class="card-title">美妆</h3>
						<p class="card-text">护肤、美妆，尽在这里，你在它便在</p>
						<!-- <a href="#" class="btn btn-warning">Go</a> -->
					</div>
				</blockquote>
			</div>
		</div>
		<div class="row">
			<c:forEach items="${mzs }" var="mz">
				<div class="col-sm-3">
					<div class="card">
						<div class="card-header">${mz.name }</div>
						<div class="card-block">
							<blockquote class="card-blockquote">
								<a href="/HoBuy/product.do?id=${mz.id }">
									<p>
										<img src="${mz.imgurl }" class="img-responsive"
											alt="Responsive image">
									</p>
								</a>
								<footer> <cite title="">${mz.subtitle }</cite> </footer>
							</blockquote>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>



	</div>
	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
	<hr>

	<jsp:include page="../SolerCenter/footer.jsp"></jsp:include>
</body>
</html>