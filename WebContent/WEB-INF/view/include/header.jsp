<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	header{
		width: 100%;
		height: 120px;
 		position: relative; 
	}
	a#login{
		text-decoration: none;
		color: black;
 		position: absolute;
		right: 400px;
		top:80px; 		
	}
	h1{
		text-align: center;
		padding: 30px;
	}
	ul{
		width: 100%;
		height: 60px;
		list-style: none;
		background-color: red;
	}
	li{
		float: left;
		margin-left:100px; 
		line-height: 60px;
		color: white;
		text-align: center;
		font-weight: bold;
		font-size: 17px;
	}
	li:first-child{
		padding-left: 430px;
	}
	li a{
		text-decoration: none;
		color: white;
	}
</style>
	<header>
		<h1>대구 CGV</h1>
		<a href="loginForm.jsp" id="login">로그인</a>
		<ul>
			<li><a href="home.do">HOME</a></li>
			<li>|</li>
			<li><a href="list.do">상영영화</a></li>
			<li>|</li>
			<li><a href="time.do">상영시간표</a></li>
			<li>|</li>
			<li><a href="menu3.jsp">게시판</a></li>
		</ul>
	</header>