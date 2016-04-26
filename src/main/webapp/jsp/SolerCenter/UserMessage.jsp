<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/HoBuy/jsp/css4/bootstrap.css">
<style type="text/css">
body {
	font-size: 14px;
}
</style>
</head>
<body>
	<div class="card">
		<div class="card-block">

			<div class="card text-center">
				<div class="card-header card-info">评价用户</div>
				<div class="card-block">

					<div class="form-group form-inline">
						<label>用户名称：</label> ${user.name }
					</div>
					<div class="form-group form-inline">
						<label>用户手机：</label> ${user.phone }
					</div>
					<button type="submit" class=" btn btn-info btn-sm" onclick="goBack()">返回</button>
					<script>
						function goBack() {
							window.history.back()
						}
					</script>
				</div>
			</div>
		</div>
	</div>


	<!-- jQuery first, then Bootstrap JS. -->
	<script src="/HoBuy/jsp/css4/jquery.min.js"></script>
	<script src="/HoBuy/jsp/css4/bootstrap.js"></script>
</body>
</html>
