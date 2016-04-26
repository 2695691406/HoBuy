<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<!-- 导航条 -->

	<nav class="navbar navbar-light bg-faded"> <a
		class="navbar-brand" href="/HoBuy/index.do">HoBuy</a>
	<ul class="nav navbar-nav" style="font-size: 14px;">
		<c:if test="${user==null }">
			<li class="nav-item"><a class="nav-link" href="/HoBuy/login.do">登陆</a></li>
			<li class="nav-item"><a class="nav-link" href="/HoBuy/regist.do">注册</a></li>
		</c:if>
		<c:if test="${user!=null }">
			<li class="nav-item"><a class="nav-link" href="#">${user.name }你好</a></li>
			<li class="nav-item"><a class="nav-link" href="/HoBuy/logoffuser.do">注销</a></li>
			<li class="nav-item"><a class="nav-link" href="/HoBuy/usercenter/center.do">个人中心</a></li>
			<li class="nav-item"><a class="nav-link" href="/HoBuy/usercenter/orders.do">订单中心 </a></li>
		</c:if>
		<c:if test="${saler!=null }">
			<li class="nav-item"><a class="nav-link" href="/HoBuy/solercenter/center.do">控制台 </a></li>
		</c:if>
		<li class="nav-item"><a class="nav-link"
			href="/HoBuy/usercenter/shoppingcart.do">购物车</a></li>
	</ul>
	<form class="form-inline navbar-form pull-right"
		action="/HoBuy/search.do" >
		<input class="form-control" type="text" name="word"
			placeholder="搜索">
		<button class="btn btn-secondary " type="submit">Search</button>
	</form>
	</nav>

