<%@page import="cgv.deagu.model.Movie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@include file="../include/header.jsp" %>
<style>
	section{
		width: 100%;
		margin-top: 43px;
		padding: 85px;
	}
	h2{
		text-align: center;
	}
	section table{
		width: 900px;
		margin: 0 auto;
		border-collapse: collapse;
		line-height: 30px;
	}
	section table td{
		border: 1px solid black;
	}
	section table td:first-child {
		font-weight: bold;
		text-align: center;
	}
</style>
<section>
	<h2> < 상 영 시 간 표 > </h2>
	<table>
		<c:forEach var="movie" items="${list}">
			<tr>
				<td>${movie.name }</td>
				<td>${movie.showTime}</td>
			</tr>
		</c:forEach>
	</table>
</section>	
<%@include file="../include/footer.jsp" %>