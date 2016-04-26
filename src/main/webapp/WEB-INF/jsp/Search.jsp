<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="/HoBuy/jsp/css/bootstrap.min.css" rel="stylesheet">
<!-- <link href="/HoBuy/jsp/css/jumbotron.css" rel="stylesheet"> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond./HoBuy/jsp/js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<jsp:include page="/jsp/Nav.jsp"></jsp:include>

	<div class="container">
		<br>
		<div class="panel panel-success">
			<div class="panel-heading">${searchword }</div>

			<div class="panel-body">
				<div class="row">
					<c:forEach items="${products }" var="product">

						<div class="col-sm-6 col-md-2">
							<div class="thumbnail">
							<a href="/HoBuy/ProductServlet?method=showDetals&id=${product.id }">
								<img
									src="${product.img }"
									class="img-rounded">
							</a>
								<div class="caption">
									<div class="media">
										<div class="media-body">
											<h6 class="media-heading">${product.name }</h6>
											${product.price }
										</div>	
									</div>
								</div>
							</div>
						</div>
						
					</c:forEach>
				</div>
			</div>
			<div class="panel-footer">Panel footer</div>
		</div>

	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript" src="/HoBuy/jsp/js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script>
	<!-- 	<script src="/HoBuy/jsp/js/bootstrap.min.js"></script> -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
</html>