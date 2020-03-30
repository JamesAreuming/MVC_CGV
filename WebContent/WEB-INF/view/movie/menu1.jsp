<%@page import="cgv.deagu.model.Movie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="movieMgr" class="cgv.deagu.model.MovieManager" scope="application"/> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../include/header.jsp" %>
<style>
	section{
		width: 100%;
		margin-top: 43px;
		padding: 20px;
		
	}
	section div{
		width: 100%;
		height: 50px;
		text-align: center;
		line-height: 50px;
	}
	section button{
		background-color: black;
		border-radius: 5px;
		outline: none;
		border: 1px solid black;
	}
	section button a{
		text-decoration: none;
		color: white;
		font-size: 16px;
	}
	#container{
		width: 770px;
		margin: 0 auto;
	}
	.movie{
		width: 185px;
		height: 300px;
		float: left;
		margin-left: 5px;
		margin-top: 5px;
		border: 1px solid black;
	}
	.movie img{
		width: 185px;
		height: 260px;
	}
	.movie p{
		font-family: "굴림";
		font-weight: bold;
		line-height: 8px;
	}
	footer{
		clear: both;
	}
</style>
	<section>
		<div><button><a href="${pageContext.request.contextPath}/movie/regi.do">상영영화추가하기</a></button></div>
		<div id="container">
			<c:forEach var="movie" items="${list}">
				<div class="movie">
					<a href="${pageContext.request.contextPath}/movie/detail.do?no=${movie.no}"><img src="${pageContext.request.contextPath}/movieIMG/${movie.file}"></a>
					<p>${movie.name}</p>
				</div>
			</c:forEach>
		</div>
	</section>
<%@include file="../include/footer.jsp" %>